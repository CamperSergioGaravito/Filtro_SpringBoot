package com.filtro.inmuebles.controllers.crear;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

import org.springframework.dao.DataAccessException;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.filtro.inmuebles.repository.enums.TipoPiso;
import com.filtro.inmuebles.repository.model.dto.CasaDTO;
import com.filtro.inmuebles.repository.model.dto.LocalDTO;
import com.filtro.inmuebles.repository.model.dto.VillaDTO;
import com.filtro.inmuebles.repository.model.dto.crear.InmuebleDTOcrear;
import com.filtro.inmuebles.services.inmueble.InmuebleServices;
import com.filtro.inmuebles.util.exceptions.ManagerAccessExcep;

import jakarta.validation.Valid;
import lombok.AllArgsConstructor;

import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;

@AllArgsConstructor

@RestController
@RequestMapping("/api/v1/{rol}/crear")
public class CrearController {

    private final InmuebleServices inmuebleServices;

    @PostMapping("/inmueble")
    public ResponseEntity<Map<String, Object>> crearInmueble(@Valid @RequestBody InmuebleDTOcrear inmuebleDTOcrear,
            BindingResult result) {

        
        Map<String, Object> response = new HashMap<>();
        String tipoPiso = inmuebleDTOcrear.getTipoPiso().toUpperCase();

        if (result.hasErrors()) {
            List<String> errors = result.getFieldErrors()
                    .stream()
                    .map(
                            error -> error.getField() + " " + error.getDefaultMessage())
                    .collect(Collectors.toList());

            response.put("Errores", errors);
            return new ResponseEntity<>(response, HttpStatus.BAD_REQUEST);
        }

        try {

            if(TipoPiso.exists(tipoPiso)) {

                switch (tipoPiso) {
                    case "LOCAL":
                        LocalDTO localDTO = inmuebleServices.crearLocal(inmuebleDTOcrear);
                        response.put("Mensaje", "El local fue creado con éxito.");
                        response.put("inmueble", localDTO);
                        break;
    
                    case "VILLA":
                        VillaDTO villaDTO = inmuebleServices.crearVilla(inmuebleDTOcrear);
                        response.put("Mensaje", "La villa fue creada con éxito.");
                        response.put("inmueble", villaDTO);
                        break;
    
                    case "NUEVO", "OCASION", "CASA":
                        CasaDTO casa = inmuebleServices.crearCasaPisoOcasion(inmuebleDTOcrear);
                        response.put("Mensaje", "El inmueble (" + tipoPiso + ") fue creado con éxito.");
                        response.put("inmueble", casa);
                        break;
                
                    default:
                        throw new ManagerAccessExcep("Tipo de piso", new Throwable(" El tipo " + tipoPiso + " no existe"));
                }
            }
            else {
                throw new ManagerAccessExcep("Tipo piso", new Throwable(" " + tipoPiso + " no existe"));
            }

        } catch (DataAccessException e) {
            response.put("Mensaje", "No se pudo completar la creación del inmueble");
            response.put("Error", e.getMessage().concat(":").concat(e.getMostSpecificCause().getMessage()));
            return new ResponseEntity<>(response, HttpStatus.INTERNAL_SERVER_ERROR);
        }

        return new ResponseEntity<>(response, HttpStatus.OK);

    }
    
}

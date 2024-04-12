package com.filtro.inmuebles.controllers.buscar;

import org.springframework.web.bind.annotation.RestController;

import com.filtro.inmuebles.repository.entities.Casa;
import com.filtro.inmuebles.repository.model.dto.CasaDTO;
import com.filtro.inmuebles.repository.model.dto.LocalDTO;
import com.filtro.inmuebles.repository.model.dto.VillaDTO;
import com.filtro.inmuebles.services.inmueble.InmuebleServices;
import com.filtro.inmuebles.util.exceptions.ManagerAccessExcep;

import lombok.AllArgsConstructor;

import org.springframework.web.bind.annotation.RequestMapping;

import java.util.HashMap;
import java.util.Map;

import org.springframework.dao.DataAccessException;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

@AllArgsConstructor

@RestController
@RequestMapping("/api/v1/{rol}/buscar")

public class getController {

    private final InmuebleServices inmuebleServices;

    @GetMapping("/inmueble/{tipoPiso}/{referencia}")
    public ResponseEntity<Map<String, Object>> getMethodName(@PathVariable String tipoPiso, @PathVariable int referencia) {
        
        Map<String, Object> response = new HashMap<>();

        try {
            switch (tipoPiso.toUpperCase()) {
                case "LOCAL":
                    LocalDTO localDTO = inmuebleServices.buscarLocal(referencia);
                    response.put("Mensaje", "El local fue encontrado con éxito.");
                    response.put("inmueble", localDTO);
                    break;

                case "VILLA":
                    VillaDTO villaDTO = inmuebleServices.buscarVilla(referencia);
                    response.put("Mensaje", "La villa fue encontrado con éxito.");
                    response.put("inmueble", villaDTO);
                    break;

                case "NUEVO", "OCASION", "CASA":
                    CasaDTO casa = inmuebleServices.buscarCasaPisoOcasion(referencia);
                    response.put("Mensaje", "El inmueble (" + tipoPiso + ") fue encontrado con éxito.");
                    response.put("inmueble", casa);
                    break;
            
                default:
                    throw new ManagerAccessExcep("Tipo de piso", new Throwable(" El tipo " + tipoPiso + " no existe"));
            }

        } catch (DataAccessException e) {
            response.put("Mensaje", "No se pudo completar la búsqueda del inmueble");
            response.put("Error", e.getMessage().concat(":").concat(e.getMostSpecificCause().getMessage()));
            return new ResponseEntity<>(response, HttpStatus.INTERNAL_SERVER_ERROR);
        }

        return new ResponseEntity<>(response, HttpStatus.OK);
    }
    
    
}

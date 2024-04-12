package com.filtro.inmuebles.services.inmueble.imp;

import org.springframework.stereotype.Service;

import com.filtro.inmuebles.components.converters.InmueblesConvert;
import com.filtro.inmuebles.repository.LocalRepository;
import com.filtro.inmuebles.repository.entities.Casa;
import com.filtro.inmuebles.repository.entities.Local;
import com.filtro.inmuebles.repository.entities.Propietario;
import com.filtro.inmuebles.repository.entities.Zona;
import com.filtro.inmuebles.repository.enums.TipoPiso;
import com.filtro.inmuebles.repository.enums.TipoServicio;
import com.filtro.inmuebles.repository.model.dto.LocalDTO;
import com.filtro.inmuebles.repository.model.dto.VillaDTO;
import com.filtro.inmuebles.repository.model.dto.crear.InmuebleDTOcrear;
import com.filtro.inmuebles.services.inmueble.InmuebleServices;
import com.filtro.inmuebles.services.propietario.imp.PropietarioServiceImpPriv;
import com.filtro.inmuebles.services.zona.ZonaServicePriv;
import com.filtro.inmuebles.util.exceptions.ManagerAccessExcep;

import jakarta.transaction.Transactional;
import lombok.AllArgsConstructor;

@AllArgsConstructor

@Service
public class InmuebleServiceImp implements InmuebleServices {

    private final LocalRepository localRepository;
    private final InmueblesConvert inmueblesConvert;
    // Privados
    private final PropietarioServiceImpPriv propietarioServiceImpPriv;
    private final ZonaServicePriv zonaServicePriv;

    @Transactional
    @Override
    public LocalDTO crearLocal(InmuebleDTOcrear inmuebleDTOcrear) throws ManagerAccessExcep {
        String tipoServicio = inmuebleDTOcrear.getTipoServicio().toUpperCase();
        
        if(TipoPiso.exists(inmuebleDTOcrear.getTipoPiso().toUpperCase())) {
            if (TipoServicio.exists(tipoServicio)) {
                Propietario propietario = propietarioServiceImpPriv.findByCedula(
                        inmuebleDTOcrear.getPropietario());
    
                Zona zona = zonaServicePriv.buscarCodigo(
                        inmuebleDTOcrear.getZona());
    
                if(zona == null) {
                    throw new ManagerAccessExcep("Zona", new Throwable(" " + inmuebleDTOcrear.getZona() + " no se encuentra registrada"));
                }
                else {
                    return inmueblesConvert.entityToLocalDto(
                        localRepository.save(
                                inmueblesConvert.crearLocalToLocal(inmuebleDTOcrear, propietario, zona)));
                }
    
            } else {
                throw new ManagerAccessExcep("Tipo de servicio",
                        new Throwable(" El servicio de " + inmuebleDTOcrear.getTipoServicio() + " no existe."));
            }
        }
        else {
            throw new ManagerAccessExcep("Tipo piso", new Throwable(" " + inmuebleDTOcrear.getTipoPiso() + " no existe"));
        }

    }

    @Transactional
    @Override
    public VillaDTO crearVilla(InmuebleDTOcrear inmuebleDTOcrear) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'crearVilla'");
    }

    @Transactional
    @Override
    public Casa crearCasaPisoOcasion(InmuebleDTOcrear inmuebleDTOcrear) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'crearCasaPisoOcasion'");
    }

}
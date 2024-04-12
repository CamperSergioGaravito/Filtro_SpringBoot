package com.filtro.inmuebles.services.inmueble;

import com.filtro.inmuebles.repository.entities.Casa;
import com.filtro.inmuebles.repository.model.dto.LocalDTO;
import com.filtro.inmuebles.repository.model.dto.VillaDTO;
import com.filtro.inmuebles.repository.model.dto.crear.InmuebleDTOcrear;

public interface InmuebleServices {

    LocalDTO crearLocal(InmuebleDTOcrear inmuebleDTOcrear);

    VillaDTO crearVilla(InmuebleDTOcrear inmuebleDTOcrear);

    Casa crearCasaPisoOcasion(InmuebleDTOcrear inmuebleDTOcrear);
    
}

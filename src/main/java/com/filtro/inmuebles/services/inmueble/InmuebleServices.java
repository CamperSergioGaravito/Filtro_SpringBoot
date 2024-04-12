package com.filtro.inmuebles.services.inmueble;

import com.filtro.inmuebles.repository.entities.Casa;
import com.filtro.inmuebles.repository.model.dto.CasaDTO;
import com.filtro.inmuebles.repository.model.dto.LocalDTO;
import com.filtro.inmuebles.repository.model.dto.VillaDTO;
import com.filtro.inmuebles.repository.model.dto.crear.InmuebleDTOcrear;

public interface InmuebleServices {

    LocalDTO crearLocal(InmuebleDTOcrear inmuebleDTOcrear);

    VillaDTO crearVilla(InmuebleDTOcrear inmuebleDTOcrear);

    CasaDTO crearCasaPisoOcasion(InmuebleDTOcrear inmuebleDTOcrear);

    LocalDTO buscarLocal(int referencia);

    VillaDTO buscarVilla(int referencia);

    CasaDTO buscarCasaPisoOcasion(int referencia);
    
}

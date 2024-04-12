package com.filtro.inmuebles.components.converters;

import org.modelmapper.ModelMapper;
import org.springframework.stereotype.Component;

import com.filtro.inmuebles.repository.entities.Local;
import com.filtro.inmuebles.repository.entities.Propietario;
import com.filtro.inmuebles.repository.entities.Zona;
import com.filtro.inmuebles.repository.enums.TipoPiso;
import com.filtro.inmuebles.repository.enums.TipoServicio;
import com.filtro.inmuebles.repository.model.dto.LocalDTO;
import com.filtro.inmuebles.repository.model.dto.crear.InmuebleDTOcrear;

import lombok.AllArgsConstructor;

@AllArgsConstructor
@Component
public class InmueblesConvert {

    private final ModelMapper model;

    public Local crearLocalToLocal(InmuebleDTOcrear inmuebleDTOcrear, Propietario propietario, Zona zona) {
        Local local = model.map(inmuebleDTOcrear, Local.class);

        local.setTipoPiso(TipoPiso.valueOf(
                inmuebleDTOcrear.getTipoPiso().toUpperCase()));
        local.setTipoServicio(TipoServicio.valueOf(
                inmuebleDTOcrear.getTipoServicio().toUpperCase()));
        local.setPropietario(propietario);
        local.setZona(zona);

        return local;
    }

    public LocalDTO entityToLocalDto(Local local) {
        LocalDTO localDTO = model.map(local, LocalDTO.class);

        return localDTO;
    }

}

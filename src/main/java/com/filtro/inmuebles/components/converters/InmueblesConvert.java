package com.filtro.inmuebles.components.converters;

import org.modelmapper.ModelMapper;
import org.springframework.stereotype.Component;

import com.filtro.inmuebles.repository.entities.Casa;
import com.filtro.inmuebles.repository.entities.Local;
import com.filtro.inmuebles.repository.entities.Propietario;
import com.filtro.inmuebles.repository.entities.Villa;
import com.filtro.inmuebles.repository.entities.Zona;
import com.filtro.inmuebles.repository.enums.TipoPiso;
import com.filtro.inmuebles.repository.enums.TipoServicio;
import com.filtro.inmuebles.repository.model.dto.CasaDTO;
import com.filtro.inmuebles.repository.model.dto.LocalDTO;
import com.filtro.inmuebles.repository.model.dto.VillaDTO;
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

        local.setReferencia();

        return local;
    }

    public Villa crearVillaToVilla(InmuebleDTOcrear inmuebleDTOcrear, Propietario propietario){
        Villa villa = model.map(inmuebleDTOcrear, Villa.class);
        
        villa.setSizeParcela(
            inmuebleDTOcrear.getSizeParcela()
        );

        villa.setPropietario(propietario);

        villa.setReferencia();

        return villa;

    }

    public LocalDTO entityToLocalDto(Local local) {
        LocalDTO localDTO = model.map(local, LocalDTO.class);

        return localDTO;
    }

    public VillaDTO entityToVillaDto(Villa local) {
        VillaDTO villa = model.map(local, VillaDTO.class);

        return villa;
    }

    public Casa crearCasaToCasa(InmuebleDTOcrear inmuebleDTOcrear, Propietario propietario, Zona zona) {
        Casa casa = model.map(inmuebleDTOcrear, Casa.class);

        casa.setTipoPiso(TipoPiso.valueOf(
                inmuebleDTOcrear.getTipoPiso().toUpperCase()));
        casa.setTipoServicio(TipoServicio.valueOf(
                inmuebleDTOcrear.getTipoServicio().toUpperCase()));
        casa.setPropietario(propietario);
        casa.setZona(zona);

        casa.setReferencia();

        return casa;
    }

    public CasaDTO entityToCasaDto(Casa casa) {
        CasaDTO casaDTO = model.map(casa, CasaDTO.class);

        return casaDTO;
    }

}

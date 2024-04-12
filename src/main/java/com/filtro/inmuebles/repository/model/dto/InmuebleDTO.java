package com.filtro.inmuebles.repository.model.dto;

import com.filtro.inmuebles.repository.enums.TipoPiso;
import com.filtro.inmuebles.repository.enums.TipoServicio;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter

public abstract class InmuebleDTO {

    private long referencia;

    PropietarioDTO propietario;

    private String direccion;

    private TipoPiso tipoPiso;

    private double valor;

    private double superficie;

    private TipoServicio tipoServicio;
    
}

package com.filtro.inmuebles.repository.model.dto;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;


@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor

public class VillaDTO extends InmuebleDTO  {

    private double sizeParcela;

    private int habitaciones;

    private int banios;

    private int aseos;

    private int cocinas;

    private boolean gasNatural;

    private boolean luz;

    private boolean puertaBlindada;

    private boolean parqueadero;
    
}

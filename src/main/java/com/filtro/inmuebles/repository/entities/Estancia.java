package com.filtro.inmuebles.repository.entities;

import jakarta.persistence.MappedSuperclass;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Setter
@Getter
@AllArgsConstructor
@NoArgsConstructor

@MappedSuperclass
public abstract class Estancia extends Inmueble {

    private int habitaciones;

    private int banios;

    private int aseos;

    private int cocinas;

    private boolean gasNatural;

    private boolean luz;

    private boolean puertaBlindada;

    private boolean parqueadero;

   
    
}

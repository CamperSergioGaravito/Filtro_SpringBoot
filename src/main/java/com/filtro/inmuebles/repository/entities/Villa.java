package com.filtro.inmuebles.repository.entities;

import jakarta.persistence.Column;
import jakarta.persistence.DiscriminatorValue;
import jakarta.persistence.Entity;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;


@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor

@Entity
@DiscriminatorValue("Villa")
public class Villa extends Inmueble {

    @Column(name = "tamano_parcela")
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

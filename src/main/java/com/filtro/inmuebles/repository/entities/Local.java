package com.filtro.inmuebles.repository.entities;

import jakarta.persistence.DiscriminatorValue;
import jakarta.persistence.Entity;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@AllArgsConstructor
@NoArgsConstructor
@Setter
@Getter

@Entity
@DiscriminatorValue("Local")
/* @Table(name = "Locales") */
public class Local extends Inmueble {

    private int cantidadPuertasEntrada;

    private boolean diafino;

    private boolean acondicionado;

    @ManyToOne
    @JoinColumn(
        name = "zona_id"
    )
    private Zona zona;

}

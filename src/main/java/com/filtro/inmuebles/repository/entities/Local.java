package com.filtro.inmuebles.repository.entities;

import com.filtro.inmuebles.repository.enums.TipoPiso;
import com.filtro.inmuebles.repository.enums.TipoServicio;

import jakarta.persistence.DiscriminatorValue;
import jakarta.persistence.Entity;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;
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

    public Local(long referencia, Propietario propietario, String direccion, TipoPiso tipoPiso, double valor,
            double superficie, TipoServicio tipoServicio, int cantidadPuertasEntrada, boolean diafino,
            boolean acondicionado, Zona zona) {
        super(referencia, propietario, direccion, tipoPiso, valor, superficie, tipoServicio);
        this.cantidadPuertasEntrada = cantidadPuertasEntrada;
        this.diafino = diafino;
        this.acondicionado = acondicionado;
        this.zona = zona;
    }

    
    
}

package com.filtro.inmuebles.repository.entities;

import jakarta.persistence.DiscriminatorValue;
import jakarta.persistence.Entity;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter

@Entity
@DiscriminatorValue("Casa")
public class Casa extends Estancia {
    
    @ManyToOne
    @JoinColumn(
        name = "zona_id"
    )
    private Zona zona;

    public Casa(int habitaciones, int banios, int aseos, int cocinas, boolean gasNatural, boolean luz,
            boolean puertaBlindada, boolean parqueadero, Zona zona) {
        super(habitaciones, banios, aseos, cocinas, gasNatural, luz, puertaBlindada, parqueadero);
        this.zona = zona;
    }

    

}

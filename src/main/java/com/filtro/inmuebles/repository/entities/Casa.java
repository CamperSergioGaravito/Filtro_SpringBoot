package com.filtro.inmuebles.repository.entities;

import jakarta.persistence.DiscriminatorValue;
import jakarta.persistence.Entity;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor

@Entity
@DiscriminatorValue("Casa")
public class Casa extends Inmueble {
    
    @ManyToOne
    @JoinColumn(
        name = "zona_id"
    )
    private Zona zona;

    

}

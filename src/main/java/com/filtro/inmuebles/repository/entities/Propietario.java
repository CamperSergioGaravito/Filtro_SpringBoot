package com.filtro.inmuebles.repository.entities;

import jakarta.persistence.Entity;
import jakarta.persistence.Table;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter

@Entity
@Table(name = "Propietarios")
public class Propietario extends Persona {

    private String telefono;
    
}

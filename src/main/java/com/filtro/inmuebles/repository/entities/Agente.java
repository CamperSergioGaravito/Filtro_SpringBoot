package com.filtro.inmuebles.repository.entities;

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
@Getter
@Setter

@Entity
@Table(name = "Agentes")
public class Agente extends Persona {

    @ManyToOne
    @JoinColumn(
        name = "oficina_id"
    )
    Oficina oficina;
    
}

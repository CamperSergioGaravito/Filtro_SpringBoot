package com.filtro.inmuebles.repository.model.dto;

import java.io.Serializable;

import com.filtro.inmuebles.repository.enums.Roles;

import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor

public class RolDTO implements Serializable {
    
    private Roles nombre;
    
    private String descripcion;

    public RolDTO(Roles nombre, String descripcion) {
        this.nombre = nombre;
        this.descripcion = descripcion;
    }
    
}

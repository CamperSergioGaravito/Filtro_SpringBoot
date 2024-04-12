package com.filtro.inmuebles.repository.model.dto;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter

public class ZonaDTO {

    private long id;

    private int codigo;

    private String nombre;

    private CiudadDTO ciudad;
    
}

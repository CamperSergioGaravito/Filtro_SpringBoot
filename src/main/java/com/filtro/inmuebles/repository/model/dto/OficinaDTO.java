package com.filtro.inmuebles.repository.model.dto;

import java.util.List;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@AllArgsConstructor
@NoArgsConstructor
@Data

public class OficinaDTO {

    private String nombre;

    private int codigo;

    private List<PropietarioDTO> propietarios;
    
}

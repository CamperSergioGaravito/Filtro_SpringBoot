package com.filtro.inmuebles.repository.model.dto;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor

public class CasaDTO extends InmuebleDTO {
    
    private ZonaDTO zona;

}

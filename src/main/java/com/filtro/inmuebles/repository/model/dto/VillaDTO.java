package com.filtro.inmuebles.repository.model.dto;

import lombok.Getter;
import lombok.Setter;


@Getter
@Setter

public class VillaDTO extends EstanciaDTO  {

    private double sizeParcela;

    public VillaDTO(int habitaciones, int banios, int aseos, int cocinas, boolean gasNatural, boolean luz,
            boolean puertaBlindada, boolean parqueadero, double sizeParcela) {
        super(habitaciones, banios, aseos, cocinas, gasNatural, luz, puertaBlindada, parqueadero);
        this.sizeParcela = sizeParcela;
    }

    
    
}

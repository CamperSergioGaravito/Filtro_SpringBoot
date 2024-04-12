package com.filtro.inmuebles.repository.model.dto;

import com.filtro.inmuebles.repository.enums.TipoPiso;
import com.filtro.inmuebles.repository.enums.TipoServicio;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@AllArgsConstructor
@NoArgsConstructor
@Setter
@Getter

public class LocalDTO extends InmuebleDTO {

    private int cantidadPuertasEntrada;

    private boolean diafino;

    private boolean acondicionado;

    private ZonaDTO zona;

    public LocalDTO(long referencia, PropietarioDTO propietario, String direccion, TipoPiso tipoPiso, double valor,
            double superficie, TipoServicio tipoServicio, int cantidadPuertasEntrada, boolean diafino,
            boolean acondicionado, ZonaDTO zona) {
        super(referencia, propietario, direccion, tipoPiso, valor, superficie, tipoServicio);
        this.cantidadPuertasEntrada = cantidadPuertasEntrada;
        this.diafino = diafino;
        this.acondicionado = acondicionado;
        this.zona = zona;
    }

    
    
}

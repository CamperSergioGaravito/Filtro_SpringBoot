package com.filtro.inmuebles.repository.model.dto;

import com.filtro.inmuebles.repository.enums.TipoPiso;
import com.filtro.inmuebles.repository.enums.TipoServicio;

import jakarta.persistence.MappedSuperclass;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

@AllArgsConstructor
@Setter
@Getter

@MappedSuperclass
public abstract class EstanciaDTO extends InmuebleDTO {

    private int habitaciones;

    private int banios;

    private int aseos;

    private int cocinas;

    private boolean gasNatural;

    private boolean luz;

    private boolean puertaBlindada;

    private boolean parqueadero;

    public EstanciaDTO(long referencia, PropietarioDTO propietario, String direccion, TipoPiso tipoPiso, double valor,
            double superficie, TipoServicio tipoServicio, int habitaciones, int banios, int aseos, int cocinas,
            boolean gasNatural, boolean luz, boolean puertaBlindada, boolean parqueadero) {
        super(referencia, propietario, direccion, tipoPiso, valor, superficie, tipoServicio);
        this.habitaciones = habitaciones;
        this.banios = banios;
        this.aseos = aseos;
        this.cocinas = cocinas;
        this.gasNatural = gasNatural;
        this.luz = luz;
        this.puertaBlindada = puertaBlindada;
        this.parqueadero = parqueadero;
    }

    
    
}

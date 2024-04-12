package com.filtro.inmuebles.repository.model.dto.crear;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@AllArgsConstructor
@NoArgsConstructor
@Data

public class InmuebleDTOcrear {
    
    private long propietario;

    private String direccion;

    private String tipoPiso;

    private double valor;

    private double superficie;

    private String tipoServicio;

    private int cantidadPuertasEntrada;

    private boolean diafino;

    private boolean acondicionado;

    private int zona;

    private double sizeParcela;

    private int habitaciones;

    private int banios;

    private int aseos;

    private int cocinas;

    private boolean gasNatural;

    private boolean luz;

    private boolean puertaBlindada;

    private boolean parqueadero;

}

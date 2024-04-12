package com.filtro.inmuebles.repository.enums;

import java.util.Arrays;

public enum TipoServicio {
    VENTA,
    ALQUILER,
    AMBOS;

    public static boolean exists(String value) {
        return Arrays.stream(TipoServicio.values())
                .anyMatch(tipo -> tipo.name().equalsIgnoreCase(value));
    }

}

package com.filtro.inmuebles.repository.enums;

import java.util.Arrays;

public enum TipoPiso {
    NUEVO,
    OCASION,
    VILLA,
    CASA,
    LOCAL;

    public static boolean exists(String value) {
        return Arrays.stream(TipoPiso.values())
                .anyMatch(tipo -> tipo.name().equalsIgnoreCase(value));
    }

}

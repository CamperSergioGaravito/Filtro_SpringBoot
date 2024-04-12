package com.filtro.inmuebles.repository.enums;

import java.util.Arrays;

public enum Roles {
    ADMIN,
    USER;

    public static boolean exists(String value) {
        return Arrays.stream(Roles.values())
                .anyMatch(role -> role.name().equalsIgnoreCase(value));
    }

}

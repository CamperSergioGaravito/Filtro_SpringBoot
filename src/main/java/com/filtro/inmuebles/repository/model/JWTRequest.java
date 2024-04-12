package com.filtro.inmuebles.repository.model;

import lombok.Data;

@Data
public class JWTRequest {

    private String username;
    private String password;
}

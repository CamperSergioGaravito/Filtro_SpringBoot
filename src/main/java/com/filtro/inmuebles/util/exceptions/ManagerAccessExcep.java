package com.filtro.inmuebles.util.exceptions;

import org.springframework.dao.DataAccessException;

public class ManagerAccessExcep extends DataAccessException {

    public ManagerAccessExcep(String msg, Throwable cause) {
        super(msg, cause);
    }
    
}

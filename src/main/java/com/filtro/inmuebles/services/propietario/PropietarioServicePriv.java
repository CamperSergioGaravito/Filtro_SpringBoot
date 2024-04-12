package com.filtro.inmuebles.services.propietario;

import java.util.List;

import com.filtro.inmuebles.repository.entities.Propietario;

public interface PropietarioServicePriv {
    
    Propietario findByCedula(long cedula);

    Propietario findByEmail(String findByEmail);

    List<Propietario> findAll();

}

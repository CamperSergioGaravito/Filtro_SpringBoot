package com.filtro.inmuebles.services.zona;

import java.util.List;

import com.filtro.inmuebles.repository.entities.Zona;

public interface ZonaServicePriv {

    Zona buscarCodigo(int codigo);

    Zona buscarNombre(String nombre);

    List<Zona> buscarTodas();
    
}

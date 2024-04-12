package com.filtro.inmuebles.repository;

import org.springframework.data.repository.CrudRepository;

import com.filtro.inmuebles.repository.entities.Zona;
import java.util.Optional;


public interface ZonaRepository extends CrudRepository<Zona, Long> {

    Optional<Zona> findByCodigo(int codigo);

    Optional<Zona> findByNombre(String nombre);
    
}

package com.filtro.inmuebles.repository;

import org.springframework.data.repository.CrudRepository;

import com.filtro.inmuebles.repository.entities.Villa;
import java.util.Optional;


public interface VillaRepository extends CrudRepository<Villa, Long> {

    Optional<Villa> findByReferencia(long referencia);
    
}

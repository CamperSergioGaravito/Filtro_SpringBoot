package com.filtro.inmuebles.repository;

import org.springframework.data.repository.CrudRepository;

import com.filtro.inmuebles.repository.entities.Casa;
import java.util.Optional;


public interface CasaRepository extends CrudRepository<Casa, Long> {

    Optional<Casa> findByReferencia(long referencia);
    
}

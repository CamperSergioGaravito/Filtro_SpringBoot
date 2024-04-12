package com.filtro.inmuebles.repository;

import org.springframework.data.repository.CrudRepository;

import com.filtro.inmuebles.repository.entities.Local;
import java.util.Optional;


public interface LocalRepository extends CrudRepository<Local, Long> {
    
    Optional<Local> findByReferencia(long referencia);

}

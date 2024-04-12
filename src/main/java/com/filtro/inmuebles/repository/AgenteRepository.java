package com.filtro.inmuebles.repository;

import java.util.Optional;

import org.springframework.data.repository.CrudRepository;

import com.filtro.inmuebles.repository.entities.Agente;

public interface AgenteRepository extends CrudRepository<Agente, Long> {

    Agente findByCedula(long cedula);

    Optional<Agente> findByEmail(String email);
    
}

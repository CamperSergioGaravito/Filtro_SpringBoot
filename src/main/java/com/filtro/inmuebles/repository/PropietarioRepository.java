package com.filtro.inmuebles.repository;

import org.springframework.data.repository.CrudRepository;

import com.filtro.inmuebles.repository.entities.Propietario;
import java.util.Optional;


public interface PropietarioRepository extends CrudRepository<Propietario, Long> {

    Optional<Propietario> findByCedula(long cedula);

    Optional<Propietario> findByEmail(String email);
    
}

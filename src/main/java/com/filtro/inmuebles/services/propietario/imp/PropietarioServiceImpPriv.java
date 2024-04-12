package com.filtro.inmuebles.services.propietario.imp;

import java.util.List;

import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.filtro.inmuebles.repository.PropietarioRepository;
import com.filtro.inmuebles.repository.entities.Propietario;
import com.filtro.inmuebles.services.propietario.PropietarioServicePriv;

import lombok.AllArgsConstructor;

@AllArgsConstructor
@Service
public class PropietarioServiceImpPriv implements PropietarioServicePriv {

    private final PropietarioRepository propietarioRepository;

    @Transactional(readOnly = true)
    @Override
    public Propietario findByCedula(long cedula) {
        return propietarioRepository.findByCedula(cedula).orElse(null);
    }

    @Transactional(readOnly = true)
    @Override
    public Propietario findByEmail(String findByEmail) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'findByEmail'");
    }

    @Transactional(readOnly = true)
    @Override
    public List<Propietario> findAll() {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'findAll'");
    }
    
}

package com.filtro.inmuebles.services.zona.imp;

import java.util.List;

import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.filtro.inmuebles.repository.ZonaRepository;
import com.filtro.inmuebles.repository.entities.Zona;
import com.filtro.inmuebles.services.zona.ZonaServicePriv;

import lombok.AllArgsConstructor;

@AllArgsConstructor
@Service
public class ZonaServiceImpPriv implements ZonaServicePriv {

    private final ZonaRepository zonaRepository;

    @Transactional(readOnly = true)
    @Override
    public Zona buscarCodigo(int codigo) {
        return zonaRepository.findByCodigo(codigo).orElse(null);
    }

    @Transactional(readOnly = true)
    @Override
    public Zona buscarNombre(String nombre) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'buscarNombre'");
    }

    @Transactional(readOnly = true)
    @Override
    public List<Zona> buscarTodas() {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'buscarTodas'");
    }
    
}

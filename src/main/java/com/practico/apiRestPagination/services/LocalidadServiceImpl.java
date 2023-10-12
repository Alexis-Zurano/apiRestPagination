package com.practico.apiRestPagination.services;

import com.practico.apiRestPagination.entities.Localidad;
import com.practico.apiRestPagination.repositories.BaseRepository;
import com.practico.apiRestPagination.repositories.LocalidadRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class LocalidadServiceImpl extends BaseServiceImpl<Localidad,Long> implements LocalidadService{

    @Autowired
    private LocalidadRepository localidadRepository;

    public LocalidadServiceImpl(BaseRepository<Localidad, Long> baseRepository, LocalidadRepository localidadRepository) {
        super(baseRepository);
        this.localidadRepository = localidadRepository;
    }
}

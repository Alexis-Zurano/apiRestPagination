package com.practico.apiRestPagination.services;

import com.practico.apiRestPagination.entities.Autor;
import com.practico.apiRestPagination.repositories.AutorRepoository;
import com.practico.apiRestPagination.repositories.BaseRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class AutorServiceImpl extends BaseServiceImpl<Autor,Long> implements AutorService{

    @Autowired
    private AutorRepoository autorRepository;

    public AutorServiceImpl(BaseRepository<Autor, Long> baseRepository, AutorRepoository autorRepository) {
        super(baseRepository);
        this.autorRepository = autorRepository;
    }
}

package com.practico.apiRestPagination.services;

import com.practico.apiRestPagination.entities.Libro;
import com.practico.apiRestPagination.repositories.BaseRepository;
import com.practico.apiRestPagination.repositories.LibroRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class LibroServiceImpl extends BaseServiceImpl<Libro,Long> implements LibroService{

    @Autowired
    private LibroRepository libroRepository;

    public LibroServiceImpl(BaseRepository<Libro, Long> baseRepository, LibroRepository libroRepository) {
        super(baseRepository);
        this.libroRepository = libroRepository;
    }
}

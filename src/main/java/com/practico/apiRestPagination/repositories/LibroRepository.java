package com.practico.apiRestPagination.repositories;

import com.practico.apiRestPagination.entities.Libro;
import org.springframework.stereotype.Repository;

@Repository
public interface LibroRepository extends BaseRepository<Libro, Long> {
}

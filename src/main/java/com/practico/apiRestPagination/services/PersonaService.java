package com.practico.apiRestPagination.services;

import com.practico.apiRestPagination.entities.Persona;
import org.springframework.data.domain.Page;

import java.util.List;

public interface PersonaService extends BaseService<Persona, Long>{
    List<Persona> search(String filtro) throws Exception;

}

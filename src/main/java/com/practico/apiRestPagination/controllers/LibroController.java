package com.practico.apiRestPagination.controllers;

import com.practico.apiRestPagination.entities.Libro;
import com.practico.apiRestPagination.services.LibroServiceImpl;
import org.springframework.web.bind.annotation.*;

@RestController
@CrossOrigin(origins = "*")
@RequestMapping(path = "api/v1/libros")
public class LibroController extends BaseControllerImpl<Libro, LibroServiceImpl>{

}

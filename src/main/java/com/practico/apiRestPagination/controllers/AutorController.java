package com.practico.apiRestPagination.controllers;

import com.practico.apiRestPagination.entities.Autor;
import com.practico.apiRestPagination.services.AutorServiceImpl;
import org.springframework.web.bind.annotation.*;

@RestController
@CrossOrigin(origins = "*")
@RequestMapping(path = "api/v1/autores")
public class AutorController extends BaseControllerImpl<Autor,AutorServiceImpl>{

}

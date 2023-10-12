package com.practico.apiRestPagination.controllers;

import com.practico.apiRestPagination.entities.Localidad;
import com.practico.apiRestPagination.services.LocalidadServiceImpl;
import org.springframework.web.bind.annotation.*;

@RestController
@CrossOrigin(origins = "*")
@RequestMapping(path = "api/v1/localidades")
public class LocalidadController extends BaseControllerImpl<Localidad, LocalidadServiceImpl>{

}

package com.practico.apiRestPagination.controllers;

import com.practico.apiRestPagination.entities.Domicilio;
import com.practico.apiRestPagination.services.DomicilioServiceImpl;
import org.springframework.web.bind.annotation.*;

@RestController
@CrossOrigin(origins = "*")
@RequestMapping(path = "api/v1/domicilios")
public class DomicilioController extends BaseControllerImpl<Domicilio, DomicilioServiceImpl>{

}

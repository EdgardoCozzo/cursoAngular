package controller;

import entity.Persona;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import service.PersonaService;

import java.util.List;
@CrossOrigin(origins="http://localhost:4200", maxAge = 3600)
@RestController
@RequestMapping("/personas")

public class Controlador {
@Autowired
PersonaService service;
@RequestMapping("/")
public List<Persona> listar(){
    return service.listar();
}
}

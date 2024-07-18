package com.example.demo.controllers;

import com.example.demo.models.Pruebas;
import com.example.demo.services.PruebaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/api/prueba/")
public class PruebaRestController {


    private PruebaService pruebaService;

    //se inyecta el servicio en el constructor con fines de optimización de
    //pruebas unitarias
    @Autowired
    public PruebaRestController(PruebaService pruebaService) {
        this.pruebaService = pruebaService;
    }

    @GetMapping(value = "/", headers = "Accept=application/json")
    public String vistaPrincipal() {
        return "index.html";
    }


    //Crear un nuevo objeto
    @PostMapping(value = "crear", headers = "Accept=application/json")
    public void crear(@RequestBody Pruebas pruebas) {
        pruebaService.save(pruebas);
    }


    //Listar todos los objetos creados
    @GetMapping(value = "listar", headers = "Accept=application/json" )
    public List<Pruebas> listar() {
        return pruebaService.findAll();
    }

    //Listar un objeto en especifico por id
    @GetMapping(value = "listarP/{id}", headers = "Accept=application/json")
    public Optional<Pruebas> listarP(@PathVariable Long id) {
        return pruebaService.findById(id);
    }

    //Actualizar un objeto
    @PutMapping(value = "actualizar", headers = "Accept=application/json")
    public  void actualizar(@RequestBody Pruebas pruebas) {
        pruebaService.update(pruebas);
    }

    //Eliminar un objeto
    @DeleteMapping(value = "eliminar/{id}", headers = "Accept=application/json")
    public void eliminar(@PathVariable Long id) {
        pruebaService.delete(id);
    }
}

package com.example.demo.services;

import com.example.demo.models.Pruebas;
import com.example.demo.repositories.PruebaRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class PruebaService {

    private PruebaRepository pruebaRepository;

    @Autowired
    public PruebaService(PruebaRepository pruebaRepository) {
        this.pruebaRepository = pruebaRepository;
    }

    //creacion
    public void save(Pruebas pruebas) {
        pruebaRepository.save(pruebas);
    }

    //listar
    public List<Pruebas> findAll() {
        return pruebaRepository.findAll();
    }

    //buscar por id
    public Optional<Pruebas> findById(Long id) {
        return pruebaRepository.findById(id);
    }

    //actualizar
    public void update(Pruebas pruebas) {
        pruebaRepository.save(pruebas);
    }

    //eliminar
    public void delete(Long id) {
        pruebaRepository.deleteById(id);
    }


}

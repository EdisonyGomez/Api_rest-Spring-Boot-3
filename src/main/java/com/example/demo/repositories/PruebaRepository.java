package com.example.demo.repositories;

import com.example.demo.models.Pruebas;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface PruebaRepository extends JpaRepository<Pruebas, Long> {
   // List<Pruebas> findP(String nombre);
}

package com.puce.practica2.controller;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.*;
import java.util.*;
import org.springframework.web.bind.annotation.*;

import com.puce.practica2.model.Profesor;
import com.puce.practica2.service.ProfesorService;

//4to controlador
@RestController
@RequestMapping("/api/v1")
public class ProfesorController {
        // inyectar el servicio
    @Autowired
    private ProfesorService profesorService;


    // API
    // get listar profesores
    @GetMapping("/profesores")
    public List<Profesor> listarProfesores() {
        return profesorService.listarProfesores();
    }

    // listar profesores por ID
    @GetMapping("/profesores/{id}")
    /*
     * public Profesor obtenerProfesorPorId(@PathVariable(value = "id") Integer id)
     * {
     * return profesorService.obtenerProfesorPorId(id);
     * }
     */
    public ResponseEntity<Profesor> obtenerProfesorPorId(@PathVariable int id) {
        try {
            Profesor profesor = profesorService.obtenerProfesorPorId(id);
            return new ResponseEntity<Profesor>(profesor, HttpStatus.OK);
        } catch (Exception e) {
            return new ResponseEntity<Profesor>(HttpStatus.NOT_FOUND);
        }
    }

    // requiere un body para guardar
    @PostMapping("/profesores")
    public Profesor guardarProfesor(@RequestBody Profesor profesor) {
        profesorService.guardarProfesor(profesor);
        return profesor;
    }

    // eliminar por ID
    @DeleteMapping("/profesores/{id}")
    public Profesor eliminarProfesorID(@PathVariable int id) {
        profesorService.eliminarProfesor(id);
        return null;
    }

    // actualizar por ID
    @PutMapping("/profesores/{id}")
    public Profesor actualizarProfesorID(@RequestBody Profesor profesor, @PathVariable int id) {
        profesorService.guardarProfesor(profesor);
        Profesor profesorExist = profesorService.obtenerProfesorPorId(id);
        return profesorExist;
    }

    // buscar por apellido
    @GetMapping("/profesores/apellido/{apellido}")
    public List<Profesor> buscarPorApellido(@PathVariable String apellido) {
        return profesorService.buscarPorApellido(apellido);
    }

    // buscar por edad
    @GetMapping("/profesores/edad/{edad}")
    public List<Profesor> buscarPorEdadMayor(@PathVariable int edad) {
        return profesorService.buscarPorEdadMayor(edad);
    }

    // buscar por sueldo
    @GetMapping("/profesores/sueldo/{sueldo}")
    public List<Profesor> buscarPorSueldoInferior(@PathVariable double sueldo) {
        return profesorService.buscarPorSueldoInferior(sueldo);

    }

}

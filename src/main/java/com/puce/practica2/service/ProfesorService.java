package com.puce.practica2.service;
import org.springframework.stereotype.*;

import com.puce.practica2.model.Profesor;
import com.puce.practica2.repository.ProfesorRepository;

import java.util.*;
import org.springframework.beans.factory.annotation.Autowired;
//tercerto
@Service
public class ProfesorService {

    //inyectar el repositorio
    @Autowired
    private ProfesorRepository profesorRepository;

    //metodos
    public List<Profesor> listarProfesores() {
        return profesorRepository.findAll();
    }

    //para guardar un producto insert -> save
    public void guardarProfesor(Profesor profesor) {
        profesorRepository.save(profesor);
    }
    //profe por id obtener/select-> findbyid
    public Profesor obtenerProfesorPorId(int id) {
        return profesorRepository.findById(id).get();
    }

    //eliminar un profesor delete -> delete
    public void eliminarProfesor(int id) {
        profesorRepository.deleteById(id);
    }

    //buscar por apellido
    public List<Profesor> buscarPorApellido(String apellido) {
        return profesorRepository.findByApellido(apellido);
    }
    //buscar por edad
    public List<Profesor> buscarPorEdadMayor(int edad) {
        return profesorRepository.findByEdadGreaterThan(edad);
    }
    //buscar por sueldo
    public List<Profesor> buscarPorSueldoInferior(double sueldo) {
        return profesorRepository.findBySueldoLessThan(sueldo);
    }
    
}

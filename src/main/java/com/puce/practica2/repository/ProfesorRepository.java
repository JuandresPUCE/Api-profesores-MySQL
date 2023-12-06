package com.puce.practica2.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import java.util.List;
import com.puce.practica2.model.Profesor;
//segundo el repositorio
public interface ProfesorRepository extends JpaRepository<Profesor, Integer> {
    List<Profesor> findByApellido(String apellido);
    List<Profesor> findByEdadGreaterThan(int edad);
    List<Profesor> findBySueldoLessThan(double sueldo);
}

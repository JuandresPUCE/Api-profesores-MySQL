package com.puce.practica2.model;
import jakarta.persistence.*;

@Entity
public class Profesor {
        //entidad Profesor con los siguientes atributos 
    //ID, nombre, apellido, edad, sueldo, años de experiencia y teléfono. 
    @Id
    private int id;
    private String nombre;
    private String apellido;
    private int edad;
    private double sueldo;
    private int aniosExperiencia;
    private String telefono;
    
    public Profesor() {
        super();
    }

    public Profesor(int id, String nombre, String apellido, int edad, double sueldo, int aniosExperiencia,
            String telefono) {
        super();

        this.id = id;
        this.nombre = nombre;
        this.apellido = apellido;
        this.edad = edad;
        this.sueldo = sueldo;
        this.aniosExperiencia = aniosExperiencia;
        this.telefono = telefono;
    }
    public int getId() {
        return id;
    }
    public void setId(int id) {
        this.id = id;
    }
    public String getNombre() {
        return nombre;
    }
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    public String getApellido() {
        return apellido;
    }
    public void setApellido(String apellido) {
        this.apellido = apellido;
    }
    public int getEdad() {
        return edad;
    }
    public void setEdad(int edad) {
        this.edad = edad;
    }
    public double getSueldo() {
        return sueldo;
    }
    public void setSueldo(double sueldo) {
        this.sueldo = sueldo;
    }
    public int getAniosExperiencia() {
        return aniosExperiencia;
    }
    public void setAniosExperiencia(int aniosExperiencia) {
        this.aniosExperiencia = aniosExperiencia;
    }
    public String getTelefono() {
        return telefono;
    }
    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }
}

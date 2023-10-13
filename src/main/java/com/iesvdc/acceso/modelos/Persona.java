package com.iesvdc.acceso.modelos;

import java.rmi.server.ServerRef;
import java.time.LocalDate;
import java.util.List;

public class Persona{
    private String nombre;
    private String apellido1;
    private String apellido2;
    private String dni;
    private String email;
    private LocalDate fechanaci;
    private Direcciones direcciones;
    
    public String getNombre() {
        return nombre;
    }
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    public String getApellido1() {
        return apellido1;
    }
    public void setApellido1(String apellido1) {
        this.apellido1 = apellido1;
    }
    public String getApellido2() {
        return apellido2;
    }
    public void setApellido2(String apellido2) {
        this.apellido2 = apellido2;
    }
    public String getDni() {
        return dni;
    }
    public void setDni(String dni) {
        this.dni = dni;
    }
    public String getEmail() {
        return email;
    }
    public void setEmail(String email) {
        this.email = email;
    }
    public LocalDate getFechanaci() {
        return fechanaci;
    }
    public void setFechanaci(LocalDate fechanaci) {
        this.fechanaci = fechanaci;
    }
    public Direcciones getDirecciones() {
        return direcciones;
    }
    public void setDirecciones(Direcciones direcciones) {
        this.direcciones = direcciones;
    }
}
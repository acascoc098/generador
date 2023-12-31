package com.iesvdc.acceso.modelos;

import java.rmi.server.ServerRef;
import java.time.LocalDate;
import java.util.List;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement(name = "personas")
@XmlAccessorType(XmlAccessType.FIELD)
public class Persona{
    private String nombre;
    private String apellido1;
    private String dni;
    private String email;
    private LocalDate fechanaci;
    private List<Direccion> direcciones;

    public Persona(){}

    public Persona(String nombre, String apellido1, String dni, String email, LocalDate fechanaci, Direcciones direcciones) {
        this.nombre = nombre;
        this.apellido1 = apellido1;
        this.dni = dni;
        this.email = email;
        this.fechanaci = fechanaci;
        this.direcciones = (List<Direccion>) direcciones;
    }

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

    public List<Direccion> getDirecciones() {
        return direcciones;
    }

    public void setDirecciones(List<Direccion> direcciones) {
        this.direcciones = direcciones;
    }

    @Override
    public String toString() {
        return "{" +
                " nombre='" + getNombre() + "'" +
                ", apellido='" + getApellido1() + "'" +
                ", dni='" + getDni() + "'" +
                ", fdn='" + getFechanaci() + "'" +
                ", direcciones='" + getDirecciones() + "'" +
                "}";
    }


}
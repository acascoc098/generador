package com.iesvdc.acceso.modelos;

import java.util.Objects;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement(name = "localidad")
@XmlAccessorType(XmlAccessType.FIELD)
public class Localidad {
    //private String municipio;
    private String poblacion;
    private int cp;
    private String provincia;


    public Localidad(){}

    public Localidad(String poblacion, int cp, String provincia){
        this.poblacion = poblacion;
        this.cp = cp;
        this.provincia = provincia;
    }

    public String getpoblacion() {
        return this.poblacion;
    }

    public void setpoblacion(String poblacion) {
        this.poblacion = poblacion;
    }

    public int getCp() {
        return this.cp;
    }

    public void setCp(int cp) {
        this.cp = cp;
    }

    public String getProvincia() {
        return this.provincia;
    }

    public void setProvincia(String provincia) {
        this.provincia = provincia;
    }

    public Localidad poblacion(String poblacion) {
        setpoblacion(poblacion);
        return this;
    }

    public Localidad cp(int cp) {
        setCp(cp);
        return this;
    }

    public Localidad provincia(String provincia) {
        setProvincia(provincia);
        return this;
    }

    @Override
    public boolean equals(Object o) {
        if (o == this)
            return true;
        if (!(o instanceof Localidad)) {
            return false;
        }
        Localidad localidad = (Localidad) o;
        return Objects.equals(poblacion, localidad.poblacion) && cp == localidad.cp && Objects.equals(provincia, localidad.provincia);
    }

    @Override
    public int hashCode() {
        return Objects.hash(poblacion, cp, provincia);
    }

    @Override
    public String toString() {
        return "{" +
            " poblacion='" + getpoblacion() + "'" +
            ", cp='" + getCp() + "'" +
            ", provincia='" + getProvincia() + "'" +
            "}";
    }


}

package com.iesvdc.acceso;

import com.iesvdc.acceso.modelos.Localidades;
import com.iesvdc.acceso.modelos.Personas;

public class App 
{
    public static void main( String[] args )
    {
        Personas persons = new Personas();
        persons.load("nombre-mujeres.txt","nombre-hombres.txt",
                "apellidos.txt", "codigos-postales.csv","nombres-calles.txt");

        persons.generate(100);

        System.out.println(persons.getPersonas().toString());
    }
}

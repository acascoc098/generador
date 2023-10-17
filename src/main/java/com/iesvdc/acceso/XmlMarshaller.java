package com.iesvdc.acceso;

import java.io.File;

import javax.xml.bind.JAXBContext;
import javax.xml.bind.Marshaller;

import com.iesvdc.acceso.modelos.Localidad;
import com.iesvdc.acceso.modelos.Personas;

public class XmlMarshaller {
    public static void main( String[] args )
    {
       Personas persons = new Personas();
        persons.load("nombre-mujeres.txt","nombre-hombres.txt",
                "apellidos.txt", "codigos-postales.csv","nombres-calles.txt");

        persons.generate(100);

        JAXBContext jContext;
        try {
            jContext = JAXBContext.newInstance(persons.getClass());
            Marshaller mars = jContext.createMarshaller();
            mars.setProperty(Marshaller.JAXB_FORMATTED_OUTPUT, true);
            mars.marshal(persons, new File("personas.xml"));
        } catch (Exception e) {
            e.printStackTrace();
        }

        /*Localidad lolcal = new Localidad("Jaén", 23008, "Jaén");

        JAXBContext jContext2;
        try {
            jContext2 = JAXBContext.newInstance(lolcal.getClass());
            Marshaller marss = jContext2.createMarshaller();
            marss.setProperty(Marshaller.JAXB_FORMATTED_OUTPUT, true);
            marss.marshal(lolcal,new File("localidad.xml"));
        } catch (Exception e) {
            e.printStackTrace();
        }*/
    }
}

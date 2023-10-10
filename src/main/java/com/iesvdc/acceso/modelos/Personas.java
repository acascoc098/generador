package com.iesvdc.acceso.modelos;

import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;

public class Personas {
    private List<Persona> personas;
    private List<String> nom_muj;
    private List<String> nom_hom;
    private List<String> apellidos;
    private Direcciones direcc;

    public void load(String nom_muj_filename,String nom_homb_filename,String apellido_filename, String locals_filename, String calles_filename){

        try {
            this.personas = new ArrayList<Persona>();
            this.nom_muj = Files.readAllLines(Paths.get(nom_muj_filename), StandardCharsets.UTF_8);
            this.nom_hom = Files.readAllLines(Paths.get(nom_homb_filename), StandardCharsets.UTF_8);
            this.apellidos = Files.readAllLines(Paths.get(apellido_filename), StandardCharsets.UTF_8);
            this.direcc.load(locals_filename,calles_filename);
        }catch (Exception e){
            e.printStackTrace();
        }


    }
}

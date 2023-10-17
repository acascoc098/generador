package com.iesvdc.acceso.modelos;

import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.time.Instant;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Random;

public class Personas {
    private List<Persona> personas;
    private List<String> nom_muj;
    private List<String> nom_hom;
    private List<String> apellidos;
    private Direcciones direcc;

    public void load(String nom_muj_filename,String nom_homb_filename,String apellido_filename, String locals_filename, String calles_filename){

        try {
            //this.personas = new ArrayList<Persona>();
            this.nom_muj = Files.readAllLines(Paths.get(nom_muj_filename), StandardCharsets.UTF_8);
            this.nom_hom = Files.readAllLines(Paths.get(nom_homb_filename), StandardCharsets.UTF_8);
            this.apellidos = Files.readAllLines(Paths.get(apellido_filename), StandardCharsets.UTF_8);
            this.direcc = new Direcciones();
            this.direcc.load(locals_filename,calles_filename);
        }catch (Exception e){
            e.printStackTrace();
        }
    }

    public void generate(int num_perso){
        if (nom_hom != null && nom_muj != null && apellidos != null && direcc != null) {
            personas = new ArrayList<Persona>();
            List<Direccion> direcs = direcc.getDirecciones();
            Random dado = new Random();
            for (int i = 0; i < num_perso; i++) {
                if (dado.nextInt(2) == 0){
                    String nombrem = this.nom_muj.get(dado.nextInt(nom_muj.size()));
                    String apellido = this.apellidos.get(dado.nextInt(apellidos.size()));
                    Direccion direc = direcs.get(dado.nextInt(direcs.size()));
                    int numdni = dado.nextInt(10000000);
                    String dni = Integer.toString(numdni) + calcularletra(numdni);

                    //Persona person = new Persona(nombrem,apellido,dni,"", LocalDate.now(),direcs);
                }else {
                    String nombreh = this.nom_hom.get(dado.nextInt(nom_hom.size()));
                    String apellido = this.apellidos.get(dado.nextInt(apellidos.size()));
                    Direccion direc = direcs.get(dado.nextInt(direcs.size()));
                }
            }

        }
    }

    private char calcularletra(int dni){
        String caracteres = "TRWAGMYFPDXBNJZSQVHLCKE";
        int resto = dni%23;
        return caracteres.charAt(resto);
    }
}

package com.iesvdc.acceso.modelos;

import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;

public class Localidades {
    private List<Localidad> localidades;

    public Localidades(){}

    public void load(String filename){
        try{
            List<String> lineas = Files.readAllLines(Paths.get(filename));
            this.localidades = new ArrayList<>();
            for(String linea : lineas){
                String[] celdas = linea.split(";");
                Localidad loc = new Localidad(celdas[1], Integer.parseInt(celdas[0]), celdas[3]);
                localidades.add(loc);
            }
            localidades.remove(0);
        }catch(Exception e){
            e.printStackTrace();
            //System.out.println(e.getLocalizedMessage());
        }
    }

    public List<Localidad> getLocalidades() {
        return localidades;
    }

    public void setLocalidades(List<Localidad> localidades) {
        this.localidades = localidades;
    }
}
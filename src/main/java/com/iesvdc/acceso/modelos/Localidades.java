package com.iesvdc.acceso.modelos;

import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.List;

public class Localidades {
    private List<Localidad> localidades;
    public void load(String filename){
        try{
            List <String> lineas = Files.readAllLines(Paths.get(filename), StandardCharsets.ISO_8859_1);
            for(String linea : lineas){
                String[] celdas = linea.split(";");
                Localidad loc = new Localidad(celdas[1], Integer.parseInt(celdas[0]), celdas[3]);
                localidades.add(loc);
            }
            localidades.remove(0);
        }catch(Exception e){

        }
    }
}

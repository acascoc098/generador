package com.iesvdc.acceso.modelos;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class Direcciones {
    private List<Direccion> direcciones;
    private Localidades locals;
    private List<String> calles;

    public Direcciones() {
        direcciones = new ArrayList<Direccion>();
    }

    public Direcciones(List<Direccion> direcciones) {
        this.direcciones = direcciones;
    }

    public  void addD(Direccion d){
        direcciones.add(d);
    }

    public void load(String locals_filename,String calles_filename){
        try{
            this.calles = Files.readAllLines(Paths.get(calles_filename));
            this.locals = new Localidades();
            locals.load(locals_filename);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

    public void generate(int num_dire){
        if (this.calles != null && this.locals != null){
            this.direcciones = new ArrayList<Direccion>();
            List<Localidad> localidades = this.locals.getLocalidades();
            Random num = new Random();
            for (int i = 0; i < num_dire; i++) {
                String calle = this.calles.get(num.nextInt(this.calles.size()));

                Localidad locali = this.locals.getLocalidades().get(num.nextInt(localidades.size()));

                Direccion dir = new Direccion(calle, num.nextInt(100),locali);
                this.direcciones.add(dir);
            }
        }else{
            System.out.println("ERROR: Primer hay que cargar las calles y las localidades");
        }
    }
    public List<Direccion> getDirecciones() {
        return direcciones;
    }

    public void setDirecciones(List<Direccion> direcciones) {
        this.direcciones = direcciones;
    }
    

}

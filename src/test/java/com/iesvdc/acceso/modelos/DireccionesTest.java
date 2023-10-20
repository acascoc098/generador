package com.iesvdc.acceso.modelos;

import static org.junit.Assert.assertTrue;

import org.junit.Test;

public class DireccionesTest {
    @Test
    public void testLoadDirecciones(){
        Direcciones dic = new Direcciones();
        Direcciones dic2 = new Direcciones();
        dic.load("codigos-postales.csv", "nombres-calles.txt");
        dic2.load("codigos-postales.csv", "nombres-calles.txt");

        if(dic.equals(dic2)){
            assertTrue(true);
        }else{
            assertTrue(false);
        }
    }
}

package com.programacion;

import java.awt.*;
import java.io.File;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;

public class Metodos {



    public ArrayList<ClaseDatos> Añadir (ArrayList<ClaseDatos> Registro){
    Registro = new ArrayList();

        return Registro;
    }


    public void Fecha (){
        Date fecha = new Date();
        System.out.println(new SimpleDateFormat("dd-MM-yyyy").format(fecha));
    }

    /* public void abrirarchivo(String archivo){

        try {

            File objetofile = new File (archivo);
            Desktop.getDesktop().open(objetofile);

        }catch (IOException ex) {

            System.out.println(ex);

        }

    }*/


}

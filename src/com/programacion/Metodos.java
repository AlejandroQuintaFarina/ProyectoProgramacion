package com.programacion;

import javax.swing.*;
import java.awt.*;
import java.io.File;
import java.io.FileWriter;
import java.io.PrintWriter;
import java.io.IOException;
import java.sql.ClientInfoStatus;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;

public class Metodos {

    FileWriter fich;
    PrintWriter escritura;
    ClaseDatos x;

    public ArrayList<ClaseDatos> Añadir (ArrayList<ClaseDatos> Registro){
    Registro = new ArrayList();

        return Registro;
    }


    public void Fecha (){
        Date fecha = new Date();
        System.out.println(new SimpleDateFormat("dd-MM-yyyy").format(fecha));
    }

     public void abrirArchivo(String archivo){

        try {

            File objetofile = new File (archivo);
            Desktop.getDesktop().open(new File("Ticket.txt"));

        }catch (IOException ex) {

            System.out.println(ex);

        }

    }


        public void añadirDatos(String nomeFich){

            try {
                fich= new FileWriter(nomeFich, true);
                escritura= new PrintWriter(fich);
                x = new ClaseDatos();
                escritura.println(x.getNombre()+","+x.getDni()+","+x.getEmail()+","+x.getTlf()+","+x.getFechaI()+","+x.getFechaS()+","+x.getHabitacion());
                System.out.println("Su reserva a ha sido creada con éxito.");
            } catch (IOException e) {
                System.out.println("ERROR");
            }
            finally {
                escritura.close();
                try {
                    fich.close();
                } catch (IOException e) {
                    System.out.println("Error en la creación de su reserva, por favor, inténtelo de nuevo.");
                }
            }


        }

        public static String buscarElemento(float[]fich){


                float eleBuscar = Float.parseFloat(JOptionPane.showInputDialog("Teclea tu DNI"));
                int encontrado=0;
                int posicion=0;

                for (int i=0; i< fich.length; i++){
                    if(eleBuscar==fich[i]){
                        System.out.println(eleBuscar+ "DNI encontrado");
                        posicion=i;

                        encontrado=1;
                        break;
                    }
                }

                if (encontrado==0){
                    System.out.println("DNI no encontrado");
                    posicion=-1;
                }

            return null;
        }

        public static float [] borrarArray(float[]fich){

                int pos= Integer.parseInt(Metodos.buscarElemento(fich));

                if (pos<0)
                    System.out.println("El DNI que ha introducido no se encuentra en nuestro registro.");


            return fich;
        }



}

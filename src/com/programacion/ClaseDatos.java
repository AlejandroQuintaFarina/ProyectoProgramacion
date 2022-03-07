package com.programacion;

import java.util.Date;

public class ClaseDatos {
    String Nombre;
    String tlf;
    String dni;
    String email;
    String habitacion;
    Date fechaI;
    Date fechaS;

    public ClaseDatos() {
    }

    public ClaseDatos(String nombre, String tlf, String dni, String email, String habitacion, Date fechaI, Date fechaS) {
        Nombre = nombre;
        this.tlf = tlf;
        this.dni = dni;
        this.email = email;
        this.habitacion = habitacion;
        this.fechaI = fechaI;
        this.fechaS = fechaS;
    }

    public String getNombre() {
        return Nombre;
    }

    public void setNombre(String nombre) {
        Nombre = nombre;
    }

    public String getTlf() {
        return tlf;
    }

    public void setTlf(String tlf) {
        this.tlf = tlf;
    }

    public String getDni() {
        return dni;
    }

    public void setDni(String dni) {
        this.dni = dni;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getHabitacion() {
        return habitacion;
    }

    public void setHabitacion(String habitacion) {
        this.habitacion = habitacion;
    }

    public Date getFechaI() {
        return fechaI;
    }

    public void setFechaI(Date fechaI) {
        this.fechaI = fechaI;
    }

    public Date getFechaS() {
        return fechaS;
    }

    public void setFechaS(Date fechaS) {
        this.fechaS = fechaS;
    }

    @Override
    public String toString() {
        return "Nombre='" + Nombre + '\'' +
                ", tlf=" + tlf + '\'' +
                ", dni='" + dni + '\'' +
                ", email='" + email + '\'' +
                ", habitación='" + habitacion + '\'' +
                ", fechaI=" + fechaI +
                ", fechaS=" + fechaS ;
    }


}

package com.example.listas.modelo;

public class Cursos {
    private int id;
    private String nombre;
    private double porcentaje;

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public double getPorcentaje() {
        return porcentaje;
    }

    public void setPorcentaje(double porcentaje) {
        this.porcentaje = porcentaje;
    }

    public int getId() {
        return id;
    }
}

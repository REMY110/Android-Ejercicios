package com.example.listas.modelo;

public class Alumno {

    private String numControl;
    private String  nombre;
    private String  ruta;

    public Alumno(String numControl, String nombre){
        this.numControl = numControl;
        this.nombre = nombre;
        ruta = "none";
    }
    public String getNumControl(){
        return numControl;
    }
    public void setNumControl(String numControl){
        this.getNumControl();
    }
}

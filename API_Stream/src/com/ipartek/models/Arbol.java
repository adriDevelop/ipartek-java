package com.ipartek.models;

public class Arbol {

    private String nombre;
    private String origen;

    public Arbol(String nombre, String origen) {
        this.nombre = nombre;
        this.origen = origen;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getOrigen() {
        return origen;
    }

    public void setOrigen(String origen) {
        this.origen = origen;
    }

    @Override
    public String toString() {
        return "Árbol: " + this.nombre + " de: " + this.origen;
    }
}

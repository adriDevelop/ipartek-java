package com.ipartek.models;

public abstract class Animal {

    private String nombre;

    public Animal(String nombre){
        this.nombre = nombre;
    }

    public String getNombre() {
        return this.nombre;
    }

    public void setNombre(String nombre){
        this.nombre = nombre;
    }
}

package com.ipartek.objetos_mutables;

public class Gato {
    protected String nombre;

    public Gato(){}

    public Gato(String nombre){
        this.nombre = nombre;
    }

    public String getNombre(){
        return this.nombre;
    }

    public void setNombre(String nombre){
        this.nombre = nombre;
    }

}

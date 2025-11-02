package com.ipartek.objetos_mutables2;

public class Persona {
    protected String nombre;

    public Persona(){}

    public Persona(String nombre){
        this.nombre = nombre;
    }

    public String getNombre(){
        return this.nombre;
    }

    public void setNombre(String nombre){
        this.nombre = nombre;
    }

    @Override
    public String toString() {
        return this.getNombre();
    }
}

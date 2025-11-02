package com.ipartek.models;

import com.ipartek.puro.ICabalgable;

public class Caballo extends Animal implements ICabalgable {

    public Caballo(String nombre){
        super(nombre);
    }

    public void comerHierba(){
        System.out.println("Caballo comiendo hierba");
    }

    @Override
    public String getNombreCabalgable() {
        return this.getNombre();
    }

    @Override
    public void setNombreCabalgable(String nombre) {
        this.setNombre(nombre);
    }

    @Override
    public String toString() {
        return "Caballo: " + this.getNombre();
    }
}

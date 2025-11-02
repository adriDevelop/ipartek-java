package com.ipartek.models;

import com.ipartek.puro.ICabalgable;

public class Wargo extends Animal implements ICabalgable {

    public Wargo(String nombre){
        super(nombre);
    }

    public void comerCarne(){
        System.out.println(this + " comiendo carne.");
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
        return "Wargo " + this.getNombre();
    }
}

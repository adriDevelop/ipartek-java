package com.ipartek.polimorfismo;

public class Maquinaria implements Transportable{

    private Double peso;

    public Maquinaria(Double peso){
        this.peso = peso;
    }

    @Override
    public Double getPeso() {
        return this.peso;
    }

    @Override
    public String toString() {
        return "Hola soy una maquinaria";
    }
}

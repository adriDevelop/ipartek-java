package com.ipartek.polimorfismo;

public class BarrilAceite implements Transportable{

    private Double peso;

    public BarrilAceite(Double peso){
        this.peso = peso;
    }

    @Override
    public Double getPeso() {
        return this.peso;
    }

    @Override
    public String toString() {
        return "Hola soy un barril de aceite";
    }
}

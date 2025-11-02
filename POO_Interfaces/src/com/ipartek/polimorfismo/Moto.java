package com.ipartek.polimorfismo;

public class Moto implements Vehiculo, Transportable{

    private Double peso;

    public Moto(Double peso){
        this.peso = peso;
    }

    @Override
    public void acelerar() {
        System.out.println("La moto está acelerando");
    }

    @Override
    public void frenar() {
        System.out.println("La moto está frenando");
    }

    @Override
    public String toString() {
        return "Soy una moto";
    }

    @Override
    public Double getPeso() {
        return this.peso;
    }
}

package com.ipartek.polimorfismo;

public class Avion implements Vehiculo{

    @Override
    public void acelerar() {
        System.out.println("El avión está acelerando los turboreactores.");
    }

    @Override
    public void frenar() {
        System.out.println("El avión está frenando los turboreactores.");
    }

    @Override
    public String toString() {
        return "Soy un avión";
    }

}

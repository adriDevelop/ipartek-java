package com.ipartek.polimorfismo;

public class Automovil implements Vehiculo, Transportable, Cargable{

    private Double peso;

    @Override
    public void acelerar() {
        System.out.println("El automóvil está acelerando");
    }

    @Override
    public void frenar() {
        System.out.println("El automóvil está frenando");
    }

    @Override
    public String toString() {
        return "Soy un automóvil";
    }

    @Override
    public Double getPeso() {
        return this.peso;
    }

    @Override
    public boolean compruebaSiElNuevoItemCabe(Transportable item) {
        return false;
    }

    @Override
    public void ingresaEnCompartimentoDeCarga(Transportable item) {

    }
}

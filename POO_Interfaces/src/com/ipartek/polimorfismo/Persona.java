package com.ipartek.polimorfismo;

public class Persona {

    private String nombre;

    public Persona(String nombre){
        this.nombre = nombre;
    }

    public void cargarVehiculo(Cargable cargable, Transportable transportable){
        if (cargable.compruebaSiElNuevoItemCabe(transportable)){
            cargable.ingresaEnCompartimentoDeCarga(transportable);
        }else{
            System.out.println("El item no cabe en el compartimento de carga");
        }
    }
}

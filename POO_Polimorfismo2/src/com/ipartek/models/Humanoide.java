package com.ipartek.models;

import com.ipartek.puro.ICabalgable;

public abstract class Humanoide {
    private String nombre;
    private int fuerza; // Parametrizada de 0 a 10
    private int inteligencia; // Parametrizada de 0 a 10

    ///   ///

    public Humanoide(){

    }

    public Humanoide(String nombre, int fuerza, int inteligencia){
        this.nombre = nombre;
        this.fuerza = fuerza;
        this.inteligencia = inteligencia;
    }

    public String getNombre(){
        return this.nombre;
    }

    public void setNombre(String nombre){
        this.nombre = nombre;
    }

    public int getFuerza(){
        return this.fuerza;
    }

    public void setFuerza(int fuerza){
        this.fuerza = fuerza;
    }

    public int getInteligencia(){
        return this.inteligencia;
    }

    public void setInteligencia(int inteligencia){
        this.inteligencia = inteligencia;
    }


    /// ///

    public void cabalgar(ICabalgable elCabalgable){

        // Cambiamos nombre a Furia
        elCabalgable.setNombreCabalgable("Furia cambiado");
        System.out.println(this.nombre + " cabalgando " + elCabalgable.getNombreCabalgable());
    }

    public void tirarConArco(){
    }

    /// ///

    @Override
    public String toString() {
        return "Hola soy un humanoide";
    }
}

package com.ipartek.models;

public abstract class Elfo extends Humanoide{


    /// ///
    public Elfo(String nombre, int fuerza, int inteligencia) {
        super(nombre, fuerza, inteligencia);
    }

    /// ///

    /// ///

    public void fabricarLembas(){
        System.out.println("Elfo fabricando lembas");
    }

    /// ///

    @Override
    public String toString() {
        return "Hola soy un elfo";
    }
}

package com.ipartek.models;

public class Orco extends Humanoide{



    public Orco(String nombre, int fuerza, int inteligencia) {
        super(nombre, fuerza, inteligencia);
    }

    /// ///

    /// ///

    public void robarGallinas(){
        System.out.println("Orco robando gallinas");
    }

    /// ///

    @Override
    public String toString() {
        return "Hola soy un horco";
    }

    @Override
    public void tirarConArco() {
        System.out.println("Orco tirando con arco");;
    }
}

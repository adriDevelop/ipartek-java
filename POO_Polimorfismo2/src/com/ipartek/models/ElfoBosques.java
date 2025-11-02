package com.ipartek.models;

public class ElfoBosques extends Elfo{

    /// ///

    public ElfoBosques(String nombre, int fuerza, int inteligencia) {
        super(nombre, fuerza, inteligencia);
    }

    /// ///

    /// ///

    public void hablarConAnimales(){
        System.out.println("Elfo de los bosques hablando con animales");
    }

    public void imponerManos(){
        System.out.println("Elfo de los bosques imponiendo manos");
    }

    /// ///


    @Override
    public void tirarConArco() {
        System.out.println("Tirar con arco como Elfo de los Bosques");
    }


    @Override
    public String toString() {
        return "Hola soy un elfo de los bosques";
    }
}

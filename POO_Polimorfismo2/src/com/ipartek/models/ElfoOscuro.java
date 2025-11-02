package com.ipartek.models;

public class ElfoOscuro extends Elfo{

    public ElfoOscuro(String nombre, int fuerza, int inteligencia) {
        super(nombre, fuerza, inteligencia);
    }

    /// ///

    /// ///

    public void hacerMagiaNegra(){
        System.out.println("Elfo oscuro haciendo magia negra");
    }

    /// ///

    @Override
    public String toString() {
        return "Hola soy un elfo oscuro";
    }

    @Override
    public void tirarConArco() {
        System.out.println("Elfo oscuro tira con arco");;
    }
}

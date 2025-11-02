package com.ipartek.sobrecarga;

import com.ipartek.models.Gato;

public class Principal2 {

    public static void main(String[] args) {

        // Polimorfismo de sobrecarga
        Gato gatoCallejero = new Gato();
        Gato mizifuz = new Gato(2, "Mizifuz");
        Gato zafiron = new Gato(5, "Zafirón", "negro");
        
        String resultado = gatoCallejero.maullar();
        String resultado2 = mizifuz.maullar("Marramiauggahhhhhhhhh!!!!");
        String resultado3 = zafiron.maullar(8);

        System.out.println("resultado = " + resultado);
        System.out.println("resultado2 = " + resultado2);
        System.out.println("resultado3 = " + resultado3);
    }
}

package com.ipartek.metodos_genericos;

public class Principal1 {

    public static void main(String[] args) {

        String[] nombres = {"Jorgito", "Juanito", "Jaimito"};
        Integer[] numeros = {1, 456, 23, 167};

        Gato[] gatos = {
                new Gato("Mizifuz", 1),
                new Gato("Zafirón", 4),
                new Gato("Silvestre", 6)
        };

        Utilidades.imprimir(gatos);
        System.out.println(Utilidades.sumar(numeros));

        System.out.println(Utilidades.devuelveMaximoArray(gatos));
    }
}

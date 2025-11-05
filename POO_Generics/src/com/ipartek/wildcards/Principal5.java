package com.ipartek.wildcards;

import java.util.ArrayList;
import java.util.List;

public class Principal5 {

    public static void main(String[] args) {

        // En Java, los wildcard se usan para permitir una mayor flexibilidad al trabajar con
        // tipos genéricos desconocidos.

        List<Perro> perros = List.of(new Perro(), new Perro(), new Perro());
        List<Gato> gatos = List.of(new Gato(), new Gato());

        List<Perro> perros2 = new ArrayList<>();
        List<Gato> gatos2 = new ArrayList<>();

        List<Animal> animales = new ArrayList<>();
        animales.add(new Perro());
        animales.add(new Gato());

        Utilidades2.devuelveSonidos(animales);
        Utilidades2.agregarPerros(animales);
    }
}

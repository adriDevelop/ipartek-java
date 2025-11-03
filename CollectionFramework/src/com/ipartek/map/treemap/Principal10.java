package com.ipartek.map.treemap;

import java.util.Comparator;
import java.util.Map;
import java.util.TreeMap;

public class Principal10 {

    public static void main(String[] args) {


        // En los objetos TreeMap tenemos que tener un criterio de Pre-ordenamiento.
        // 1) El criterio de Pre-ordenamiento tiene que estar definido en la clase K.
        // 2) También puede ser definido en su constructor.

        // Si utilizamos clases inmutables, como Key, tenemos garantizado que esas clases ya tienen implementada la
        // interface Comparable.
        // No obstante si necesitamos cambiar el criterio de ordenación de esas clases, debemos utilizar un Comparator
        // en su constructor.
        Map<Integer, String> nombres = new TreeMap<>();

        nombres.put(10, "Pepito");
        nombres.put(5, "Juanito");
        nombres.put(1, "Jorgito");
        nombres.put(3, "Andresito");
        nombres.put(34, "Jaimito");
        nombres.put(123, "Joselito");
        nombres.put(249, "Romualdito");

        nombres.forEach((numeroClase, nombre) ->{
            System.out.println("El alumno " + nombre + " tiene el número: " + numeroClase);
        });
    }
}

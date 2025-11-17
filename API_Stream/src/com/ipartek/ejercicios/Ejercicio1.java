package com.ipartek.ejercicios;

import java.util.Arrays;
import java.util.List;

public class Ejercicio1 {

    public static void main(String[] args) {

        // Aplanar un Array bidimensional en un solo nivel eliminando los repetidos dejandolos dentro de un
        // ArrayList y sacar el resultado por consola.
        String[][] lenguajesProgramacion = {
                {"Java", "Groovy", "PHP"},
                {"C#", "Python", "Groovy", "Java"},
                {"Java", "JavaScript", "TypeScript"},
                {"PHP", "TypeScript"}
        };

        List<String> listaConvertida = Arrays.stream(lenguajesProgramacion)
                .flatMap(Arrays::stream)
                .distinct()
                .toList();

        listaConvertida.forEach(System.out::println);
    }
}

package com.ipartek.flatmap;

import com.ipartek.models.Musico;

import java.util.ArrayList;
import java.util.List;

public class Principal3 {

    public static void main(String[] args) {

        // El operador "map" es un operador intermedio.
        // Nos permite operar sobre cada uno de los elementos del Stream modificandolo según nuestro criterio.

        List<String> arboles = new ArrayList<>();
        arboles.add("Abeto");
        arboles.add("Roble");
        arboles.add("Abedul");

        // Convertir los elementos en minúsculas
        // Comprobar el resultado mediante peek
        // Convertir los elementos en mayúsculas
        // Guardar el resultado final en un ArrayList
        // Imprimir el ArrayList;

        List<String> arbolesMayusculas = arboles.stream()
                .map( s -> s.toLowerCase())
                .peek(System.out::println)
                .map(s -> s.toUpperCase())
                .toList();

        System.out.println("====");

        arbolesMayusculas.forEach(System.out::println);

        // Crear un array de músicos a partir de un ArrayList con sus nombres y apellidos.
        List<Musico> arrayMusicos = List.of(new Musico("Adrian", "Velasco Carrasco"),
                                            new Musico("Ariana", "Grande"),
                                            new Musico("India", "Martinez"));
    }
}

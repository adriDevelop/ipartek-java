package com.ipartek.map;

import com.ipartek.models.Musico;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import static java.util.stream.Collectors.toList;

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
        List<Musico> listaMusicos = Arrays.asList(new Musico("Adrian", "Velasco Carrasco"),
                new Musico("Ariana", "Grande"),
                new Musico("India", "Martinez"));

        List<String> theBeatles = new ArrayList<>();
        theBeatles.add("Jhon Lennon");
        theBeatles.add("Paul McCartney");
        theBeatles.add("George Harrison");
        theBeatles.add("Ringo Star");

        Musico[] arrayMusicos = listaMusicos.toArray(Musico[]::new);

        Arrays.stream(arrayMusicos).forEach(System.out::println);
        System.out.println("========");

        List<Musico> arrayMusicos2 = List.of();

        arrayMusicos2 = theBeatles.stream()
                .map(musico -> new Musico (musico.split(" ")[0], musico.split(" ")[1]))
                .map(musico -> {
                    musico.setNombre(musico.getNombre().toUpperCase());
                    musico.setApellidos(musico.getApellidos().toUpperCase());
                    return musico;}
                )
                .toList();

        arrayMusicos2.forEach(System.out::println);


        System.out.println("======");
        // Partiendo del objeto theBeatles2 crear un List<String> dejandolo como el original
        List<String> operacionRevertida = arrayMusicos2.stream()
                .map(musico -> musico.getNombre() + " " + musico.getApellidos())
                .toList();

        operacionRevertida.forEach(System.out::println);


    }
}

package com.ipartek.creacion;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Stream;

public class Principal1 {
    public static void main(String[] args) {
        // FORMAS DE CREAR UN STREAM
        // 1) Mediante el metodo static "of" de la clase
        Stream<String> nombres = Stream.of("Pepito", "Juanito", "Jaimito", "Amapola", "Zatón");
        nombres.sorted(Comparator.reverseOrder()).forEach(System.out::println);

        System.out.println("===============================");

        // 2) Mediante el metodo static "stream" de la clase helpers "Arrays"
        String[] equipos = {"Athletic", "Liverpool", "Milan", "Bayern Munich"};
        Stream<String> streamEquipos = Arrays.stream(equipos);

        List<String> resultadoFinal = streamEquipos.filter(s -> !s.startsWith("A")).toList();
        resultadoFinal.forEach(System.out::println);

        // 3) Mediante el metodo "stream" de cualquier objeto Collection (List o Set)
        List<String> lista = new ArrayList<>();
        lista.add("Pera");
        lista.add("Manzana");
        lista.add("Fresa");

        System.out.println("===============================");

        boolean resultado = lista.stream().anyMatch(s -> s.equals("Fresa"));
        System.out.println(resultado ? "Exsiste Fresa" : "No existe Fresa");
    }
}

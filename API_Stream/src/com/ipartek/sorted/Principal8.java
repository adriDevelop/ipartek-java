package com.ipartek.sorted;

import com.ipartek.models.Musico;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Objects;

public class Principal8 {

    public static void main(String[] args) {

        // Sorted
        // Es un operador intermedio que ordena los elementos según el criterio establecido en la implementación del
        // método CompareTo de la interface Comparable o el compare de la interface Comparator de la clase genérica
        // del List.

        List<Musico> musicos = new ArrayList<>();

        musicos.add(new Musico("Ritchie", "Blackmore"));
        musicos.add(new Musico("David", "Gilmour"));
        musicos.add(new Musico("David", "Coverdale"));
        musicos.add(new Musico("Geddy", "Lee"));
        musicos.add(new Musico("Geddy", "Lee"));
        musicos.add(new Musico("Bruce", "Lee"));
        musicos.add(new Musico("David", "Gilmour"));
        musicos.add(new Musico("Ozzy", "Osborne"));
        musicos.add(new Musico("Steve", "Harris"));
        musicos.add(new Musico("Ritchie", "Blackmore"));

        // Siempre que en Java intentemos ordenar objetos de una clase esta clase tiene que implementar Comparator
        // o Comparable de lo contrario Java nos devolverá un ClassCastException
        // En Java no podemos ordenar nada sin un criterio de ordenación
        List<Musico> musicosOrdenados = musicos.stream()
                                               .distinct()
                                               .sorted()
                                               .toList();

        musicosOrdenados.forEach(System.out::println);

        // Pero ¿qué sucede si deseamos ordenar por nombre?
        List<Musico> musicosOrdenados2 = musicos.stream()
                .distinct()
                .sorted(Comparator.comparing(musico -> musico.getNombre()))
                .toList();

        musicosOrdenados2.forEach(System.out::println);

        List<String> nombres = new ArrayList<>();
        nombres.add("José");
        nombres.add("María");
        nombres.add("Juan");
        nombres.add("Jesús");
        nombres.add(null);
        nombres.add("");
        nombres.add("");
        nombres.add("Jaime");
        nombres.add("Juan");
        nombres.add("José");
        nombres.add("José");
        nombres.add(null);
        nombres.add(null);
        nombres.add(null);

        nombres.stream()
                .filter(Objects::nonNull)
                .filter(s -> !s.isEmpty())
                .distinct()
                .sorted()
                .forEach(System.out::println);

        nombres.stream()
                .filter(Objects::nonNull)
                .filter(s -> !s.isEmpty())
                .distinct()
                .sorted(Comparator.reverseOrder())
                .forEach(System.out::println);

        nombres.stream()
                .filter(Objects::nonNull)
                .filter(s -> !s.isEmpty())
                .distinct()
                .sorted(Comparator.comparing(s -> s.length()))
                .forEach(System.out::println);
    }
}

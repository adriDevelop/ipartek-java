package com.ipartek.count_distinct;

import com.ipartek.models.Musico;

import java.lang.invoke.StringConcatException;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

import static java.util.regex.Pattern.matches;

public class Principal6 {

    public static void main(String[] args) {

        // Count
        // Es un operador terminal o final

        // Disctinct
        // Es un operador intermedio
        // Necesita que la clase del genérico del List tenga sobreescritos los métodos equals y hashcode en la clase
        // Object

        // filter
        // Es un operador intermedio-predicado y por lo tanto devuelve un boolean
        // Si devuelve true, el elemento del Stream evaluado, continúa en el Stream
        // si devuelve false, el elemento del Strem evaluado, es eliminado del Stream

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

        // Necesitamos saber el número de nombres diferentes que hay en la lista.
        Long numeroPersonasDiferentes = nombres.stream()
                .filter(Objects::nonNull)
                .filter(s-> !s.isEmpty())
                .distinct()
                .count();

        System.out.println("numeroPersonasDiferentes = " + numeroPersonasDiferentes);

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

        // ¿Qué número de músicos diferentes hay?
        Long numeroMusicosDiferentes = musicos.stream()
                .filter(Objects::nonNull)
                .distinct()
                .count();

        System.out.println("numeroMusicosDiferentes = " + numeroMusicosDiferentes);


    }
}

package com.ipartek.reduce;

import java.util.*;
import java.util.function.IntPredicate;
import java.util.function.Predicate;
import java.util.stream.Collectors;

public class Principal5 {

    public static void main(String[] args) {

        // Reduce
        // Es un operador final de tipo BiFunction
        // Podríamos decir que un reductora nivel programático en Java es una función que partiendo
        // de muchos elementos los reduce a uno.

        // Una de sus sobrecargas (la tercera en el JDK) nos pide dos parámetros:
        // 1) El primero nos pide un "Identity", que es de lo que partimos.
        // De esta forma Java se asegura que el método no va a devolver null y en el caso de que el String venga vacío
        // será su valor por defecto.

        // 2) Nos pide una expresión lambda de tipo BiFunction (ya sabemos que recibe dos parámetros)
        // pero, ¿qué representan esos parámetros?
        // El primero representa el acumulador y el segundo representa el elemento iterado.

        List<String> equiposFutbol = new ArrayList<>();

        equiposFutbol.add("   Real Madrid    ");
        equiposFutbol.add(null);
        equiposFutbol.add("Athletic    ");
        equiposFutbol.add("234");
        equiposFutbol.add(null);
        equiposFutbol.add(null);

        // Crear un String que elimine los datos null y solucione los espacios en blanco.


        String equipos = equiposFutbol.stream()
                .filter(Objects::nonNull)
                .filter(Principal5::metodoCompruebaEsNumeroONull)
                .reduce("", (s, s2) -> s + s2.trim() + " - ");

        System.out.println(equipos);

        // En la primera sobrecarga (en el JDK) en vez de pasar dos parámetros como argumento
        // (como en la tercera sobrecarga) solo le pasamos una expresión de tipo BiFunction.
        // (Realmente, el método pide un BinaryOperator pero tenemos que tener en cuenta que BinaryOperator extiende
        //  de BiFunction)

        // Ahora Java no está seguro que el método no vaya a devolver null, por lo tanto Java utilizando un objeto
        // Optional se asegura de que no ocurra un NullPointerException.
        // En esta sobrecarga y en este ejemplo y en la primera iteracion "a" seria el primer elemento y "b"
        // el segundo elemento.

        // En las demás interaciones "a" seria el acumulador (el return del método BiFunction)

        Optional<String> equipos2 = equiposFutbol.stream()
                .filter(Objects::nonNull)
                .filter(Principal5::metodoCompruebaEsNumeroONull)
                .reduce((s, s2) -> s.trim() + " - " + s2.trim());

        String equiposResultado = equipos2.orElse(equipos);
        System.out.println(equiposResultado);
    }

    public static boolean metodoCompruebaEsNumeroONull(String s) {
        try {
            Integer.parseInt(s);
            return false;
        } catch (NumberFormatException nfe) {
            return true;
        }
    }
}

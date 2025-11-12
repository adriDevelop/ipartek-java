package com.ipartek.predicados;

import java.util.List;
import java.util.Objects;
import java.util.function.BiPredicate;
import java.util.function.Predicate;

public class Principal4 {

    public static void main(String[] args) {

        // Predicados

        // Necesitamos una función que evalúe que un Integer es mayor que diez.
        Predicate<Integer> evaluaMayor10 = numero -> {
            return numero > 10;
        };

        System.out.println(evaluaMayor10.test(11));

        // Necesitamos una función que compruebe si un String que le pasemos es igual a "ROLE_ADMIN"
        Predicate<String> evaluaString = nombre -> {
            return nombre.equals("ROLE_ADMIN");
        };

        System.out.println(evaluaString.test("Role_Admin"));
        System.out.println(evaluaString.test("ROLE_ADMIN"));

        // No teniendo en cuenta las mayúsculas ni minúsculas
        Predicate<String> evaluaStringIgnoreMayusculasYMinusculas = nombre -> {
            return nombre.equalsIgnoreCase("ROLE_ADMIN");
        };

        System.out.println(evaluaStringIgnoreMayusculasYMinusculas.test("Role_admin"));
        System.out.println(evaluaStringIgnoreMayusculasYMinusculas.test("ROLE_ADMIN"));

        // Crear, mediante programación funcional, un método que determine si un número es positivo y par.
        Predicate<Integer> compruebaPositivo = number -> {
            return number > 0;
        };

        Predicate<Integer> compruebaEsPar = number -> {
            return number%2 == 0;
        };

        System.out.println(compruebaPositivo.and(compruebaEsPar).test(4));
        System.out.println(compruebaPositivo.and(compruebaEsPar).test(-2));

        // Crear un ArrayList de enteros y comprobar y sacar por consola si uno a uno cumplen o no las dos condiciones.
        List<Integer> array = List.of(4, 6, 7, 8, 3,2, 1, 9, 0, 98, 41, 32);
        array.forEach(numero -> System.out.println(" " + numero + "->" + compruebaPositivo.and(compruebaEsPar).test(numero)));

        // Comprobar si un String empieza por "A" o termina por "Z"
        Predicate<String> compruebaEmpiezaPorA = cadena -> {
            return cadena.toLowerCase().startsWith("a");
        };

        Predicate<String> compruebaTerminaPorZ = cadena -> {
            return cadena.toLowerCase().endsWith("z");
        };

        Predicate<String> compruebaAmbas = cadena -> {
            return compruebaEmpiezaPorA.or(compruebaTerminaPorZ).test(cadena);
        };

        // Crear ArrayList de palabras y comprobar si cumple ambas condiciones
        List<String> arrayPalabras = List.of("Az", "Asno", "Botella");

        arrayPalabras.forEach(palabra -> System.out.println("Palabra " + palabra + " -> " + compruebaAmbas.test(palabra)));

        // Dada una lista de nombres mostrar solo aquellos que no estén vacíos y tengan más de 3 caracteres.
        List<String> nombres = List.of("", "Adrián", "Luz", "");

        Predicate<String> compruebaVacio = nombre -> {
            return nombre.isEmpty();
        };

        Predicate<String> compruebaMayorTresCaracteres = nombre -> {
            return nombre.length() > 3;
        };

        nombres.forEach(nombre -> {
            System.out.println("Nombre " + nombre + " cumple ? -> " + compruebaVacio.negate().and(compruebaMayorTresCaracteres).test(nombre));
        });

        // Necesitamos una función que compruebe que dos Strings que le pasemos son iguales sin tener en cuenta
        // las mayúsculas o minúsculas.
        BiPredicate<String, String> compruebaIguales = (palabra1, palabra2) -> {
            return palabra1.equalsIgnoreCase(palabra2);
        };

        System.out.println(compruebaIguales.test("Hola", "hola"));

        // Necesitamos un método que reciba un String y un Integer. El método devolverá true si el número de letras
        // que tiene el String coincide con el Integer pasado como segundo argumento (mar, 3), (cielo, 1)
        BiPredicate<String, Integer> compruebaNumeroLetras = (palabra, numeroCaracteres) -> {
            return palabra.length() == numeroCaracteres;
        };

        System.out.println(compruebaNumeroLetras.test("mar", 3));
        System.out.println(compruebaNumeroLetras.test("cielo", 1));
    }
}

package com.ipartek.maptoint_maptolong_maptodouble;

import org.w3c.dom.ls.LSOutput;

import java.util.*;
import java.util.stream.IntStream;

public class Principal2 {
    public static void main(String[] args) {
        // mapToInt - Es un operador intermedio que devuelve un IntStream (NO ES UN STREAM)
        List<String> numerosInt = Arrays.asList("2", "6", "14", "345");
        // Queremos dejar solo los múltiplos de 3 (eliminator los que no son múltiplos de 3)
        // IntPredicate
        // IntConsumer
        numerosInt.stream()
                .mapToInt(Integer::parseInt)
                .filter(i -> i % 3 == 0)
                .forEach(System.out::println);

        // mapToLong - Es un operador intermedio que devuelve un LongStream (NO ES UN STREAM)
        List<String> numerosLong = Arrays.asList("100000", "6", "50001", "345");
        // Queremos dejar solo los números mayores de 50.000
        // ToLongFunction
        // LongConsumer
        System.out.println("=======================");

        numerosLong.stream()
                .mapToLong(Long::parseLong)
                .filter(l -> l > 50000)
                .forEach(System.out::println);

        // mapToDouble - Es un operador intermedio que devuelve un DoubleStream (NO ES UN STREAM)
        List<String> numerosDouble = Arrays.asList("23.5", "1.34", "92.45", "76.23");
        // Queremos imprimir el cuadrado de todos los elementos
        // DobleUnaryOperator
        // DoubleConsumer
        System.out.println("=======================");

        numerosDouble.stream()
                .mapToDouble(Double::parseDouble)
                .map(d -> Math.pow(d, 2))
                .forEach(System.out::println);


        // Obtén el número mayor del ArrayList de númerosLong
        System.out.println("================");
        OptionalLong numeroMayor = numerosLong.stream()
                .mapToLong( s -> Long.parseLong(s))
                .max();

        System.out.println(numeroMayor);


        System.out.println("========");
        // Obtener la media de numerosDouble
        OptionalDouble media = numerosDouble.stream()
                .mapToDouble(s -> Double.parseDouble(s))
                .average();

        if (media.isPresent()){
            System.out.println(media.getAsDouble());
        }

        // Hemos comprobado que para conseguir, en los ejemplos anteriores, el valor máximo o la media
        // lo hemos realizado haciendo varios streams por separado. Dado que los métodos max, double, etc, son finales,
        // si necesitamso conseguir tanto máximo como mínimo, average, sum, podemos utilizar un operador final
        // llamado summaryStatistics().

        // Conseguir el máximo, mínimo, average y suma del ArrayList numeros.
        IntSummaryStatistics summaryStatistics = numerosInt.stream()
                .mapToInt(s-> Integer.parseInt(s))
                .summaryStatistics();

        System.out.println(summaryStatistics);
    }
}

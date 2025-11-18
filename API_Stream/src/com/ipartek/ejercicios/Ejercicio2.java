package com.ipartek.ejercicios;

import java.util.function.BiFunction;
import java.util.function.Function;

public class Ejercicio2 {

    public static void main(String[] args) {

        // Utilizando programación funcional hacer una función que calcule el 21% del IVA
        Function<Double, Double> calculaIva = precio -> precio * 0.21;

        Double precioConIva = calculaIva.apply(120d);

        System.out.println(precioConIva);

        // Utilizando programación funcional hacer una función que calcule el precio total de un producto
        // teniendo en cuenta que el tipo de IVA puede ser variable

        BiFunction<Double, Integer, Double> calculaPrecioTotalProductoIvaVariable = (precio, iva) ->
                precio + (precio * iva) / 100;

        Double precioProductoTotalMasIva = calculaPrecioTotalProductoIvaVariable.apply(120d, 21);

        System.out.println(precioProductoTotalMasIva);
    }
}

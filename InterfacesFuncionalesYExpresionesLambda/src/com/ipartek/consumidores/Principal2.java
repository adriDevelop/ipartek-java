package com.ipartek.consumidores;

import com.ipartek.models.Producto;
import com.ipartek.models.Usuario;

import java.sql.SQLOutput;
import java.util.*;
import java.util.function.BiConsumer;
import java.util.function.Consumer;

public class Principal2 {

    public static void main(String[] args) {
        // Consumer

        Consumer<String> objetoConsumer = (palabra) -> {
            System.out.println(palabra);
        };
        objetoConsumer.accept("Hola buenos dias");

        Consumer<Date> objetoConsumerDate = fecha -> {
            System.out.println(fecha);
        };
        objetoConsumerDate.accept(new Date());

        // Imprimir las letras de una palabra por separado
        Consumer<String> objetoDevuelveLetras = palabra -> {
            char[] letras = palabra.toCharArray();
            for (char letra : letras) {
                System.out.println(letra);
            }
        };

        objetoDevuelveLetras.accept("Hola");

        // Partimos de una lista usar un Consumer<String> para imprimir un saludo personalizado para cada persona
        List<String> personas = Arrays.asList("Ana", "Luis", "Maria", "Carlos");

        // Forma 1 de hacer el ejercicio
        Consumer<String> objeto = saludo ->{
            personas.forEach( persona -> {
                System.out.println(saludo + " " + persona);
            });
        };

        objeto.accept("Hola");

        // Forma 2 de hacer el ejercicio
        Consumer<String> objetosSaludos = persona ->{
            System.out.println("Hola " + persona);
        };

        System.out.println("===========");

        personas.forEach(objetosSaludos);

        // Vamos a crear una clase Producto en modelos con los atributos nombre (String) y precio (double)
        // Crear una lista de productos.
        List<Producto> productos = Arrays.asList(
                new Producto("Monitor 32", 150d),
                new Producto("Monitor 24", 100d),
                new Producto("Monitor 30 curvo", 199d),
                new Producto("Monitor 23", 99d),
                new Producto("Monitor 23 curvo", 120d)
        );

        // Definir dos Consumer<Producto>
        Consumer<Producto> consumerProductoAumentaPrecio10 = producto -> {
            producto.setPrecio(producto.getPrecio() + producto.getPrecio() * 0.10);
        };

        Consumer<Producto> consumerProductoImprimeNombreNuevoPrecio = producto -> {
            System.out.println(producto);
        };

        // Aumentar el precio en 10%
        consumerProductoAumentaPrecio10.accept(productos.get(2));
        // Mostrar producto con precio incrementado
        consumerProductoImprimeNombreNuevoPrecio.accept(productos.get(2));

        // Los podemos sustituir por una sola llamada
        productos.forEach(consumerProductoAumentaPrecio10.andThen(consumerProductoImprimeNombreNuevoPrecio));
        // BiConsumer

        // Crear mediante programación funcional una función que permita dar el nombre a un objeto del tipo Usuario.
        // Crear la clase Usuario en models con un solo atributo nombre (String).
        BiConsumer<Usuario, String> creaUsuario = (usuario, nombre) -> {
            usuario.setNombre(nombre);
            System.out.println(usuario);
        };

        Usuario usuario = new Usuario();
        creaUsuario.accept(usuario, "Adrian");

        // Supongamos que tenemos un Map<String, Double> con productos y precios.
        // Mostrar producto y su precio
        // Calcular e imprimir el precio con IVA (21%)
        // Hacerlo en una sola vez

        Map<String, Double> mapProductos = Map.of("Monitor 32", 150d,"Monitor 24", 100d, "Monitor 30 curvo", 199d, "Monitor 23", 99d , "Monitor 23 curvo", 120d);

        System.out.println();

        BiConsumer<String, Double> biConsumerProductosConIva = (nombre, precio) -> {
            System.out.println("PRECIOS CON IVA" + " -> " + "Producto con nombre " + nombre + " tiene el precio con iva de " + (precio + precio*0.21));
        };

        System.out.println();

        BiConsumer<String, Double> biConsumerProductosSinIva = (nombre, precio) -> {
            System.out.println("PRECIOS SIN IVA" + " -> " + "Producto con nombre " + nombre + " tiene el precio sin iva de " + precio);
        };



        mapProductos.forEach(biConsumerProductosConIva.andThen(biConsumerProductosSinIva));


        Consumer<Map<String, Double>> consumerProductosSinIva = map -> {
            map.forEach((nombre, precio) -> {
                System.out.println("PRECIOS SIN IVA" + " -> " + "Producto con nombre " + nombre + " tiene el precio sin iva de " + precio);
            });
        };

        Consumer<Map<String, Double>> consumerProductosConIva = map -> {
            map.forEach((nombre, precio) -> {
                System.out.println("PRECIOS CON IVA" + " -> " + "Producto con nombre " + nombre + " tiene el precio con iva de " + (precio + precio*0.21));
            });
        };

        System.out.println("===============");
        consumerProductosConIva.accept(mapProductos);
        consumerProductosSinIva.accept(mapProductos);

    }
}

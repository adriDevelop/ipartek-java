package com.ipartek.flatmap;

import com.ipartek.models.Persona;
import com.ipartek.models.Viaje;

import java.util.ArrayList;
import java.util.List;

public class Principal4 {

    public static void main(String[] args) {

        // El operador FlatMap es un operador intermedio
        // Su misión es convertir un list de varios niveles en un único list con todos los datos unificados

        // Recibimos de una BBDD con todas las referencias que tenemos en nuestra tienda
        // Pero la bbdd nos proporciona esos datos separados por departamentos

        // Vamos a simular lo que recibimos
        List<String> referenciasPantalones = List.of("P234", "P009", "P900");
        List<String> referenciasCamisas = List.of("C876", "C430", "C654", "C001");
        List<String> referenciaZapatos = List.of("Z001", "Z002", "Z003", "Z004");

        List<List<String>> todasLasReferencias = new ArrayList<>();
        todasLasReferencias.add(referenciasPantalones);
        todasLasReferencias.add(referenciasCamisas);
        todasLasReferencias.add(referenciaZapatos);

        todasLasReferencias.forEach(referencia -> {
            System.out.println(referencia);
        });

        System.out.println("======");

        // Si quisieramos representar el objeto "todasLasRefencias" sería algo parecido a esto
        // [ [], [], [] ]

        // Necesitamos pasar esos datos a un solo array (aplanar...)
        // El resultado final que queremos es algo parecido a esto
        // []
        List<String> todasLasReferenciasString = todasLasReferencias.stream()
                .flatMap(al -> al.stream())
                .toList();

        todasLasReferenciasString.forEach(System.out::println);

        // 1) Crear la clase Viaje va a tener dos atributos paisesDestino(String) y precio(Double)
        // 2) Getters y Setters y toString()
        // 3) Crear 4 objetos viaje con diferentes destinos (Suecia, Italia, Inglaterra, México)
        // 4) Crear la clase Persona va a tener nombre(String), listadoDeViajes(List<Viaje>)
        // 5) Crear un método que deje que la persona agregue un viaje a su lista
        // 6) Crear un método que devuelva el precio de todos los viajes que ha realizado esa persona
        // 7) Crear un método que devuelva un String con todos los viajes que haya realizado separados por ' - '.

        Persona p1 = new Persona("Adrian");
        Persona p2 = new Persona("Andrea");
        p1.viajar(new Viaje("Suecia", 360d));
        p1.viajar(new Viaje("Italia", 200d));
        p1.viajar(new Viaje("Inglaterra", 400d));
        p1.viajar(new Viaje("México", 900d));

        p2.viajar(new Viaje("Suecia", 360d));

        System.out.println("========");
        System.out.println(p1);
        System.out.println(p2);

        // Necesitamos conseguir un ArrayList con todos los viajes que han hecho todos nuestros clientes
        List<Persona> clientes = List.of(p1, p2);

        List<Viaje> viajesClientes =  clientes.stream()
                .map(Persona::getArrayListViajes)
                .flatMap(viaje -> viaje.stream())
                .toList();

        viajesClientes.forEach(System.out::println);
    }
}

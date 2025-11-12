package com.ipartek.funciones;

import com.ipartek.models.Alumno;
import com.ipartek.models.Alumno2;
import com.ipartek.models.Usuario;

import java.util.List;
import java.util.function.BiFunction;
import java.util.function.Function;

public class Principal3 {

    public static void main(String[] args) {

        // Function

        // Necesitamos una función que cree un nuevo usuario con su nombre.
        Function<String, Usuario> crearUsuario = nombre -> {
            return new Usuario(nombre);
        };
        Usuario adrian = crearUsuario.apply("Adrian");
        System.out.println(adrian);

        // Necesitamos una función que reciba un Usuario (con nombre) y devuelva su nombre.
        Function<Usuario, String> devuelveNombre = usuario -> {
            return usuario.getNombre();
        };
        System.out.println(devuelveNombre.apply(adrian));

        // Crear una función que convierta y devuelva un texto en mayúsculas
        Function<String, String> devuelveEnMayusculas = String::toUpperCase;
        System.out.println(devuelveEnMayusculas.apply("hola"));

        // Crear una función que convierta y devuelva un texto en minusculas
        Function<String, String> devuelveEnMinusculas = String::toLowerCase;
        System.out.println(devuelveEnMinusculas.apply("HOlI"));

        // Crear una función que elimine de espacios en blanco adelante y atrás una cadena.
        Function<String, String> devuelveSinEspacios = String::trim;
        System.out.println(devuelveSinEspacios.apply("                    HOLA       "));

        System.out.println(devuelveSinEspacios.andThen(devuelveEnMayusculas).apply("             HOLA  "));

        // Crear mediante programación funcional una función que reciba un precio y devuelva el precio con un 15% de
        // descuento.
        Function<Double, Double> devuelveDescuento = precio -> {
          return precio - precio*0.15;
        };

        // Crear mediante programación funcional una función que reciba un precio y devuelva el precio con un incremento
        // de 3 euros.
        Function<Double, Double> devuelvePrecioIncrementado = precio -> {
            return precio + 3;
        };

        // Crear una función que realice las dos funciones al mismo tiempo.
        Function<Double, Double> devuelvePrecioConDescuentoEIncremento = precio -> {
            return devuelvePrecioIncrementado.andThen(devuelveDescuento).apply(precio);
        };

        System.out.println(devuelvePrecioConDescuentoEIncremento.apply(14d));

        // Crear un List con precios y sacar por consola esos precios con un 15% de descuento e incrementados en 3
        // euros.
        List<Double> precios = List.of(4d, 80d, 34d, 98d);

        for (Double precio : precios) {
            System.out.println("->->->->");
            System.out.println("Precio original -> " + precio);
            System.out.println("15% de descuento -> " + devuelveDescuento.apply(precio));
            System.out.println("3 euros de incremento -> " + devuelveDescuento.andThen(devuelvePrecioIncrementado).apply(precio));
        }

        // Mismo ejercicio pero con compose
        for (Double precio : precios) {
            System.out.println("->->->->");
            System.out.println("Precio original -> " + precio);
            System.out.println("15% de descuento -> " + devuelveDescuento.apply(precio));
            System.out.println("3 euros de incremento y despues 15% de descuento -> " + devuelveDescuento.compose(devuelvePrecioIncrementado).apply(precio));
        }

        // Crear mediante programación funcional una función que devuelva el área de un rectángulo.
        BiFunction<Double, Double, Double> devuelveAreaRectangulo = (base, altura) -> {
            return base*altura;
        };

        System.out.println("El área del rectángulo es: " + devuelveAreaRectangulo.apply(4d, 8d));

        // Crear mediante programación funcional una función que reciba dos notas y devuelva la media.
        BiFunction<Double, Double, Double> devuelveMedia = (nota1, nota2) -> {
            return (nota1 + nota2) /2;
        };

        // Crear mediante programación funcional una función que reciba una nota y me diga si el alumno está
        // aprobado.
        Function<Double, String> devuelveResultado = nota -> {
            return nota >=5 ? "El alumno está aprobado" : "El alumno está suspenso";
        };

        Double media = devuelveMedia.apply(4d, 5d);
        System.out.println(devuelveResultado.apply(media));

        // Crear una función que haga las dos cosas al mismo tiempo.
        BiFunction<Double, Double, String> devuelveMediaYResultado = (nota1, nota2) -> {
            return devuelveMedia.andThen(devuelveResultado).apply(nota1, nota2);
        };

        System.out.println(devuelveMediaYResultado.apply(4d, 8d));

        // Crear la clase Alumno en models: nombre (String), notaMatematicas (Double), notaFisica(Double).
        // Crear un List de alumnos (4 o 5)
        // Sacar por consola: nombre - nota media - resultado (aprobado o suspendido)

        List<Alumno> alumnos = List.of(
                new Alumno("Adrian", 4d, 5d),
                new Alumno("Joselu", 8d, 9d),
                new Alumno("Miguel", 9d, 9d),
                new Alumno("Paco", 9d, 6d)
        );

        alumnos.forEach( alumno -> {
            devuelveMediaYResultado.apply(alumno.getNotaMatematicas(), alumno.getNotaFisica());
        });

        List<Alumno2> alumnos2 = List.of(
                new Alumno2("Adrian", List.of(4d, 5d)),
                new Alumno2("Joselu", List.of(8d, 9d)),
                new Alumno2("Miguel", List.of(9d, 9d)),
                new Alumno2("Paco", List.of(9d, 6d))
        );

        Function<List<Alumno2>, List<Alumno2>> devuelveMedia2 = alumnosArrayMedia -> {
            Double resultado = 0d;

            for (Alumno2 v : alumnosArrayMedia) {
                for (Double vNota : v.getNotas()) {
                    resultado += vNota;
                }
                v.setNotaMedia(resultado / v.getNotas().toArray().length);
                resultado = 0d;
            }
            return alumnosArrayMedia;
        };

        Function<List<Alumno2>, List<Alumno2>> devuelveResultado2 = alumnosArray -> {
            for(Alumno2 a : alumnosArray){
                if (a.getNotaMedia() >= 5){
                    a.setEstadoExpediente("Está aprobado");
                }else {
                    a.setEstadoExpediente("Está suspenso");
                }
            }
            return alumnosArray;
        };

        // Crear una función que haga las dos cosas al mismo tiempo.
        Function<List<Alumno2>, List<Alumno2>> devuelveMediaYResultado2 = (notas) -> {
            return devuelveMedia2.andThen(devuelveResultado2).apply(notas);
        };

        List<Alumno2> alumnosCalificados = devuelveMediaYResultado2.apply(alumnos2);

        alumnosCalificados.forEach(System.out::println);


    }
}

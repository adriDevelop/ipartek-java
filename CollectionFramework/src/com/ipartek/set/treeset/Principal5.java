package com.ipartek.set.treeset;

import com.ipartek.set.models.Personaje;

import java.util.HashSet;
import java.util.Set;
import java.util.TreeSet;

public class Principal5 {

    public static void main(String[] args) {

        // Los TreeSet no admiten duplicados como todos los Sets.
        // Son los únicos Sets que se pueden ordenar con un criterio.
        // Ese criterio es de pre-ordenamiento no como los list que es post-ordenamiento.

        // Para los objetos de las clases que implementan Comparable debe existir una coherencia o
        // trabajo en equipo entre los mñetodos equals, hashCode y el compareTo.

        // Si el criterio de pre-ordenamiento de un TreeSet es inconsistente con la implementación del método
        // equals de su clase genérica del Set, este no obedece el contrato de la interface Set y por lo tanto
        // funciona incorrectamente.

        // En un Set normal el criterio de igualdad para todos los nuevos elementos candidatos a ingresar en él,
        // se realiza en torno a los métodos equals y hashCode. Pero en un set ordenado esas comparaciones son
        // realizadas utilizando su método compareTo de la clase comparable, por lo que dos elementos que se consideran
        // iguales, es decir, que el método devuelve 0 en igualdad, desde un punto de vista de un Set ordenado
        // son iguales y esto, vamos a comprobar, que nos puede llevar a errores de interpretación lógica.



        // Vamos a hacer un TreeSet con un Tipo Genérico del JDK
        Set<String> personajes = new TreeSet<>();

        personajes.add("Elfo");
        personajes.add("Elfo");
        personajes.add("Hobbit");
        personajes.add("Humano");
        personajes.add("Enano");
        personajes.add("Orco");
        personajes.add("Orco");
        personajes.add("Goblin");
        personajes.add("Mago");
        personajes.add("Dragón");

        // Comprobamos que esta ordenado alfanuméricamente porque en la claseString así está implementado
        // el ordenamiento en el método compareTo de la interface Comparable.
        personajes.forEach(System.out::println);

        // Ahora vamos a hacer un TreeSet con un Tipo Genérico PROPIO.

        // Para un tipo propio o cualquier tipo del JDK pueda ser el genérico de un Set ordenado, tenemos que cumplir
        // una condición que la clase propia o del JDK implemente de Comparable para que esa clase tenga un criterio de
        // ordenamiento.

        // Entonces, para rellenar un TreeSet con Objetos de la clase Personaje, necesitaremos OBLIGATORIAMENTE, tener un
        // criterio de pre-ordenamiento. De lo contrario obtendremos la excepción ClassCastException().

        // En un TreeSet el ordenamiento es un pre-ordenamiento.
        Set<Personaje> personajes2 = new TreeSet<>();
        personajes2.add(new Personaje("Elfo", 8, 10));
        personajes2.add(new Personaje("Orco", 10, 5));
        personajes2.add(new Personaje("Orco", 5, 10));
        personajes2.add(new Personaje("Orco", 5, 10));
        personajes2.add(new Personaje("Hobbit", 5, 8));
        personajes2.add(new Personaje("Elfo", 8, 10));

        System.out.println("========================");

        personajes2.forEach(System.out::println);

    }
}

package com.ipartek.list.linkedlist;

import com.ipartek.list.models.Arbol;

import java.sql.SQLOutput;
import java.util.ArrayList;
import java.util.Collections;
import java.util.LinkedList;
import java.util.List;

public class Principal2 {

    public static void main(String[] args) {
        LinkedList<Arbol> arboles = new LinkedList<>();

        arboles.add(new Arbol("Fresno", 13D));
        arboles.add(new Arbol("Roble", 10D));
        arboles.add(new Arbol("Fresno", 13D));
        arboles.add(new Arbol("Nogal", 9D));
        arboles.add(new Arbol("Nogal", 11D));
        arboles.add(new Arbol("Cerezo", 13D));
        arboles.add(new Arbol("Cerezo", 8D));
        arboles.add(new Arbol("Almendro", 3D));
        arboles.add(new Arbol("Limonero", 4D));
        arboles.add(new Arbol("Limonero", 7D));

        arboles.forEach(System.out::println);

        Collections.sort(arboles);

        // Métodos propios de los LinkedList

        // Método addFirst() : Añade un elemento al principio de la lista.
        arboles.addFirst(new Arbol("Olivo", 4d));

        // Método addLast() : Añade un elemento al final de la lista.


        // Método getFirst() : Devuelve una referencia del primer elemento de la lista (no la elimina).
        //                     En caso de no encontrarla lanza la excepción "NoSuchElementException"


        // Método getLast() : Devuelve una referencia del último elemento de la lista (no la elimina).
        //                     En caso de no encontrarla lanza la excepción "NoSuchElementException"


        // Método peekFirst() : Devuelve una referencia del primer elemento de la lista (no la elimina).
        //                      En caso de no encontrarla devuelve null. No lanza ninguna excepción.


        // Método peekFirst() : Devuelve una referencia del primer elemento de la lista (no la elimina).
        //                      En caso de no encontrarla devuelve null. No lanza ninguna excepción.


        // Método peek() : Lo mismo que peekFirst().

        // La eliminación de un elemento desplaza los elementos siguientes hacia la izquierda.
        // Es decir, resta 1 a todos los indices desde la posición del elemento eliminado excepto
        // si eliminamos el último.

        // Método removeFirst() : Devuelve una referencia del primer elemento pero este elemento queda eliminado (borrado).
        //                     En caso de no encontrar el elemento lanza la excepción NoSuchElementException().



        // Método removeLast() : Devuelve una referencia del último elemento pero este elemento queda eliminado (borrado).
        //                     En caso de no encontrar el elemento lanza la excepción NoSuchElementException().



        // Método remove() : Devuelve una referencia del elemento especificado por el indice pasado pcomo argumento y este elemento queda eliminado.
        //                 Si no lo encuentra lanza la excepción IndexOutOfBoundsException().
        // Este método tiene varias sobrecargas:

        //      La primera es la que nos pide un indice, como hemos indicado antes. En el cual se elimina el elemento que se encuentre en ese índice.
        //      Una de ellas es en la que no pasamos ningun argumento, en este caso, se elimina el primer elemento de la lista (actúa igual que removeFirst()).
        //      Tiene una tercera sobrecarga en la que el método nos pide un objeto.


        // Método pollFirst() y poll() : Estos métodos devuelven una referencia del primer elemento y este queda eliminado.
        //                           Si el elemento no ha sido encontrado, no lanza excepción. Devuelve null.


        // Método pollLast() : Este método devuelve una referencia del último elemento y este queda eliminado.
        //                   Si el elemento no es encontrado, no lanza nada. Devuelve null.


        // Método pop() : Igual que el removeFirst().


        // Cuando utilizar LinkedList:
        // 1) Cuando realizamos muchas inseciones o eliminaciones en medio de la lista.
        // 2) Cuando las operaciones frecuentes (inserción o eliminación) se van a realizar en los extremos.
        // 3) Cuando no necesitamos un acceso aleatorio frecuente:
        //           Acceder a un elemento por índice (por ejemplo utilizando get(índice).
        // 4) Cuando trabajamos con estructuras dinámicas de datos:
        //           Cuando utilizamos un List para algo mas que almacenar datos... (hacer múltiples cambios).

        // Cuando no utilizar un linkedList:
        // 1) Cuando necesitas un acceso rápido por índice (mucho mejor un ArrayList).
        // 2) Cuando el tamaño del List no cambia frecuentemente (o lo utilizamos para almacemar unos datos iniciales).
        // 3) El tamaño del List es muy grande (millones de elementos).



        System.out.println("===========================");


        arboles.forEach(System.out::println);
    }
}

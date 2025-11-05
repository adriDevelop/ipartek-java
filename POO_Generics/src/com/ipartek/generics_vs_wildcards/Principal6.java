package com.ipartek.generics_vs_wildcards;

public class Principal6 {

    public static void main(String[] args) {

        // Métodos genéricos y wildcards

        // Para describir un método genérico con un argumento genérico
        // debemos utilizar un parámetro de tipo <T>.
        // Por ejemplo, vamos a crear un método genñerico que imprima
        // cualquier objeto que le pasemos.
        imprimir(new Arbol("Almendro"));
        imprimir(new Casa("13 Rue del Percebe"));
        imprimir("hola");

        // Los wildcards solo se pueden utilizar como parámetros de referencia

        // Límites o Bounds
        // En tipos genéricos
        // El límite o bound en tipo genérico nos permite restringir qué tipos podemos utilizar en el lugar del
        // tipo genérico.
        // Esta característica de Java permite tratar los genéricos de forma polimórfica...
        // Por ejemplo: es posible que un método que opere con números solo quiera aceptar instancias de la clase
        // Number o de sus subclases wrappers numéricos.
        // Podemos usar tipos parametrizados de dos formas:
        // 1) tipos ilimitados: List<T> representa una lista de tipos T.
        // 2) tipos acotados o limitados: List <T extends Number & Comparable> - representa una lista de tipos T y sus
        //                                subtipos que tienen que extender de Number y que implemente Comparable.
        // Este tipo de anotación clase & interface, requiere que se coloque en primer lugar la clase y posteriormente
        // la declaración de la interface.
        // Normal finales:
        // 1) No podemos utilizar, a diferencia de las Wildcards, tipos parametrizados límite inferior, super...
        // 2) Los genéricos, tipos parametrizados, pueden tener múltiples límites. Los Wildcards no.

        // En Wildcards
        // Podemos utilizar WildCards con límites de dos formas:
        // 1) ilímitados: List<?> - Representa una lista de cualquier tipo.
        // 2) con límite superior: List<? extends Number> - Representa una lista de Number o de cualquiera de sus
        //                         subclases.
        // 3) con límite inferior: List<? super Integer> - Representa una lista de Integer o de sus super tipos.

    }

    public static <T> void imprimir(T item) {
        System.out.println(item);
    }

//    public static void imprimir2( ? item){
//        System.out.println(item);
//    }

    // En qué circunstancias utilizaremos uno u otro, tipos parametrizados o wildcards
    // Los wildcards hacen el código más simple y flexible.
    // A nivel general si observamos que un parámetro de tipo genérico aparece sólo una vez en la declarción de un
    // método, deberíamos considerar reemplazarlo por un wildcard.
    // Si no existen límites inferiores o superiores, el Wildcard representa cualquier tipo.
    // public static <E> void unir(List<E> laLista){}
    // Deberíamos de sustituir este método por este.
    // public static void unir(List<?> laLista){}

    // Cuándo utilizar tipos genéricos.
    // 1) Cuando queramos utilizar un tipo concreto y utilizarlo dentro del método, clase o interface.
    // 2) Cuando vayamos a modificar, escribir o leer datos de ese tipo.
    // 3) Cuando necesitemos utilizar un fuerte tipado para poderlo reutilizar en varios lugares.
    // 4) Siempre y cuando estés implementando estructuras genéricas. Clases, Interfaces o Métodos.

    // Cuando utilizar wildcards
    // 1) Cuando no necesitemos modificar la estructura. Solo leerla.
    // 2) Cuando necesitemos trabajar con subtipos o supertipos sin definir un tipo genérico.
    // 3) Cuando estemos consumiendo estructuras genéricas. List<T> === List<?>
    // 4) No podemos utilizar un WildCard si no existe una estructura genérica definida. Los Wildcards solo se pueden
    //    utilizar como parámetros de referencia.

}

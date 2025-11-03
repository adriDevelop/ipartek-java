package com.ipartek.map.hashmap;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;

public class Principal9 {

    public static void main(String[] args) {

        // Un HashMap, como todos los maps, almacena los elementos en pares clave-valor.
        // Ambos, clave y valor, no tienen por qué ser del mismo tipo.
        // Tanto clave como valor tienen que ser tipos, no admiten primitivos. En todo el CollectionFramework los
        // Genéricos tienen que ser clases.

        // Hay que tener en cuenta que debemos utilizar como keys clases inmutables.
        // En un HashMap los elementos no se almacenan en un orden determinado.
        Map<Integer, String> equipo = new LinkedHashMap<>();

        equipo.put(1, "Unai Simón"); // Si añado un elemento con un key que no existe, el método devuelve null.
        equipo.put(3, "Vivian");
        equipo.put(9, "Iñaki Williams");
        equipo.put(11, "Nico Williams");
        equipo.put(8, "Sancet");
        
        equipo.forEach((key, value) -> {
            System.out.println("key = " + key);
            System.out.println("value = " + value);
        });

        // Métodos de los HashMaps

        // Método put: Sirve para insertar datos en un Map como hemos visto anteriormente.
        //             En el caso de que exista, su value quedará reemplazado por el nuevo value.
        //             Cuando eso ocurre, el método devuelve el value reemplazado y, si no existe,
        //             Se creará un nuevo elemento y el método nos devolverá null.

        // Método size: Devuelve el número de elementos contenidos en un Map.

        // Método values: Devuelve los valores del Map.

        // Método keySet: Devuelve los Keys de un Map en forma de Set.

        // Método replace: Le pasamos como primer elemento el key y, si encuentra concurrencia modifica su value
        //                 con el pasado como segundo argumento, devolviéndonos una referencia del anterior.

        // Método get: Devuelve el value asignado a la clave que le pasamos como argumento.
        //             Esto no significa que el elemento haya sido eliminado del Map.

        // Método forEach: Sirve para iterar el Map pasándole una expresión Lambda de tipo BiFunction.

        // Método clear: Borra completamente todo el contenido del Map.

        // Todos estos métodos son comunes a todos los Maps, LinkedHashMap, HashMap y TreeMap.
    }
}

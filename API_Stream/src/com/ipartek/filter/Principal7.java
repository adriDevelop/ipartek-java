package com.ipartek.filter;

import com.ipartek.models.Musico;

import java.util.ArrayList;
import java.util.List;

public class Principal7 {

    public static void main(String[] args) {

        // Filter
        // Es un operador intermedio de tipo predicado (por lo tanto devuelve un boolean)
        // Si devuelve true el elemento queda en el Stream y si devuelve false el elemento es eliminado del Stream

        List<Musico> musicos = new ArrayList<>();

        musicos.add(new Musico("Ritchie", "Blackmore"));
        musicos.add(new Musico("David", "Gilmour"));
        musicos.add(new Musico("David", "Coverdale"));
        musicos.add(new Musico("Geddy", "Lee"));
        musicos.add(new Musico("Geddy", "Lee"));
        musicos.add(new Musico("Bruce", "Lee"));
        musicos.add(new Musico("David", "Gilmour"));
        musicos.add(new Musico("Ozzy", "Osborne"));
        musicos.add(new Musico("Steve", "Harris"));
        musicos.add(new Musico("Ritchie", "Blackmore"));

        // Obtener un ArrayList de músicos en el que solo se encuentren los músicos llamados David y además
        // sin duplicados

        List<Musico> musicosLlamadosDavid = musicos.stream()
                                            .filter(m -> m.getNombre().equals("David"))
                                            .distinct()
                                            .toList();

        musicosLlamadosDavid.forEach(System.out::println);
    }
}

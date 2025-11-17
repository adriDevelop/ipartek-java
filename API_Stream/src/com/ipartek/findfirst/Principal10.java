package com.ipartek.findfirst;

import com.ipartek.models.Musico;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class Principal10 {

    public static void main(String[] args) {

        // Findfirst
        // Es un operador terminal de cortocircuito y lo usaremos cuando necesitemos obtener el primer elemento
        // de un Stream sin ningún tipo de criterio.
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

        musicos.stream()
                .sorted(Comparator.reverseOrder())
                .findFirst().ifPresent(System.out::println);
    }
}

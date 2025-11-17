package com.ipartek.findany;

import com.ipartek.models.Musico;

import java.util.ArrayList;
import java.util.List;

public class Principal9 {

    public static void main(String[] args) {

        // Findany
        // Es un operador terminal de cortocircuito (cuando cumple su misión el stream acaba)
        // Lo utilizaremos cuando necesitemos obtener algún elemento del stream sin importarnos orden o cualquier
        // otro tipo de criterio
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
                .filter(m -> m.getApellidos().equals("Lee"))
                .findAny().ifPresent(System.out::println);
    }
}

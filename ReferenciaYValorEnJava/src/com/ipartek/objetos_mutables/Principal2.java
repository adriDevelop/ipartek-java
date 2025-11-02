package com.ipartek.objetos_mutables;

import java.util.ArrayList;
import java.util.List;

public class Principal2 {

    public static void miMetodo(List<Gato> gatos){
        Gato gato = new Gato("Adrián");
        Gato gato2 = new Gato("Joselu");
        gatos.add(gato);
        gatos.add(gato2);
    }


    public static void main(String[] args) {
        List<Gato> gatos = new ArrayList<>();
        miMetodo(gatos);
        gatos.forEach(gato -> {
            System.out.println(gato.getNombre());
        });
    }
}

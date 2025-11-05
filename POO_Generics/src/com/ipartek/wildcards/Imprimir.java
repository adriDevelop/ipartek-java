package com.ipartek.wildcards;

import java.util.List;

public class Imprimir {

    public static void imprimirMensajeSimple(String elMensaje){
        System.out.println(elMensaje);
    }

    public static void imprimirLista(List<?> laLista){
        laLista.forEach(System.out::println);
    }
}

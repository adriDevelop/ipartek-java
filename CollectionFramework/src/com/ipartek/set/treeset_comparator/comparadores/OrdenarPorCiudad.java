package com.ipartek.set.treeset_comparator.comparadores;

import com.ipartek.set.models.Estudiante;

import java.util.Comparator;

public class OrdenarPorCiudad implements Comparator<Estudiante> {


    @Override
    public int compare(Estudiante ordenarPorCiudad, Estudiante t1) {
         int resultado = ordenarPorCiudad.getCiudad().compareToIgnoreCase(t1.getCiudad());

         if (resultado == 0 && !ordenarPorCiudad.equals(t1)){
             return 1;
         }

         return resultado;
    }
}

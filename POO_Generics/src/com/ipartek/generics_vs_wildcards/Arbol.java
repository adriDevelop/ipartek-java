package com.ipartek.generics_vs_wildcards;

public class Arbol {
    private String especie;

    public Arbol(String especie) {
        this.especie = especie;
    }

    public String getEspecie() {
        return especie;
    }

    public void setEspecie(String especie) {
        this.especie = especie;
    }

    @Override
    public String toString() {
        return "Árbol de tipo: " + especie;
    }
}

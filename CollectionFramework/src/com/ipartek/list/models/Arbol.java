package com.ipartek.list.models;

import java.util.Locale;
import java.util.Objects;

public class Arbol implements Comparable<Arbol>{

    private String especie;
    private Double altura;

    public Arbol(String especie, Double altura){
        this.especie = especie;
        this.altura = altura;
    }

    public String getEspecie() {
        return especie;
    }

    public void setEspecie(String especie) {
        this.especie = especie;
    }

    public Double getAltura() {
        return altura;
    }

    public void setAltura(Double altura) {
        this.altura = altura;
    }

    @Override
    public String toString() {
        return "Hola soy un " + this.especie + " y mido " + this.altura + "m.";
    }

    @Override
    public int compareTo(Arbol arbol) {
        if (this.altura > arbol.altura){
            return 1;
        }else if (this.altura < arbol.altura){
            return -1;
        }else {
            return 0;
        }
    }

    @Override
    public boolean equals(Object o) {
        if (o == null || getClass() != o.getClass()) return false;
        Arbol arbol = (Arbol) o;
        return Objects.equals(especie, arbol.especie) && Objects.equals(altura, arbol.altura);
    }

    @Override
    public int hashCode() {
        return Objects.hash(especie, altura);
    }
}

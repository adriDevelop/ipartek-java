package com.ipartek.set.models;

import java.util.Objects;

public class Personaje implements Comparable<Personaje>{

    private String tipo; // Orco, elfo ...
    private Integer fuerza; // 0-10
    private Integer inteligencia; // 0-10

    public Personaje(String tipo, Integer fuerza, Integer inteligencia){
        this.tipo = tipo;
        this.fuerza = fuerza;
        this.inteligencia = inteligencia;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public Integer getFuerza() {
        return fuerza;
    }

    public void setFuerza(Integer fuerza) {
        this.fuerza = fuerza;
    }

    public Integer getInteligencia() {
        return inteligencia;
    }

    public void setInteligencia(Integer inteligencia) {
        this.inteligencia = inteligencia;
    }

    @Override
    public String toString() {
        return "Hola soy un personaje " + this.tipo +
                " con fuerza " + this.fuerza +
                " y con inteligencia " + this.inteligencia;
    }

    @Override
    public int compareTo(Personaje personaje) {

        int resultado = this.fuerza - personaje.fuerza;

        if (resultado == 0 && !this.equals(personaje)){
            return 1;
        }else{
            return resultado; // El truco consiste en no devolver 0 más que en el caso de que equals haya establecido de
                              // que son iguales...
        }
    }

    @Override
    public int hashCode() {
        return Objects.hash(this.tipo, this.fuerza, this.inteligencia);
    }

    @Override
    public boolean equals(Object o) {
        if (o == null || getClass() != o.getClass()) return false;
        Personaje personaje = (Personaje) o;
        return Objects.equals(tipo, personaje.tipo) && Objects.equals(fuerza, personaje.fuerza) && Objects.equals(inteligencia, personaje.inteligencia);
    }
}

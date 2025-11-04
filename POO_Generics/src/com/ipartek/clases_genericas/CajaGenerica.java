package com.ipartek.clases_genericas;

public class CajaGenerica<T>{

    private T dato;

    public CajaGenerica(T dato){
        this.dato = dato;
    }

    public T getDato() {
        return dato;
    }

    public void setDato(T dato) {
        this.dato = dato;
    }

    @Override
    public String toString() {
        return "CajaGenérica con datos " + this.dato;
    }
}

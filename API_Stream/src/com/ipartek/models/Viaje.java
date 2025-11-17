package com.ipartek.models;

public class Viaje {

    private String destino;
    private Double precio;

    public Viaje(String destino, Double precio) {
        this.destino = destino;
        this.precio = precio;
    }

    public String getDestino() {
        return destino;
    }

    public void setDestino(String destino) {
        this.destino = destino;
    }

    public Double getPrecio() {
        return precio;
    }

    public void setPrecio(Double precio) {
        this.precio = precio;
    }

    @Override
    public String toString() {
        return this.destino + ":" + this.precio + "€";
    }
}

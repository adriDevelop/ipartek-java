package com.ipartek.models;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Persona {

    private String nombre;
    private List<Viaje> listadoViajes = new ArrayList<>();

    public Persona(String nombre) {
        this.nombre = nombre;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getListadoViajes() {
        return listadoViajes.stream()
                .map(Viaje::toString)
                .reduce("", (a, b) -> a + b + "\n" );
    }

    public List<Viaje> getArrayListViajes(){
        return this.listadoViajes;
    }

    public void viajar(Viaje viaje) {
        this.listadoViajes.add(viaje);
    }

    public Double retornaPrecioViajes() {
        return this.listadoViajes.stream()
                .mapToDouble(Viaje::getPrecio)
                .sum();
    }

    @Override
    public String toString() {
        return this.getNombre() + "\n" + this.getListadoViajes() + "\n" + "\n" + this.retornaPrecioViajes() +" € \n";
    }
}

package com.ipartek.polimorfismo;

import java.util.ArrayList;
import java.util.List;

public class Camion implements Vehiculo, Cargable{
    private String marca;
    private Double cargaMaxima;
    private List<Transportable> compartimento = new ArrayList<>();
    private Persona propietario;

    public Camion(String marca, Double cargaMaxima, Persona propietario){
        this.marca = marca;
        this.cargaMaxima = cargaMaxima;
        this.propietario = propietario;
    }

    public Persona getPropietario() {
        return propietario;
    }

    public void setPropietario(Persona propietario) {
        this.propietario = propietario;
    }

    public Double getCargaMaxima() {
        return cargaMaxima;
    }

    public void setCargaMaxima(Double cargaMaxima) {
        this.cargaMaxima = cargaMaxima;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public List<Transportable> getCompartimento() {
        return compartimento;
    }

    public void setCompartimento(List<Transportable> compartimento) {
        this.compartimento = compartimento;
    }

    public Double sumatorioDePeso(){
        double sumaCargaActual = 0;
        for(Transportable transportable: this.compartimento){
            sumaCargaActual += transportable.getPeso();
        }

        return sumaCargaActual;
    }

    @Override
    public void ingresaEnCompartimentoDeCarga(Transportable item) {
        this.compartimento.add(item);
    }

    @Override
    public boolean compruebaSiElNuevoItemCabe(Transportable item) {
        double totalPeso = sumatorioDePeso();
        return totalPeso + item.getPeso() < this.getCargaMaxima();
    }

    @Override
    public void acelerar() {

    }

    @Override
    public void frenar() {

    }

    @Override
    public String toString() {
        return "Soy un camion";
    }

}

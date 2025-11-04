package com.ipartek.interfaces_genericas;

public class MiClase3 implements MiInterfaceGenerica<Animal, Transporte, Edificio>{
    @Override
    public Animal metodo1(Animal s) {
        return s;
    }

    @Override
    public Edificio metodo2(Transporte a, Transporte b) {
        return new Edificio();
    }
}

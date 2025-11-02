package com.ipartek.polimorfismo;

public class Principal2 {

    public static void main(String[] args) {

        Automovil automovil = new Automovil();
        Moto moto = new Moto(24d);
        Avion avion = new Avion();
        BarrilAceite barrilAceite = new BarrilAceite(21000d);
        Maquinaria maquinaria = new Maquinaria(0.1);
        Persona persona1 = new Persona("Adrián");

        // Taller elTaller = new Taller();
        Taller.reparar(automovil);

        Camion camion = new Camion("Volvo", 20000d, persona1);
        persona1.cargarVehiculo(camion, barrilAceite);

    }
}

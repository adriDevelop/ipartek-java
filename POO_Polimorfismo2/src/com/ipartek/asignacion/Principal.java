package com.ipartek.asignacion;

import com.ipartek.models.Orco;
import com.ipartek.models.Humanoide;

public class Principal {



    public static void main(String[] args) {

        Humanoide humanoide = new Orco("Adrián", 8, 7);
        humanoide.tirarConArco();
    }
}

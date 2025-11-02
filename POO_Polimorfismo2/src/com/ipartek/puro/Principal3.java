package com.ipartek.puro;

import com.ipartek.models.Caballo;
import com.ipartek.models.ElfoBosques;
import com.ipartek.models.Orco;
import com.ipartek.models.Wargo;

public class Principal3 {

    public static void main(String[] args) {

        Caballo furia = new Caballo("Furia");
        Wargo dientitos = new Wargo("Dientitos");
        Orco urk = new Orco("Urk", 4, 2);
        ElfoBosques denethor = new ElfoBosques("Denethor", 9, 9);

        denethor.cabalgar(furia);
        urk.cabalgar(dientitos);
        urk.cabalgar(furia);

        System.out.println(furia);
    }
}

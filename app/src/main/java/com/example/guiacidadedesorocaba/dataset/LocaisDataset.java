package com.example.guiacidadedesorocaba.dataset;

import com.example.guiacidadedesorocaba.R;
import com.example.guiacidadedesorocaba.model.Local;

import java.util.ArrayList;
import java.util.List;

public class LocaisDataset {

    private static List<Local> lista;

    public static List<Local> getLista(){
        lista = new ArrayList<>();
        lista.add(new Local("Padaria Real - Boa Vista", "Melhor coxinha de Sorocaba", R.mipmap.padaria_real,"Padaria Real"));
        lista.add(new Local("Hangar 51", "Shows de jazz, blues e rock.", R.mipmap.hangar51_03, "Hangar 51"));
        lista.add(new Local("Chico Rosa Bar", "Whisky bar e shows DJ semanais.", R.mipmap.chicorosa_02,"Chico Rosa"));
        return lista;
    }

}

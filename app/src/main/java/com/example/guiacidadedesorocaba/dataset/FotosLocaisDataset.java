package com.example.guiacidadedesorocaba.dataset;


import com.example.guiacidadedesorocaba.R;
import com.example.guiacidadedesorocaba.model.FotosLocal;

import java.util.ArrayList;
import java.util.List;

public class FotosLocaisDataset {
    private static List<FotosLocal> lista;

    public static List<FotosLocal> getListaReal(){
        lista = new ArrayList<>();
        lista.add(new FotosLocal(R.mipmap.padaria_real));
        lista.add(new FotosLocal(R.mipmap.padaria_real2));
        lista.add(new FotosLocal(R.mipmap.padaria_real_3));
        return lista;
    }

    public static List<FotosLocal> getListaHangar(){
        lista = new ArrayList<>();
        lista.add(new FotosLocal(R.mipmap.hangar51_01));
        lista.add(new FotosLocal(R.mipmap.hangar51_02));
        lista.add(new FotosLocal(R.mipmap.hangar51_03));
        return lista;
    }

    public static List<FotosLocal> getListaChicoRosa(){
        lista = new ArrayList<>();
        lista.add(new FotosLocal(R.mipmap.hangar51_01));
        lista.add(new FotosLocal(R.mipmap.hangar51_02));
        lista.add(new FotosLocal(R.mipmap.hangar51_03));
        return lista;
    }
}

package com.example.guiacidadedesorocaba.adapter;


import android.view.LayoutInflater;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.example.guiacidadedesorocaba.R;
import com.example.guiacidadedesorocaba.model.FotosLocal;
import com.example.guiacidadedesorocaba.model.Local;

import java.util.List;

public class FotosLocalAdapter extends RecyclerView.Adapter<FotosLocalHolder> {
    private List<FotosLocal> fotosLocais;

    public FotosLocalAdapter(List<FotosLocal> fotosLocais) {
        this.fotosLocais = fotosLocais;
    }

    @NonNull
    @Override
    public FotosLocalHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        return new FotosLocalHolder(
                LayoutInflater.from(parent.getContext())
                        .inflate(R.layout.fotos_local, parent, false)
        );
    }

    @Override
    public void onBindViewHolder(@NonNull FotosLocalHolder holder, int position) {
        FotosLocal fotosLocal = fotosLocais.get(position);
        holder.getImagemLocal().setImageResource(fotosLocal.getImagem());
    }

    @Override
    public int getItemCount() {
        return fotosLocais == null ? 0 : fotosLocais.size();
    }

}

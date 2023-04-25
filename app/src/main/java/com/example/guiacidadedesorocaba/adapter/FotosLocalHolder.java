package com.example.guiacidadedesorocaba.adapter;

import android.view.View;
import android.widget.ImageView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.example.guiacidadedesorocaba.R;

public class FotosLocalHolder extends RecyclerView.ViewHolder {

    private ImageView imagemLocal;

    public FotosLocalHolder(@NonNull View itemView) {
        super(itemView);
        imagemLocal = (ImageView) itemView.findViewById(R.id.imgFotos);
    }
    public ImageView getImagemLocal() {
        return imagemLocal;
    }

}

package com.example.guiacidadedesorocaba.adapter;

import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.example.guiacidadedesorocaba.R;
import com.example.guiacidadedesorocaba.model.Local;

import java.util.List;

public class LocaisHolder extends RecyclerView.ViewHolder {

    private TextView textLocal;
    private Button buttonSaibaMais;
    private ImageView imagemLocal;


    public LocaisHolder(@NonNull View itemView) {
        super(itemView);
        textLocal = (TextView) itemView.findViewById(R.id.txtLocal);
        buttonSaibaMais = (Button) itemView.findViewById(R.id.btnSaibaMais);
        imagemLocal = (ImageView) itemView.findViewById(R.id.imgLocal);
    }

    public TextView getTextLocal() { return textLocal; }

    public Button getButtonSaibaMais() {
        return buttonSaibaMais;
    }

    public ImageView getImagemLocal() {
        return imagemLocal;
    }
}

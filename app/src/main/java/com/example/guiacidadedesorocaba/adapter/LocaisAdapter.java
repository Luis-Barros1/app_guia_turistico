package com.example.guiacidadedesorocaba.adapter;

import android.content.Context;
import android.content.Intent;
import android.view.LayoutInflater;
import android.view.ViewGroup;
import android.widget.Toast;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.example.guiacidadedesorocaba.DetalhesLocal01Activity;
import com.example.guiacidadedesorocaba.DetalhesLocal02Activity;
import com.example.guiacidadedesorocaba.DetalhesLocal03Activity;
import com.example.guiacidadedesorocaba.R;
import com.example.guiacidadedesorocaba.model.Local;

import java.util.List;

public class LocaisAdapter extends RecyclerView.Adapter<LocaisHolder> {

    private List<Local> locais;
    private Context locaisContext;

    public LocaisAdapter (Context context, List<Local> locais) {
        this.locaisContext = context;
        this.locais = locais;
    }

    @NonNull
    @Override
    public LocaisHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        return new LocaisHolder(
                LayoutInflater.from(parent.getContext())
                        .inflate(R.layout.listagem_local, parent, false)
        );
    }

    @Override
    public void onBindViewHolder(@NonNull LocaisHolder holder, int position) {
        Local local = locais.get(position);
        holder.getTextLocal().setText(local.getLocal());
        holder.getImagemLocal().setImageResource(local.getImagem());
        holder.getButtonSaibaMais().setOnClickListener
                (view -> {
                    Toast.makeText(view.getContext(), local.getSaibaMais(), Toast.LENGTH_LONG).show();
                    Intent intent;
                    switch (local.getNomeLocal()) {
                        case "Padaria Real":
                            intent = new Intent(view.getContext(), DetalhesLocal01Activity.class);
                            break;
                        case "Hangar 51":
                            intent = new Intent(view.getContext(), DetalhesLocal02Activity.class);
                            break;
                        case "Chico Rosa":
                            intent = new Intent(view.getContext(), DetalhesLocal03Activity.class);
                            break;
                        default:
                            intent = null;
                            break;
                    }
                    if (intent != null) {
                        view.getContext().startActivity(intent);
                    }
                });
    }

    @Override
    public int getItemCount() {
        return locais == null ? 0 : locais.size();
    }

}

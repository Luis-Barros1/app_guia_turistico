package com.example.guiacidadedesorocaba;

import androidx.appcompat.app.AppCompatActivity;
import androidx.core.app.ActivityCompat;
import androidx.recyclerview.widget.DividerItemDecoration;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.Manifest;
import android.content.Context;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.location.Location;
import android.location.LocationListener;
import android.location.LocationManager;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import com.example.guiacidadedesorocaba.adapter.FotosLocalAdapter;
import com.example.guiacidadedesorocaba.dataset.FotosLocaisDataset;

public class DetalhesLocal01Activity extends AppCompatActivity {

    private RecyclerView recyclerFotos;
    private FotosLocalAdapter fotosLocalAdapter;
    Button buttonSite, buttonMapa;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_detalhes_local_01);
        setupRecycler();
        buttonSite = (Button) findViewById(R.id.btnSite);
        buttonMapa = (Button) findViewById(R.id.btnMapa);

        buttonSite.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Uri uri = Uri.parse("https://www.padariareal.com.br/");
                Intent intent = new Intent(Intent.ACTION_VIEW, uri);
                startActivity(intent);
            }
        });

        buttonMapa.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Uri uri = Uri.parse("geo:0,0?q=Av.+Engenheiro+Carlos+Reinaldo+Mendes,+2650");
                Intent intent = new Intent(Intent.ACTION_VIEW, uri);
                startActivity(intent);
            }
        });
    }

    private void setupRecycler() {

        recyclerFotos = (RecyclerView) findViewById(R.id.recyclerFotos);

        /* Definir o Layout como a lista vertical
        recyclerFotos.setLayoutManager(new LinearLayoutManager(this));
        */

        /* Definir o Layout como a lista horizontal*/
        recyclerFotos.setLayoutManager(new LinearLayoutManager(this, RecyclerView.HORIZONTAL, false));


        // Definir o Adapter
        fotosLocalAdapter = new FotosLocalAdapter(FotosLocaisDataset.getListaReal());
        recyclerFotos.setAdapter(fotosLocalAdapter);

        // Criar linha para separar itens
        recyclerFotos.addItemDecoration(new DividerItemDecoration(this, DividerItemDecoration.VERTICAL));
    }
}
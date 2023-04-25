package com.example.guiacidadedesorocaba;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.DividerItemDecoration;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

import com.example.guiacidadedesorocaba.adapter.LocaisAdapter;
import com.example.guiacidadedesorocaba.dataset.LocaisDataset;

public class MainActivity extends AppCompatActivity {

    private RecyclerView recyclerLocal;
    private LocaisAdapter localAdapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        setupRecycler();

    }

    private void setupRecycler() {

        recyclerLocal = (RecyclerView) findViewById(R.id.recyclerLista);

        /* Definir o Layout como a lista vertical */
        recyclerLocal.setLayoutManager(new LinearLayoutManager(this));


        /* Definir o Layout como a lista horizontal
        recyclerPessoa.setLayoutManager(new LinearLayoutManager(this, RecyclerView.HORIZONTAL, false));
        */

        // Definir o Adapter
        localAdapter = new LocaisAdapter(this, LocaisDataset.getLista());
        recyclerLocal.setAdapter(localAdapter);

        // Criar linha para separar itens
        recyclerLocal.addItemDecoration(new DividerItemDecoration(this, DividerItemDecoration.VERTICAL));
    }

    public void saibaMaisClick(View view){
        Toast.makeText(this, "", Toast.LENGTH_SHORT).show();
    }

}
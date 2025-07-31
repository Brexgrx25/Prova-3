package com.example.prova3;

import android.annotation.SuppressLint;
import android.os.Bundle;
import android.widget.TextView;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {
    TextView txt_bemvindo;
    RecyclerView recyclerNoticias;
    private NoticiasAdapter adapter;
    private List<Noticias> noticiario;
    @SuppressLint("MissingInflatedId")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_main);
        txt_bemvindo = findViewById(R.id.txt_bemvindo);
        String user = getIntent().getStringExtra("nome");
        txt_bemvindo.setText("Olá, " +user);

        recyclerNoticias = findViewById(R.id.recyclerNoticias);
        recyclerNoticias.setLayoutManager(new LinearLayoutManager(this));
        noticiario = new ArrayList<>();
        noticiario.add(new Noticias(" Terremoto atinge a Rússia nesta quarta feira", "" ));
        noticiario.add(new Noticias(" Flamengo vence Atlético e volta a liderança", "" ));
        noticiario.add(new Noticias(" Messi no Cruzeiro?Será? ",""));
        noticiario.add(new Noticias(" Luiz Henrique fala pela 1a vez após perder a copa do mundo de clubes", "" ));
        noticiario.add(new Noticias(" Surpresa?Veja a nova lista de convocados pelo técnico Carlo Ancelotti", "" ));

        adapter = new NoticiasAdapter(noticiario);
        recyclerNoticias.setAdapter(adapter);

    }
}
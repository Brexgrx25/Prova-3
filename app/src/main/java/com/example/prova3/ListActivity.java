package com.example.prova3;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;

import com.google.android.material.button.MaterialButton;

public class ListActivity extends AppCompatActivity {
    MaterialButton btn_mais;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_item);
        btn_mais.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent  = new Intent(ListActivity.this, NoticiarioActivity.class);
                intent.putExtra("noticia","n1");
                intent.putExtra("noticia", "n2");
                intent.putExtra("noticia", "n3");
                intent.putExtra("noticia", "n4");
                startActivity(intent);

            }
        });
    }
}


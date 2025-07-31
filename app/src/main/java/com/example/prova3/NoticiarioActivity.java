package com.example.prova3;

import android.os.Bundle;
import android.widget.TextView;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;

public class NoticiarioActivity extends AppCompatActivity {
    TextView txt_noticias;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_noticias);

        txt_noticias = findViewById(R.id.txt_noticias);
        String noticia  = getIntent().getStringExtra("noticia");
        if (noticia.equals("n1")){
            txt_noticias.setText("Um terreomoto atingiu a Rússia nesta quarta feira. \n " +
                    "Relatos apontam que até mesmo os Estados Unidos e a China foram afetadso\n dada a larga escala do terremoto");
        }
        if (noticia.equals("n2")){
            txt_noticias.setText("Neste domingo, as 20;30, Flamengo e Atlético jogaram. \n " +
                    "O rubro negro carioca bateu o galo por 1x0");
        }
        if (noticia.equals("n3")){
            txt_noticias.setText("Messi no Cruzeiro?\n Segundo informação do reporter Quico" +
                    "\n representantes do atleta contactaram o Cabuloso");
        }
        if (noticia.equals("n4")){
            txt_noticias.setText("O te´cnico espanhol falou hoje com a imprensa após perder de 3x0 para o Chelsea.\n " +
                    "O futebol é imprevisivel. As vezes o time vem ganhando todas e de repetne...\n BOM! 3X0 para um time\n" +
                    "considerado opatinho feio(Luiz Henrique)");
        } else {
            txt_noticias.setText("O técnico Carleto Ancelotti surpreendeu ao deixar Neymar, Paqueta, Vinicius Jr e Raphinha\n " +
                    "de fora da lista de convocados.");
        }
    }
}

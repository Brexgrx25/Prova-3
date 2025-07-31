package com.example.prova3;

import android.content.Intent;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;

public class LoginActivity extends AppCompatActivity {
    TextView txt_login;
    EditText ed_login;
    Button btn_log;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_login);
        txt_login = findViewById(R.id.txt_login);
        ed_login = findViewById(R.id.ed_login);
        btn_log = findViewById(R.id.btn_log);
        SharedPreferences sharedPref = getSharedPreferences("Prova3Preffs", MODE_PRIVATE);
        btn_log.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String user = ed_login.getText().toString();
                if (!user.isEmpty()){
                    SharedPreferences.Editor editor = sharedPref.edit();
                    editor.putString("user", user);
                    editor.apply();
                    Intent intent = new Intent(LoginActivity.this, MainActivity.class);
                    intent.putExtra("nome",user);
                    startActivity(intent);
                }
            }
        });

    }
}

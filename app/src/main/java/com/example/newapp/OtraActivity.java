package com.example.newapp;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.TextView;

public class OtraActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_otra);

        Bundle extras = getIntent().getExtras();
        String nombre = extras.getString("nombre");

        TextView txtContenido = findViewById(R.id.txt_captura);
        txtContenido.setText("Bienvenido: "+nombre);

    }
}
package com.example.newapp;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Log.i("Ejemplo", "onCreate");
    }

    @Override
    protected void onStart() {
        super.onStart();
        Log.i("Ejemplo", "onStart");
    }

    @Override
    protected void onResume() {
        super.onResume();
        Log.i("Ejemplo", "onResume");
    }

    @Override
    protected void onPause() {
        super.onPause();
        Log.i("Ejemplo", "onPause");
    }

    @Override
    protected void onStop() {
        super.onStop();
        Log.i("Ejemplo", "onStop");
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        Log.i("Ejemplo", "onDestroy");
        Log.i("Ejemplo", "Haz salido de la app");
    }

    public void mostrarTexto(View view) {
        TextView tv_mensaje = (TextView) findViewById(R.id.txt_mensaje);
        tv_mensaje.setText("Hola a todos");
    }
}
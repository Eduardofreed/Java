package com.example.bdbiblioteca1;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

import com.example.bdbiblioteca1.model.Usuario;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

    Usuario cliente = new Usuario("Joaquim", 15, "Ação");
    Usuario gerente = new Usuario("Paulo", 35);
    }
}
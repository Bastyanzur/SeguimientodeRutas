package com.example.seguimientoderutas.Vista;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import com.example.seguimientoderutas.R;



public class MenuPrincipal extends AppCompatActivity {

    Button Mapabtn;
    Button btnListas;

    Button btnRegistro;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_menu_principal);
        Mapabtn = findViewById(R.id.Mapabtn);
        btnListas = findViewById(R.id.btnListas);
        btnRegistro = findViewById(R.id.btnRegistro);


        Mapabtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(MenuPrincipal.this, MapaDeUbicacion.class));
            }
        });

        btnListas.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(MenuPrincipal.this, HistorialDeRutasActivity.class));
            }
        });
        btnRegistro.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(MenuPrincipal.this, HistorialDeRutasActivity.class));
            }
        });
    }
}
package com.example.seguimientoderutas.Vista;

import android.os.Bundle;
import android.widget.TextView;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

import com.example.seguimientoderutas.R;
import com.example.seguimientoderutas.controlador.Utility;

public class DetalleRutaActivity extends AppCompatActivity {

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_detalle_ruta);

        // Obtén la información de la ruta desde la base de datos o Firebase
        String fecha = "Fecha de la ruta";
        double latitudInicio = 12.34;  // Reemplaza con datos reales
        double longitudInicio = 56.78;  // Reemplaza con datos reales
        double latitudFin = 34.56;  // Reemplaza con datos reales
        double longitudFin = 78.90;  // Reemplaza con datos reales

        // Calcula la distancia y la duración (puedes usar bibliotecas como Google Maps API para cálculos más precisos)
        double distanciaRecorrida = calcularDistancia(latitudInicio, longitudInicio, latitudFin, longitudFin);
        long duracion = calcularDuracion(/* timestamps */);

        // Actualiza la interfaz de usuario con la información de la ruta
        TextView txtFecha = findViewById(R.id.txtFecha);
        TextView txtDistancia = findViewById(R.id.txtDistancia);
        TextView txtDuracion = findViewById(R.id.txtDuracion);

        txtFecha.setText("Fecha: " + fecha);
        txtDistancia.setText("Distancia: " + distanciaRecorrida + " km");
        txtDuracion.setText("Duración: " + duracion + " minutos");
    }

    private double calcularDistancia(double latitudInicio, double longitudInicio, double latitudFin, double longitudFin) {
        // Utiliza la API de Google Maps u otra biblioteca para calcular la distancia
        // Por ejemplo, puedes usar Location.distanceBetween() de la API de Android
        float[] results = new float[1];
        android.location.Location.distanceBetween(latitudInicio, longitudInicio, latitudFin, longitudFin, results);
        return results[0] / 1000;  // La distancia se obtiene en metros, conviértela a kilómetros
    }

    private long calcularDuracion(/* timestamps de inicio y fin */) {
        // Implementa la lógica para calcular la duración en minutos
        // Puedes restar los timestamps y convertir la diferencia a minutos
        // Retorna la duración calculada
        return 0;
    }
}

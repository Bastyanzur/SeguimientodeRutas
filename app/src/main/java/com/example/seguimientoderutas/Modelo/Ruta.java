package com.example.seguimientoderutas.Modelo;

public class Ruta {
    private int id;
    private String fecha;
    private double latitud;
    private double longitud;

    public Ruta(int id, String fecha, double latitud, double longitud) {
        this.id = id;
        this.fecha = fecha;
        this.latitud = latitud;
        this.longitud = longitud;
    }

    public int getId() {
        return id;
    }

    public String getFecha() {
        return fecha;
    }

    public double getLatitud() {
        return latitud;
    }

    public double getLongitud() {
        return longitud;
    }

    @Override
    public String toString() {
        return "Ruta{" +
                "id=" + id +
                ", fecha='" + fecha + '\'' +
                ", latitud=" + latitud +
                ", longitud=" + longitud +
                '}';
    }
}

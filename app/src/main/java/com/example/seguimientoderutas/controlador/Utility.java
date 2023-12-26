package com.example.seguimientoderutas.controlador;

public class Utility {

    public static final String TABLA_UBICACION = "ubicacion";
    public static final String CAMPO_ID = "id"; // Nuevo campo ID
    public static final String CAMPO_TIMESTAMP = "timestamp";
    public static final String CAMPO_LATITUD = "latitud";
    public static final String CAMPO_LONGITUD = "longitud";
    public static final String CREAR_TABLA_UBICACION = "CREATE TABLE " +
            TABLA_UBICACION + " (" +
            CAMPO_ID + " INTEGER PRIMARY KEY AUTOINCREMENT, " +
            CAMPO_TIMESTAMP + " TEXT, " +
            CAMPO_LATITUD + " REAL, " +
            CAMPO_LONGITUD + " REAL);";
}

package com.example.seguimientoderutas.controlador;

import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;

public class ConexionHelper extends SQLiteOpenHelper {

    public ConexionHelper(Context context, String name, SQLiteDatabase.CursorFactory factory, int version) {
        super(context, name, factory, version);
    }

    @Override
    public void onCreate(SQLiteDatabase db) {
        // Crea la tabla de usuario
        db.execSQL(Utility.CREAR_TABLA_UBICACION);


    }
    @Override
    public void onUpgrade(SQLiteDatabase db, int oldVersion, int newVersion) {
        // Elimina las tablas antiguas si existen
        db.execSQL("DROP TABLE IF EXISTS " + Utility.TABLA_UBICACION);

        // Crea las tablas nuevamente
        onCreate(db);
    }
}

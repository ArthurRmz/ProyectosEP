package com.componentes.arthur.presentationtrainerbeta1;

import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;

public class MisTablas extends SQLiteOpenHelper{
    private static final String REGISTRO_TABLE_CREATE = "CREATE TABLE registro(id INTEGER PRIMARY KEY AUTOINCREMENT, valor INTEGER)";
    private static final String PUNTUACION_TABLE_CREATE = "CREATE TABLE puntuacion(id INTEGER PRIMARY KEY AUTOINCREMENT, puntuacion INTEGER, fecha DATE)";
    private static final String DB_NAME = "userScore.sqlite";
    private static final int DB_VERSION = 1;

    public MisTablas(Context context) {
        super(context, DB_NAME, null, DB_VERSION);
    }

    @Override
    public void onCreate(SQLiteDatabase db) {
        db.execSQL(REGISTRO_TABLE_CREATE);
        db.execSQL(PUNTUACION_TABLE_CREATE);
    }

    @Override
    public void onUpgrade(SQLiteDatabase db, int oldVersion, int newVersion) {

    }
}
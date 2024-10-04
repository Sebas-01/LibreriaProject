package com.sebas.libreria;

import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;

import androidx.annotation.Nullable;

public class dbLibrary extends SQLiteOpenHelper {
    String tblUser = "Create table user(idUser integer primary key AUTOINCREMENT, name text, email text, password text, status integer,role integer)";
    String tblBook = "Create table book(idBook INTEGER PRIMARY KEY AUTOINCREMENT, name TEXT, cost text, available INTEGER)";
    String tblRent = "Create table rent(idrent INTEGER PRIMARY KEY AUTOINCREMENT, iduser INTEGER, idbook INTEGER, date TEXT, FOREIGN KEY(iduser) REFERENCES user(idUser), FOREIGN KEY(idbook) REFERENCES book(idBook))";


    public dbLibrary(Context context,  String name,  SQLiteDatabase.CursorFactory factory, int version, String tblUser, String tblBook, String tblRent) {
        super(context, name, factory, version);
    }

    @Override
    public void onCreate(SQLiteDatabase db) {
        db.execSQL(tblUser);
        db.execSQL(tblBook);
        db.execSQL(tblRent);
    }

    @Override
    public void onUpgrade(SQLiteDatabase db, int i, int i1) {

        db.execSQL("Drop table user");
        db.execSQL(tblUser);
        db.execSQL("Drop table book");
        db.execSQL(tblBook);
        db.execSQL("Drop table rent");
        db.execSQL(tblRent);
    }
}



package com.sebas.libreria;

import android.content.ContentValues;
import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.database.Cursor;

public class userCRUD {
    private dbLibrary dblibrary;

    public userCRUD(Context context){

    }

    public long insertUser(String name, String email, String password, int status){
        SQLiteDatabase db = dblibrary.getWritableDatabase();
        ContentValues values = new ContentValues();
        values.put("name", name);
        values.put("email", email);
        values.put("password", password);
        values.put("status", status);

        return db.insert("user",null,values);
    }

    public Cursor getAllUsers(){
        SQLiteDatabase db = dblibrary.getReadableDatabase();
        return db.query("user",null,null,null,null,null,null);
    }

    public int updateUser(int iduser, String name, String email, String password, int status){
        SQLiteDatabase db = dblibrary.getWritableDatabase();
        ContentValues values = new ContentValues();
        values.put("name", name);
        values.put("email", email);
        values.put("passwd", password);
        values.put("status", status);
        return db.update();
    }

}

package com.sebas.libreria;

import android.content.ContentValues;
import android.content.Context;
import android.database.sqlite.SQLiteDatabase;

public class userCRUD {
    private dbLibrary dblibrary;

    public userCRUD(Context context){
        dblibrary = new dbLibrary(context);
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
}

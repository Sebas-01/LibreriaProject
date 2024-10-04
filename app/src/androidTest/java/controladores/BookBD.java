package controladores;

import android.content.Context;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;
import android.util.Log;

import com.sebas.libreria.GetSetBook;

import java.util.ArrayList;
import java.util.List;

import javax.annotation.Nullable;

public class BookBD extends SQLiteOpenHelper implements ILibroBD {

    Context contexto;
    private List<GetSetBook> libroList = new ArrayList<>();

    public BookBD(@Nullable Context context, @Nullable String name,@Nullable SQLiteDatabase.CursorFactory factory, int version){

        super(context, name, factory, version);
        this.contexto = context;
     }

    @Override
    public void onCreate(SQLiteDatabase db) {
        // Crear la estructura de la BD
        String sql = "CREATE TABLE Book (" +
                "_idBook INTEGER PRIMARY KEY AUTOINCREMENT, " +
                "text TEXT, " +
                "cost TEXT, " +
                "available INTEGER)";

        // Ejecutar la creación de la tabla
        db.execSQL(sql);

        // Insertar los datos
        String insert = "INSERT INTO Book VALUES (null, 'POSDATA: Te amo', '80.000', 1)";
        db.execSQL(insert);

        insert = "INSERT INTO Book VALUES (null, 'Bajo la misma estrella', '110.000', 1)";
        db.execSQL(insert);
    }

    @Override
    public void onUpgrade(SQLiteDatabase db, int oldVersion, int newVersion) {

    }

    @Override
    public GetSetBook elemento(int idbook) {
        SQLiteDatabase database = getReadableDatabase();
        Cursor cursor = database.rawQuery( "SELECT * FROM Book WHERE _idbook=" + idbook, null);
        try {

          if (cursor.moveToNext())
                return extraerBook(cursor);
            else
                return null;
        }catch (Exception e){
            Log.d("TAG","ERROR ELEMENTO(idbook) ID BookBD" + e.getMessage());
            throw e;
        }finally {
            if(cursor != null) cursor.close();
        }
    }

    private GetSetBook extraerBook(Cursor cursor) {
        GetSetBook book = new GetSetBook();
        book.setIdbook(cursor.getInt( 0));
        book.setText(cursor.getString( 1));
        book.setCost(cursor.getString( 2));
        book.setAvailable(cursor.getInt( 3));

        return book;
    }

    @Override
    public GetSetBook elemento(String text) {
        SQLiteDatabase database = getReadableDatabase();
        Cursor cursor = database.rawQuery( "SELECT * FROM Book WHERE text='" + text + "'", null);
        try {

            if (cursor.moveToNext())
                return extraerBook(cursor);
            else
                return null;
        }catch (Exception e){
            Log.d("TAG","ERROR ELEMENTO(text) BookBD" + e.getMessage());
            throw e;
        }finally {
            if(cursor != null) cursor.close();
        }
    }

    @Override
    public List<GetSetBook> Lista() {
        return null;
    }

    @Override
    public void agregar(GetSetBook book) {

    }

    @Override
    public void actualizar(int idbook, GetSetBook book) {

    }

    @Override
    public void borrar(int idbook) {

    }
}

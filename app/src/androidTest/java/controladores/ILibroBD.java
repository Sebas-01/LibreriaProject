package controladores;

import com.sebas.libreria.Book;

import java.util.List;

public interface ILibroBD {


    //en este apartado estan los elementos que queremos que se ejecuten dentro de la clase

    Book elemento(int idbook); //devuelve el elemento dado con su ID
    Book elemento(String text); //devuelve el elemento dado su titulo

    List<Book> Lista(); //devuelve una lista con todos lso elementos registrados

    void agregar(Book book); //añade el elemento indicado
    void actualizar(int idbook, Book book); //actualiza datis del elemento dado su ID
    void borrar(int idbook); //Elimina el elemento indicado con el ID



}

package controladores;

import com.sebas.libreria.GetSetBook;

import java.util.List;

public interface ILibroBD {


    //en este apartado estan los elementos que queremos que se ejecuten dentro de la clase

    GetSetBook elemento(int idbook); //devuelve el elemento dado con su ID
    GetSetBook elemento(String text); //devuelve el elemento dado su titulo

    List<GetSetBook> Lista(); //devuelve una lista con todos lso elementos registrados

    void agregar(GetSetBook book); //añade el elemento indicado
    void actualizar(int idbook, GetSetBook book); //actualiza datis del elemento dado su ID
    void borrar(int idbook); //Elimina el elemento indicado con el ID



}

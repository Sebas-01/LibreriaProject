package com.sebas.libreria;

public class Book {

    //atributos de la clase libro

    private Integer idbook;
    private String text;
    private String cost;
    private  Integer available;

    //constructor con argumentos
    public Book(){
        this.idbook = idbook;
        this.text = text;
        this.cost = cost;
        this.available = available;
    }

    public Integer getIdbook() {
        return idbook;
    }

    public void setIdbook(Integer idbook) {
        this.idbook = idbook;
    }

    public String getText() {
        return text;
    }

    public void setText(String text) {
        this.text = text;
    }

    public String getCost() {
        return cost;
    }

    public void setCost(String cost) {
        this.cost = cost;
    }

    public Integer getAvailable() {
        return available;
    }

    public void setAvailable(Integer available) {
        this.available = available;
    }

    @Override
    public String toString() {
        return "Book{" +
                "idbook=" + idbook +
                ", text='" + text + '\'' +
                ", cost='" + cost + '\'' +
                ", available=" + available +
                '}';
    }
}

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Colecciones.Ejercicio_02;

/**
 *
 * @author Cain
 */
public class Libro {
    private String isbn;
    private String titulo; 
    private int  anioPublicacion; 
    private Autor autor;

    public Libro(String isbn, String titulo, int anioPublicacion, Autor autor) {
        this.isbn = isbn;
        this.titulo = titulo;
        this.anioPublicacion = anioPublicacion;
        this.autor = autor;
    }

    public String getIsbn() {
        return isbn;
    }

    public String getTitulo() {
        return titulo;
    }

    public int getAnioPublicacion() {
        return anioPublicacion;
    }

    public Autor getAutor() {
        return autor;
    }
    
    
    
    public void mostrarInfo() {
        System.out.println("Titulo: " + getTitulo());
        System.out.println("isbn: " + getIsbn());
        System.out.println("Anio de publicacion: " + getAnioPublicacion());
        System.out.println("Autor" + this.autor);
    }
    
    

}


package introduccionPoo;

public class Libro {
    private String titulo, autor;
    private int anioDePublicacion;
    
    public Libro(String titulo, String autor, int anioDePublicacion) {
        this.titulo = titulo;
        this.autor = autor;
        this.anioDePublicacion = anioDePublicacion; 
    }

    public String getTitulo() {
        return titulo;
    }

    public String getAutor() {
        return autor;
    }

    public int getAnioDePublicacion() {
        return anioDePublicacion;
    }

    public void setAnioDePublicacion(int anio) {
        if (anio > this.anioDePublicacion) {
            this.anioDePublicacion = anio;
        } else {
            System.out.println("El libro debe salir en el proximo o proximos anios.");
        }
    }
}

package POO.tp2;

/**
 *
 * @author Cain
 */
public class Libro {
    private String titulo;
    private String autor;
    public static String editorial = "independiente";

    public Libro(String titulo, String autor) {
        this.titulo = titulo;
        this.autor = autor;
    }
    
    public Libro(String titulo, String autor,String editorial) {
        this(titulo, autor);
    }
    
    public void actualizarTitulo(String titulo) {
        this.titulo = titulo;
    }
    
    public void actualizarTitulo(String prefijo,String nuevoTitulo){
        actualizarTitulo(prefijo + " - " + nuevoTitulo);
    }
    
    public static void cambiarEditorial(String nuevaEditorial) {
        editorial = nuevaEditorial;
    }

    @Override
    public String toString() {
        return "Libro{" + "titulo=" + titulo + ", autor=" + autor + ", editorial=" + editorial + '}';
    }

    public String getTitulo() {
        return titulo;
    }

    public String getAutor() {
        return autor;
    }

    public static String getEditorial() {
        return editorial;
    }
    
    
    
    
    
    
    
    
    
    
    
    
    
    
}

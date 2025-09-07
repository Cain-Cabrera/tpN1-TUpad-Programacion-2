package introduccionPoo;

public class MainLibro {
    public static void main(String[] args) {
        Libro libro1 = new Libro("La muerte","Cain Cabrera",2026);
        
        // Ver autor
        System.out.println("Autor: " + libro1.getAutor());
        
        // Ver anios de publicacion
        System.out.println("Anio de Publicacion: " + libro1.getAnioDePublicacion());
        
        // Ver titulo
        System.out.println("Titulo: " + libro1.getTitulo());
        
        //Modificamos anio de publicacion.
        System.out.println("\nModificamos el anio de publiacacion");
        libro1.setAnioDePublicacion(2027);
        System.out.println("Anio de Publicacion: " + libro1.getAnioDePublicacion());
        
        // Modificamos erroneamente el anio
        System.out.println("\nModificamos el anio de publiacacion erroneamente.");
        libro1.setAnioDePublicacion(2022);
        System.out.println("Anio de Publicacion: " + libro1.getAnioDePublicacion());
        
    }
}

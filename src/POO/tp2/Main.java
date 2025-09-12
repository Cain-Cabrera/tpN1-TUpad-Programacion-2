package POO.tp2;

/**
 *
 * @author Cain
 */
public class Main {
    public static void main(String[] args) {
        Libro cain2 = new Libro("Clean architecture", "Robert Martin", "Clean Code");
        Libro cain1 = new Libro("Clean Code", "Robert Martin");
        
        //Titulos: 
        System.out.println("Titulos: ");
        System.out.println(cain1.getTitulo());
        System.out.println(cain2.getTitulo());
        System.out.println("");
        
        // Cambiamos nombre de ambos libros para asignar prefijo:
        System.out.println("Actualizamos Titulos: ");
        cain1.actualizarTitulo("Como ser prompt ingenier", "Desinteligencia Artificial");
        cain2.actualizarTitulo("Como pensar como un programador");
        
        //Mostramos titulos actualizados:
        System.out.println(cain1.getTitulo());
        System.out.println(cain2.getTitulo());
        System.out.println("");
        
        //Mostramos mediante toString el estado actual del objeto:
        System.out.println("Estado actual de los objetos: ");
        System.out.println(cain1);
        System.out.println(cain2);
        System.out.println("");
        
        /* cambiamos editorial, al ser una variable de clase, no hace falta
        cambiarla en ambos objetos ya que sino estariamos modificando la variable
        global*/ 
        
        System.out.println("Cambiamos editorial: ");
        cain1.cambiarEditorial("DEPENDIENTE");
        
        System.out.println(cain1);
        System.out.println(cain2);
        
        
    }
}

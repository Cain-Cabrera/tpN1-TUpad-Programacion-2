
package introduccionPoo;
public class Estudiante {
    private String nombre,apellido,curso;
    private int calificacion;
    
    public Estudiante(String nombre, String apellido, String curso, int calificacion) {
    this.nombre = nombre;
    this.apellido = apellido;
    this.curso = curso;
    this.calificacion = calificacion;
    }
    
    public void MostrarInfo(){
        System.out.println("Nombre: " + nombre);
        System.out.println("Apellido: " + apellido);
        System.out.println("Curso: " + curso);
        System.out.println("Calificacion: " + calificacion);
    }
    
    public void SubirCalificacion(int calificacion) {
        if (calificacion > 0 && this.calificacion + calificacion <= 10) {
            this.calificacion += calificacion;
        } else {
            System.out.println("La nota debe estar entre 1 y 10.");
        }
        
    }

    public void BajarCalificacion(int calificacion) {
        if (calificacion > 0 && this.calificacion - calificacion >= 0) {
            this.calificacion -= calificacion;
        }else {
            System.out.println("Calificacion invalida.");
        }
            
        
            
    }
    
    
}


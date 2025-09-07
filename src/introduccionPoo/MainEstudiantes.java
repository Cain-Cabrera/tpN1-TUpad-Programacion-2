
package introduccionPoo;

public class MainEstudiantes {
    
    public static void main(String[] args) {
        Estudiante estudiante1 = new Estudiante("Cain","Cabrera","Comision-11",8);
        
        estudiante1.MostrarInfo();
        System.out.println("");
        
        // Bajamos calificacion.
        
        estudiante1.BajarCalificacion(3);
        estudiante1.MostrarInfo(); 
        System.out.println("");
        
        // Subimos calificacion.
       
        estudiante1.SubirCalificacion(4);
        estudiante1.MostrarInfo();
        
        
       
    }
}

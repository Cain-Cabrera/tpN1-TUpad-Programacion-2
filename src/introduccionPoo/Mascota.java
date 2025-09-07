
package introduccionPoo;

public class Mascota {
    private String nombre,especie;
    private int edad;
    
    public Mascota(String nombre,String especie, int edad){
        this.nombre = nombre;
        this.especie = especie;
        this.edad = edad;
    }
    
    public void mostrarInfo(){
        System.out.println("Nombre: " + nombre);
        System.out.println("Especie: " + especie);
        System.out.println("Edad: " + edad);
    }
    
    public void cumplirAnios() {
        this.edad += 1;
    }
}

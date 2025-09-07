
package introduccionPoo;

public class Gallina {
    private int idGallina;
    private int edad;
    private int huevosPuestos;

    public Gallina(int idGallina, int edad, int huevosPuestos) {
        this.idGallina = idGallina;
        this.edad = edad;
        this.huevosPuestos = huevosPuestos;
    }
    
    public void mostrarInfo() {
        System.out.println("ID: " + idGallina);
        System.out.println("Edad: " + edad);
        System.out.println("Cantidad de Huevos puestos: " + huevosPuestos);
    }
    
    public void ponerHuevo(int huevoNuevo) {
        if (huevoNuevo > 0) {
            this.huevosPuestos += huevoNuevo;
        } else {
            System.out.println("No pudo poner huevo.");
        }
    }
    
    public void envejecer() {
        this.edad += 1;
    }
}

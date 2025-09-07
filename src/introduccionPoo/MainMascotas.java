package introduccionPoo;

public class MainMascotas {
    public static void main(String[] args) {
        Mascota perro = new Mascota("Claudio","Dogo Argentino" , 3);
        
        perro.mostrarInfo();
        System.out.println("");
        
        // El perro cumple anios.
        
        perro.cumplirAnios();
        perro.mostrarInfo();
    }
}

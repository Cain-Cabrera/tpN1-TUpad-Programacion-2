package introduccionPoo;

public class MainGallina {
    public static void main(String[] args) {
        Gallina gallina1 = new Gallina(1000230,3, 2);
        Gallina gallina2 = new Gallina(1000231,2,5);
        
        System.out.println("Primer Gallina:");
        gallina1.mostrarInfo();
        System.out.println("\nSegunda gallina:");
        gallina2.mostrarInfo();
        
        //gallina1 Pone 2 huevos y mostramos datos.
        System.out.println("\nGallina 1 pone 2 huevos:");
        gallina1.ponerHuevo(2);
        gallina1.mostrarInfo();
        
        // gallina2 pone -2 huevos, viendo tambien el caso erroneo.
        System.out.println("\nGallina 2 pone -2 huevos:");
        gallina2.ponerHuevo(-2);
        
    }
}

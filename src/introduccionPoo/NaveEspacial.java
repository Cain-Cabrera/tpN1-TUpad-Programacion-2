
package introduccionPoo;

public class NaveEspacial {
    private String nombre;
    private int combustible;
    private static final int MIN_COMBUSTIBLE = 10;
    public static final int MAX_COMBUSTIBLE = 50;
    

    public NaveEspacial(String nombre, int combustible) {
        this.nombre = nombre;
        this.combustible = combustible;
    }
    
    public void mostrarInfo(){
        System.out.println("Nombre: " + nombre);
        System.out.println("Tanque de combustible: " + combustible);
    }
    
    public void despegar(){
        System.out.println("3.. 2.. 1.. Despegando!");
    }
    
    public void avanzar(int distancia){
        if (distancia > 0 && this.combustible > MIN_COMBUSTIBLE) {
            this.combustible -= 10;
        } else {
            System.out.println("Cantidad de combustible invalida.");
        }
    }
    
    public void recargarCombustible(int cantidadCombustible) {
        if (cantidadCombustible > 0 && this.combustible + cantidadCombustible <= MAX_COMBUSTIBLE) {
            this.combustible += cantidadCombustible;
        } else {
            System.out.println("La cantidad no debe superar el tope de " + MAX_COMBUSTIBLE);
        }
   
    }
    
    public int getCombustible() {
        return combustible;
    }
    
    
}

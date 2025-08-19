
package programacionEstructurada;

public class ejercicio_13_tp2 {
    public static void main(String[] args) {
        double[] precios = {220,500,120,6,25};
        
        System.out.println("Precios originales:");
        mostrarPreciosOriginales(precios, 0);
        
        precios[2] = 129.99;
        
        System.out.println("\nPrecios modificados:");
        mostrarPreciosModificados(precios, 0);
 
    }
    
  public static void mostrarPreciosOriginales(double[] precios, int indice) {
        if (indice >= precios.length) {
            return;
        }
        System.out.printf("Precio: $%.2f%n", precios[indice]);
        mostrarPreciosOriginales(precios, indice + 1);
    }
    
    public static void mostrarPreciosModificados(double[] precios, int indice) {
        if (indice >= precios.length) {
            return;
        }
        System.out.printf("Precio: $%.2f%n", precios[indice]);
        mostrarPreciosModificados(precios, indice + 1);
    }
   
}
        


package programacionEstructurada;

import java.util.Scanner;


public class ejercicio_10_tp2 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int stockActual, cantidadVendida,cantidadRecibida,nuevoStock;
        
        System.out.println("Ingrese su stock actual: ");
        stockActual = Integer.parseInt(input.nextLine());
        
        System.out.println("Ingrese la cantidad vendida: ");
        cantidadVendida = Integer.parseInt(input.nextLine());
         
        System.out.println("Ingrese la cantidad recibida: ");
        cantidadRecibida = Integer.parseInt(input.nextLine());
        
        nuevoStock = actualizarStock(stockActual, cantidadVendida, cantidadRecibida);
        
        System.out.println("El stock actualizado es: " + nuevoStock);
    }
    
    
    static int actualizarStock(int stockActual, int cantidadVendida,int cantidadRecibida) {
        return stockActual = stockActual - cantidadVendida + cantidadRecibida;
    }
}

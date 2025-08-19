
package programacionEstructurada;

import java.util.Scanner;

public class ejercicio_04_tp2 {
    final static int DESCUENTO_MINIMO = 10;
    final static int DESCUENTO_MEDIO = 15;
    final static int DESCUENTO_MAXIMO = 20;
    
    public static void main(String[] args) {
        int precioProducto,precioFinal,descuento = 0,descuentoFinal;
        char categoria;
        Scanner input = new Scanner(System.in);
        
        System.out.print("Ingrese el precio del producto: ");
        precioProducto = Integer.parseInt(input.nextLine());
        
        System.out.print("Ingrese la categoria (A,B o C): ");
        categoria = input.nextLine().charAt(0);
        
        if (categoria == 'A') {
            descuento = DESCUENTO_MINIMO;
        } else if (categoria == 'B'){
            descuento = DESCUENTO_MEDIO;
        } else if (categoria == 'C') {
            descuento = DESCUENTO_MAXIMO;
        }  
        
        descuentoFinal = (descuento * precioProducto) / 100;
        precioFinal = precioProducto - descuentoFinal;
        
        System.out.println("Descuento aplicado: " + (double) descuento);
        System.out.println("El precio final es: " + precioFinal);
        
    }
}

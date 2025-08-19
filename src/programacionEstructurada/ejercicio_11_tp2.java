
package programacionEstructurada;

import java.util.Scanner;
public class ejercicio_11_tp2 {
    
    static double DESCUENTO_ESPECIAL = 0.10;
    
    public static void main(String[] args) {
        double precioProducto;
        Scanner input = new Scanner(System.in);
        
        System.out.print("Ingrese el precio del producto: ");
        precioProducto = Integer.parseInt(input.nextLine());
        
        calcularDescuentoEspecial(precioProducto);
        
    }
    
    static void calcularDescuentoEspecial(double precio) {
        
        double descuentoAplicado = DESCUENTO_ESPECIAL * precio;
       
        double precioFinal = precio - descuentoAplicado;
       
        System.out.println("El descuento especial aplicado es: " + descuentoAplicado);
        System.out.println("El precio final con descuento es: " + precioFinal);
        
    }
    
}


package programacionEstructurada;

import java.util.Scanner;
public class ejercicio_08_tp2 {
 
    public static void main(String[] args) {
        
         double precioBase, descuento, impuesto;
         Scanner input = new Scanner(System.in);
         
         System.out.print("Ingrese el precio base del producto: ");
         precioBase = Double.parseDouble(input.nextLine()); // 
         
         System.out.print("Ingrese el porcentaje de descuento: ");
         descuento = Double.parseDouble(input.nextLine());
         
         System.out.print("Ingrese el porcentaje de impuesto: ");
         impuesto = Double.parseDouble(input.nextLine());
         
         
         double precioFinal = calcularPrecioFinal(precioBase, impuesto, descuento);
         
         System.out.println("El precio final del producto es: " + precioFinal);
    }

     
     static double calcularPrecioFinal(double precioBase, double impuesto, double descuento) {
        return precioBase + (precioBase * (impuesto/100)) - (precioBase * (descuento/100));
    }
}
    

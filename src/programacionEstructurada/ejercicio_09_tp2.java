
package programacionEstructurada;

import java.util.Scanner;


public class ejercicio_09_tp2 {
    public static void main(String[] args) {
        int precioPaquete; 
        double pesoPaquete,costoEnvio,costoTotalFinal;
        String zonaEnvio;
        Scanner input = new Scanner(System.in);
        
        System.out.print("Ingrese el precio del paquete: ");
        precioPaquete = Integer.parseInt(input.nextLine());
        
        System.out.print("Ingrese el peso del paquete: ");
        pesoPaquete = Double.parseDouble(input.nextLine());
                
        System.out.print("Ingrese la zona: ");
        zonaEnvio = input.nextLine();
        
        costoEnvio = calcularCostoEnvio(pesoPaquete, zonaEnvio);
        costoTotalFinal = calcularTotalCompra(precioPaquete, costoEnvio);
        
        System.out.println("El costo de envio es: " + costoEnvio);
        
        System.out.println("El precio final del envio es: " + costoTotalFinal);  
    }
    
 static double calcularCostoEnvio(double peso, String zona) { // 
        double costoEnvio; 
        
        if (zona.equalsIgnoreCase("internacional")) {
            costoEnvio = 10 * peso; // 
        } else {
            costoEnvio = 5 * peso; 
        }
        return costoEnvio;
    }
 
 
 static double calcularTotalCompra(double precioProducto, double costoEnvio) {
        return precioProducto + costoEnvio;
    }
}
      




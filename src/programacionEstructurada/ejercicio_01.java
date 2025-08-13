
package programacionEstructurada;

import java.util.Scanner;

/**
 *  1. Verificación de Año Bisiesto. 
    Escribe un programa en Java que solicite al usuario un año y determine si es 
    bisiesto. Un año es bisiesto si es divisible por 4, pero no por 100, salvo que sea 
    divisible por 400.
 *  @author Cain
 */
public class ejercicio_01 {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int numeroUsuario;
        
        System.out.print("Ingrese un numero para verificar si es bisiesto: ");
        numeroUsuario = Integer.parseInt(input.nextLine());
        
        if ((numeroUsuario % 4 == 0 && numeroUsuario % 100 != 0) || (numeroUsuario % 400 == 0)) {
            System.out.println("El año " + numeroUsuario + " es bisiesto");
}       else {
            System.out.println("No es bisiesto");
}
    }
}       
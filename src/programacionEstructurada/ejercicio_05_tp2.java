
package programacionEstructurada;

import java.util.Scanner;


public class ejercicio_05_tp2 {
    public static void main(String[] args) {
        int numeroUsuario,contadorNumerosPares = 0;
        Scanner input = new Scanner(System.in);
        
        System.out.print("Ingrese un numero (0 para terminar): ");
        numeroUsuario = Integer.parseInt(input.nextLine());
        
        while (!(numeroUsuario == 0) ) {            
            
            if (numeroUsuario % 2 == 0 && numeroUsuario  > 0) {
                contadorNumerosPares += numeroUsuario;
            }
            System.out.print("Ingrese un numero (0 para terminar): ");
            numeroUsuario = Integer.parseInt(input.nextLine());
        }
        
        System.out.println("La suma de los numeros pares es: " + contadorNumerosPares);
    }
}

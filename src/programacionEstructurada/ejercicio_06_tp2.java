
package programacionEstructurada;

import java.util.Scanner;

public class ejercicio_06_tp2 {
    public static void main(String[] args) {
        int numeroUsuario,contadorPositivos = 0,contadorNegativos = 0,contadorCeros = 0;
        Scanner input = new Scanner(System.in);
        
        for (int i = 0; i < 10; i++) {
            System.out.print("Ingrese un numero: ");
            numeroUsuario = Integer.parseInt(input.nextLine());
            if (numeroUsuario > 0) {
                contadorPositivos ++;  
            } else if (numeroUsuario < 0) {
                contadorNegativos ++;
            } else if (numeroUsuario == 0){
                contadorCeros ++;
            }
        }  
        System.out.print("\n\tNúmeros positivos: " + contadorPositivos 
                       + "\n\tNúmeros negativos: " + contadorNegativos 
                       + "\n\tCeros ingresados: " + contadorCeros);
    }
}
 
                                                        
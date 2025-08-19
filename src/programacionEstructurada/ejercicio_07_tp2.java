
package programacionEstructurada;

import java.util.Scanner;

public class ejercicio_07_tp2 {
    final static int NOTA_MAXIMA = 10;
    final static int NOTA_MINIMA = 0;
    
    public static void main(String[] args) {
        int notaUsuario;
        Scanner input = new Scanner(System.in);

        do {            
            System.out.print("Ingrese una nota (0-10): ");
            notaUsuario = Integer.parseInt(input.nextLine());
            
            if (notaUsuario < NOTA_MINIMA || notaUsuario > NOTA_MAXIMA) {
                System.out.println("¡Nota inválida! Debe estar entre 0 y 10.");
            }
            
        } while (notaUsuario < NOTA_MINIMA || notaUsuario > NOTA_MAXIMA);
           
        System.out.print("Nota guardada: " + notaUsuario);
    }          
}           

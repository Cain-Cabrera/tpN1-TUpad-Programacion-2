
package programacionEstructurada;

import java.util.Scanner;

public class ejercicio_03_tp2 {
 final static int EDAD_NINIO = 12;
 final static int EDAD_ADOLESCENTE = 17;
 final static int EDAD_ADULTA = 59;
 final static int EDAD_LIMITE = 120;
 final static int EDAD_MINIMA = 1;
 
    public static void main(String[] args) {
        int edad;
        Scanner input = new Scanner(System.in);
        
        System.out.print("Ingrese su edad: ");
        edad = Integer.parseInt(input.nextLine());
        
        if (edad < EDAD_NINIO && edad >= EDAD_MINIMA) {
            System.out.println("Ninio");
        } else if (edad <= EDAD_ADOLESCENTE){
            System.out.println("Adolescente.");
        } else if (edad <= EDAD_ADULTA ) {
            System.out.println("Adulto");
        } else {
            System.out.println("Adulto mayor");
        }
        
    }
}

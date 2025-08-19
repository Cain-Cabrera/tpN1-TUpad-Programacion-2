package programacionEstructurada;

import java.util.Scanner;

public class ejercicio_02_tp2 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int numero, numeroMayor = 0;

        for (int i = 1; i <= 3; i++) {
            numero = input.nextInt();  // ✅ Lee un entero directamente
            if (numero > numeroMayor) {
                numeroMayor = numero;
            }
        }

        System.out.println("El número mayor es: " + numeroMayor);
    }
}  // 
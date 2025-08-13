package intruduccionJava;



import java.util.Scanner;
public class ejercicio_04 {

    
    public static void main(String[] args) {
        
        Scanner input = new Scanner(System.in);
        int edad;
        String nombre;
        
        System.out.print("Ingrese su nombre: ");
        nombre = input.nextLine();
        
        System.out.print("Ingrese su edad: ");
        edad = Integer.parseInt(input.nextLine());
        
        System.out.println("Mi nombre es " + nombre + " y tengo " + edad + " Anios");
    
        
    }
    
}

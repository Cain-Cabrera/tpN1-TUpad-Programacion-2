package intruduccionJava;


import java.util.Scanner;
public class Ejercicio_09 {

    public static void main(String[] args) { 
        Scanner scanner = new Scanner(System.in); 
        System.out.print("Ingresa tu nombre: "); 
        //String nombre = scanner.nextInt(); // ERROR 
        //System.out.println("Hola, " + nombre); 
        
        /* En este codigo, el error esta en la linea 8,
        no podemos capturar un entero cuando la variable guarda es de tipo
        String, eso habla de como java respeta los tipos de datos.
        Corrijo la linea 8 en las siguentes lineas. Dejo comentado
        las lineas asi no me da error el NetBeans.
        
        */
        //Scanner scanner = new Scanner(System.in); 
        System.out.print("Ingresa tu nombre: "); 
        String nombre = scanner.nextLine(); // ERROR 
        System.out.println("Hola, " + nombre); 
        
    }
    
}

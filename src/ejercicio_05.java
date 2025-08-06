/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */

import java.util.Scanner;
public class ejercicio_05 {
   
    public static void main(String[] args) {
        
        int num1;
        int num2;
        Scanner input = new Scanner(System.in);
        
        System.out.print("Ingrese un n entero: ");
        num1 = Integer.parseInt(input.nextLine());
        
        System.out.print("Ingrese el segundo n entero: ");
        num2 = Integer.parseInt(input.nextLine());
        
        System.out.println("Suma: " + (num1 + num2));
        System.out.println("Resta: " + (num1 - num2));
        System.out.println("Multiplicacion: " + (num1 * num2));
        System.out.println("Division: " + (num1 / num2));
        
    }
    
}
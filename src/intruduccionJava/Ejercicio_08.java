package intruduccionJava;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */

import java.util.Scanner;
public class Ejercicio_08 {

    public static void main(String[] args) {
        int num1,num2;
        int resultado;
        Scanner input = new Scanner(System.in);
        
        System.out.print("Ingrese numero 1: ");
        num1 = Integer.parseInt(input.nextLine());
        
        System.out.print("Ingrese numero 2: ");
        num2 = Integer.parseInt(input.nextLine());
        
        System.out.println( (double)num1 / num2);
    }
    
}

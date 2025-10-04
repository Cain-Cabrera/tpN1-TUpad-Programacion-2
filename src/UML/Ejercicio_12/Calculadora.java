/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package UML.Ejercicio_12;

/**
 *
 * @author Cain
 */
public class Calculadora {
    public void calcular(Impuesto impuesto) {
        System.out.println("Contribuyente: " + impuesto.getContribuyente().getNombre());
        System.out.println("Monto: " + impuesto.getMonto());
                
    }
}

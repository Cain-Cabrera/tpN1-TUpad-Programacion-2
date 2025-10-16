/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package HerenciayPolimorfismo.Ejercicio_02;

import java.util.ArrayList;

/**
 *
 * @author Cain
 */
public class Main {
    public static void main(String[] args) {
        ArrayList<Figura> figuras = new ArrayList();
        
        figuras.add(new Circulo(500, "Circulo"));
        figuras.add(new Rectangulo(5, 10, "Rectangulo"));
        
        for (Figura figura : figuras) {
            System.out.println(figura.calcularArea());
        }
    }
}

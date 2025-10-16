/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package HerenciayPolimorfismo.Ejercicio_02;

/**
 *
 * @author Cain
 */
public class Circulo extends Figura {
    private double radio;

    public Circulo(double radio,String nombre) {
        super(nombre);
        this.radio = radio;
    }

    @Override
    public double calcularArea() {
       return this.radio * 2 * Math.PI;
    }
    
    
}

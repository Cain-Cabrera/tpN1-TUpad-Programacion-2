/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package HerenciayPolimorfismo.Ejercicio_01;

/**
 *
 * @author Cain
 */
public class Main {
    public static void main(String[] args) {
        Auto fitito = new Auto("308", "Ferrari", 2);
        fitito.mostrarInfo();
        
        Vehiculo moto = new Vehiculo("A309", "Guerra");
        moto.mostrarInfo();
    }
}

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package UML.Ejercicio_02;

/**
 *
 * @author Cain
 */
public class Bateria {
    private String modelo;
    private int capacidad;
    
    public Bateria(String modelo,int capacidad) {
        this.capacidad = capacidad;
        this.modelo = modelo;
    } 

    public String getModelo() {
        return modelo;
    }

    public int getCapacidad() {
        return capacidad;
    }
    
    
    
}

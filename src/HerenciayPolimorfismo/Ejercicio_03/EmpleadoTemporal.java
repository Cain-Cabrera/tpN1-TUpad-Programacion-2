/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package HerenciayPolimorfismo.Ejercicio_03;

/**
 *
 * @author Cain
 */
public class EmpleadoTemporal extends Empleado {

    public EmpleadoTemporal(String nombre, Long id, double sueldoMensual) {
        super(nombre, id, sueldoMensual);
    }

    @Override
    public double calcularSueldoAnual() {
        return getSueldoMensual() * 6;
    }
    
}

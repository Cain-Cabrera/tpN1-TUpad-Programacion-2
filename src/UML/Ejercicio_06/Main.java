/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package UML.Ejercicio_06;

/**
 *
 * @author Cain
 */
public class Main {

    public static void main(String[] args) {
        Cliente cliente = new Cliente("Pedro Albornoz", "11332211");
        Mesa mesa = new Mesa(5, 4);
        Reserva reserva = new Reserva("2025-09-10", "21:00", mesa);
        reserva.setCliente(cliente);
        System.out.println("Cliente: " + reserva.getCliente().getNombre());
        System.out.println("Mesa número: " + reserva.getMesa().getNumero());

    }

}

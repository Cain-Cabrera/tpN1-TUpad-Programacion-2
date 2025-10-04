/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package UML.Ejercicio_13;

/**
 *
 * @author Cain
 */
public class GeneradorQR {
    public void generar(String valor, Usuario usuario) {
        CodigoQR codigoqr = new CodigoQR(valor, usuario);
        System.out.println("Codigo generado numero: " + codigoqr.getValor());
        System.out.println("Codigo generado para: " + usuario.getNombre());
        
    }
}

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package InterfacesYExcepciones.Interfaces;

/**
 *
 * @author Cain
 */
public class Paypal implements PagoConDescuento,Pago {
    private String gmail;

    public Paypal(String gmail) {
        this.gmail = gmail;
    }
    @Override
    public double procesarPago(double pago) {
        return 0;
        
    }
    
    @Override
    public double aplicarDescuento(double descuento) {
        return 0;
    }
}

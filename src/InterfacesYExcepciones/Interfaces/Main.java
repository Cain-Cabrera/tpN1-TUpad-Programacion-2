package InterfacesYExcepciones.Interfaces;

/**
 *
 * @author Cain
 */
public class Main {
    public static void main(String[] args) {
       
        Cliente cliente1 = new Cliente("Cain");
        Pedido pedido1 = new Pedido(cliente1, "Pendiente");
        Pedido pedido2 = new Pedido(cliente1, "Pendiente");
        TarjetaDeCredito visa = new TarjetaDeCredito();
        Paypal pagoPaypal = new Paypal();
        
        pedido1.aniadirProducto(new Producto("Aire acondicionado", 500000));
        pedido1.aniadirProducto(new Producto("Pc gamer", 230000));
        pedido1.aniadirProducto(new Producto("Mesa raton", 12000));
        
        pedido2.aniadirProducto(new Producto("Iphone 17", 250000));
        pedido2.aniadirProducto(new Producto("Samsung a52", 300000));
        pedido2.aniadirProducto(new Producto("Heladera", 70000));
        
        double montoTotal = pedido1.calcularTotal();
        visa.procesarPago(montoTotal);
        
        pedido1.cambiarEstadoDelPedido("Pago realizado");
        
        System.out.println("Abonamos el segundo Pedido con Paypal: ");
        System.out.println("------------------------------");
        
        double montoTotalConDescuento = pedido2.calcularTotal();
        pagoPaypal.procesarPago(montoTotalConDescuento);
        
        pedido2.cambiarEstadoDelPedido("Pago realalizado");
        
        
    }
}

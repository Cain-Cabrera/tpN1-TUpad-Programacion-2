package InterfacesYExcepciones.Interfaces;

import java.util.ArrayList;

/**
 *
 * @author Cain
 */
public class Pedido implements Pagable{
    private ArrayList<Producto> productos = new ArrayList();
    

    @Override
    public double calcularTotal() {
        double total = 0;
        for (Producto producto : productos) {
            total += producto.calcularTotal();
        }
        return total;
    }
}

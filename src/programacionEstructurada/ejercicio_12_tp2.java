
package programacionEstructurada;

public class ejercicio_12_tp2 {
    public static void main(String[] args) {
//        int[] listaPrecios = new int[5];
        int[] listaPrecios = {220,500,120,6,25};
        
        for (int i = 0; i < listaPrecios.length; i++) {
             int precios = listaPrecios[i];
            System.out.println("Precio: " + precios);
        }       
        System.out.println("vamos a modificar algunos precios.");
        
        listaPrecios[0] = 20;
        listaPrecios[1] = 40;
        listaPrecios[2] = 60;
        listaPrecios[3] = 80;
        listaPrecios[4] = 100;
        
        for (int i = 0; i < listaPrecios.length; i++) {
            int precios = listaPrecios[i];
            System.out.println("Precios: " + precios);
            
        }
            
        }
        
}

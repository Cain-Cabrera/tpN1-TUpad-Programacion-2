
package introduccionPoo;

public class MainNave {
    
    public static void main(String[] args) {
        NaveEspacial naveNodriza = new NaveEspacial("Destructora",NaveEspacial.MAX_COMBUSTIBLE);
        
        //Mostramos info de la nave.
        naveNodriza.mostrarInfo();
        
        //Despegamos y avanzamos hasta quedarnos sin combustible
        naveNodriza.despegar();
        naveNodriza.avanzar(20);
        naveNodriza.avanzar(20);
        naveNodriza.avanzar(20);
        naveNodriza.avanzar(20);
        naveNodriza.avanzar(20);
        
        System.out.print("\nVemos combustible disponible: ");
        System.out.println(naveNodriza.getCombustible());
        
        //Recargamos mas de la cuenta para verificar el maximo.
        //luego cargamos lo correcto y avanzamos
        
        naveNodriza.recargarCombustible(60);
        naveNodriza.recargarCombustible(40);
        naveNodriza.avanzar(200);
        
        System.out.println("");
        naveNodriza.mostrarInfo();
    }
}

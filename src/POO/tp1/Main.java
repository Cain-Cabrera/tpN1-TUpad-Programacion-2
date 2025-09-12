package poo.tp1;

/**
 *
 * @author Cain
 */
public class Main {
    public static void main(String[] args) {
        Empleado emple1 = new Empleado("Julian alvarez", "junior");
        Empleado emple2 = new Empleado(3, "Juan perez", "semisenior", 5500);
        
        // Mostramos via toString los datos de cada instanci:
        System.out.println(emple1);
        System.out.println(emple2);
        System.out.println("");
        
        //implemente un set para cambiar su puesto para asi subir su sueldo:
        emple1.setPuesto("semisenior");
        emple2.setPuesto("senior");
        System.out.println("");
        
        // Ahora vamos a incrementar su sueldo en ambas formas y ver el sueldo de ambos,
        System.out.println("Saldos actualizados: ");
        emple1.actualizarSaldo();
        System.out.println(emple1.getSalario());
        emple2.actualizarSaldo(20);
        System.out.println(emple2.getSalario());
        
        // Mostramos total empleados:
        System.out.println("Empleados creados: " + Empleado.mostrarEmpleados());
        System.out.println("");
        
        // Saldos actualizados, puesto actualizados y su informacion:
        System.out.println("Saldos y puestos Actualizados: ");
        System.out.println(emple1);
        System.out.println(emple2);
    }
}
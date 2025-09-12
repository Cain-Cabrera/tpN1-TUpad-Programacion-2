package poo.tp1;
/**
 *
 * @author Cain
 */
public class Empleado {
    private int id;
    private String nombreCompleto;
    private String puesto;
    private double salario;
    public static int totalEmpleados = 0;
    final static double AUMENTO_FIJO = 1500;
    final static double SALDO_MINIMO = 5000;
    
    public Empleado (int id,String nombreCompleto,String puesto,double salario){
        this.id = id;
        this.puesto = puesto;
        setSalario(salario);
        setNombreCompleto(nombreCompleto);
        totalEmpleados++;
    }

    public Empleado(String nombreCompleto, String puesto) {
        this(0,nombreCompleto,puesto,5000);
    }

    public void actualizarSaldo(double porcentajeAumento){
        if (porcentajeAumento > 0) {
            this.salario = salario * (1 +(porcentajeAumento / 100));
        }
    }
    
    public void actualizarSaldo() {
      this.salario += AUMENTO_FIJO;
    }
    
    @Override
    public String toString() {
        return "Empleado:{" + "id =" + id + ", nombreCompleto =" + nombreCompleto + ", puesto =" + puesto + ", salario =" + salario + '}';
    }

    public void setNombreCompleto(String nombreCompleto) {
        if (nombreCompleto != null) {
            this.nombreCompleto = nombreCompleto;
        }
    }

    public void setSalario(double salario) {
        if (salario >= SALDO_MINIMO) {
            this.salario = salario;
        }
    }
    
    public void setPuesto(String nuevoPuesto) {
        switch (nuevoPuesto) {
            case "junior":
            case "semisenior":
            case "senior":
                this.puesto = nuevoPuesto.toLowerCase();
                break;
            default:
                throw new IllegalArgumentException("Puesto no valido!");
        }
    }
    
    public static int mostrarEmpleados(){
        return totalEmpleados;
    }

    public int getId() {
        return id;
    }

    public String getNombreCompleto() {
        return nombreCompleto;
    }

    public String getPuesto() {
        return puesto;
    }

    public double getSalario() {
        return salario;
    }
    
    

    
    
    
    
    
    
    
    
    
}

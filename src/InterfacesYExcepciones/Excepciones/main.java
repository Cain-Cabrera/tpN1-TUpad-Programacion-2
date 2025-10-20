/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package InterfacesYExcepciones.Excepciones;

/**
 *
 * @author Cain
 */
public class main {
    public static void main(String[] args) {
        try {
            int[] numerales = new int[1];
            int entero = 3;
            numerales[3] = entero;
            
        } catch (ArithmeticException e) {
            System.out.println("Ocurrio un ERROR: " + e.getMessage());
            e.printStackTrace();
        } catch (IndexOutOfBoundsException iob) {
            System.out.println("Fuera de indice");
        } catch (Exception e) {
            System.out.println("Error en tiempo de ejecusion.");
        } finally {
            System.out.println("adios");
        }
        
    }
    
     
        
}

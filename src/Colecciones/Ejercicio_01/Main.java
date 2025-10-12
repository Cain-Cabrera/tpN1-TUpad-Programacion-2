/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Colecciones.Ejercicio_01;

/**
 *
 * @author Cain
 */
public class Main {
    public static void main(String[] args) {
        Inventario inventario = new Inventario();
        inventario.agregarProducto(new Producto("ABD123", "Pantalon Jean", 2000.0, 10, CategoriaProducto.ROPA));
        inventario.agregarProducto(new Producto("OPW482", "RTX4090", 1200.0, 1, CategoriaProducto.ELECTRONICA));
        inventario.agregarProducto(new Producto("OPS872", "Sillon de Pana", 12000.0, 3, CategoriaProducto.HOGAR));
        inventario.agregarProducto(new Producto("MJQ123", "Patitas de Pollo", 2200.0, 9, CategoriaProducto.ALIMENTOS));
        inventario.agregarProducto(new Producto("ABC890", "Arduino", 32000.0, 4, CategoriaProducto.ELECTRONICA));
        
        System.out.println("Productos: ");
        inventario.listarProductos();
        System.out.println("_________________________________");
        
     
        System.out.println("Buscamos un producto: ");
        System.out.println(inventario.buscarProducto("OPW482"));
        System.out.println("_________________________________");
        
        
        System.out.println("Filtramos por categoria: " + CategoriaProducto.ROPA);
        inventario.filtrarPorCategoria(CategoriaProducto.ROPA);
        System.out.println("_________________________________");
        
        System.out.println("Eliminamos un producto por su id: ");
        inventario.eliminarProducto("ABC890");
        System.out.println("");
        System.out.println("Lista sin el producto eliminado: ");
        inventario.listarProductos();
        System.out.println("_________________________________");
        
        System.out.println("Actualizamos stock del Pantalon de jean: ");
        inventario.actualizarStock("ABD123", 10);
        inventario.listarProductos();
        System.out.println("_________________________________");
        
        System.out.println("Total stock de todos los productos: ");
        inventario.obtenerTotalStock();
        System.out.println("_________________________________");
        
        System.out.println("Producto con mayor stock: " + inventario.obtenerProductoMayorStock());
        
        System.out.println("_________________________________");
        
        System.out.println("Productos con precio entre $1000 y $3000: ");
        System.out.println(inventario.filtrarPorPrecio(1000, 3000));
        System.out.println("_________________________________");
        
        System.out.println("Categorias disponibles: ");
        inventario.mostrarCategoriasDisponible();
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
    }
  
}

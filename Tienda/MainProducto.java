/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package MainClass;

/**
 *
 * @author elsyj
 */
public class MainProducto {

  public class Main {
    public static void main(String[] args) {
       Producto<?>[] productos = new Producto[4];

        // Llenar arreglo con productos variados
        productos[0] = new Libro("El Quijote", 299.99, 863);
        productos[1] = new Libro("Cien años de soledad", 199.50, 471);
        productos[2] = new Electronico("Laptop ASUS", 15999.99, "2 años");
        productos[3] = new Electronico("Smartphone Samsung", 8999.99, "1 año");

        // Recorrer y mostrar detalles
        for (Producto<?> p : productos) {
            p.mostrarDetalles();
        }
     }
    }  
}



    
        
    
  




/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package MainClass;

/**
 *
 * @author elsyj
 */
public class Libro extends Producto <Integer>{
    public Libro(String nombre, double precio,Integer paginas) {
        super(nombre,precio,paginas);
    }

   public void mostrarDetalles() {
        String inforExtra = null;
        System.out.println("Libro: " + nombre +
            " | Precio: $" + precio +
            " | Páginas: " + inforExtra);
    }
}
        
    


    


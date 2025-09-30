/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package MainClass;

/**
 *
 * @author elsyj
 */
public class Electronico extends Producto<String> {

    private String inforExtra;
   public Electronico(String nombre, double precio, String garantia) {
        super(nombre, precio, garantia);
    }

    
    public void mostrarDetalles() {
       String infoExtra; 
        System.out.println("Electrónico: " + nombre +
                           " | Precio: $" + precio +
                           " | Garantía: " + inforExtra);
    }
} 


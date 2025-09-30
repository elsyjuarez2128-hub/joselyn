/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package MainClass;

/**
 *
 * @author elsyj
 */
public abstract class Producto <T>{
   String nombre;
   double precio;
   private T inforEsxtra;
   
 public Producto(String nombre,double precio, T inforExtra){
       this.nombre = nombre;
       this.precio = precio;
       this.inforEsxtra = inforExtra;
   
       
       
    }

    public String getNombre() {
        return nombre;
    }

    public double getPrecio() {
        return precio;
    }

    public T getInforEsxtra() {
        return inforEsxtra;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setPrecio(double precio) {
        this.precio = precio;
    }

    public void setInforEsxtra(T inforEsxtra) {
        this.inforEsxtra = inforEsxtra;
    }

    void mostrarDetalles() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
    
}

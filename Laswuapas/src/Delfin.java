/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author elsyj
 */
public abstract class Delfin extends Animal {
    
    public Delfin(String nombre, int edad){
        super(nombre, edad);
    }
   
    public void hacerSonido(){
      System.out.println(getNombre()+ "hace: ¡chirp chirp!");
    }
    public void moverse(){
        System.out.print(getNombre() + " nada rapidamente en el agua.");
    }
            
    
}

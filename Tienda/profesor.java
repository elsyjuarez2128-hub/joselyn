/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package MainClass;

/**
 *
 * @author elsyj
 */
public class profesor {
    private String profesor;
    private String nombres;
    private String apellido;
    private int numeroTrabajo;

   
    public profesor(String profesor, String nombres, String apellido, int numeroTrabajo) {
        this.profesor = profesor;
        this.nombres = nombres;
        this.apellido = apellido;
        this.numeroTrabajo = numeroTrabajo;
    }

   
    public String getProfesor() {
        return profesor;
    }

    public String getNombres() {
        return nombres;
    }

    public String getApellido() {
        return apellido;
    }

    public int getNumeroTrabajo() {
        return numeroTrabajo;
    }

    
    public void setProfesor(String profesor) {
        this.profesor = profesor;
    }

    public void setNombres(String nombres) {
        this.nombres = nombres;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public void setNumeroTrabajo(int numeroTrabajo) {
        this.numeroTrabajo = numeroTrabajo;
    }

   
    public void mostrarDatos() {
        System.out.println("Profesor: " + profesor);
        System.out.println("Nombres: " + nombres);
        System.out.println("Apellido: " + apellido);
        System.out.println("Número de trabajo: " + numeroTrabajo);
    }

   
    public static void main(String[] args) {
        profesor prof1 = new profesor("Matemáticas", "Juan", "Pérez", 12345);
        prof1.mostrarDatos();
    }
}


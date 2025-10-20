| U2ACT1 Ejercicio de Lista Enlazada Simple con VisuAlgo     | Evidencia       |
|  Insertar elementos en la lista                            |<img width="948" height="926" alt="Captura de pantalla 2025-10-18 140927" src="https://github.com/user-attachments/assets/48f69dc8-9e8a-4de0-aaf6-247833bba36f" />ght-aligned| 
|  Eliminar elementos de la lista                            |<img width="938" height="874" alt="Captura de pantalla 2025-10-18 152714" src="https://github.com/user-attachments/assets/fab8216b-d872-45ba-989f-1e97d5bd8499" />ed|                                          |![preguntas](https://github.com/user-attachments/assets/a33df05f-640e-4cf7-85b6-7863dd421c94)
|
|Preguntas|
| Listas Encantada Humana en java                        |[U2ACT2 Lista Encantada Humana en Java-Elsy.Godinez.pdf](https://github.com/user-attachments/files/22992961/U2ACT2.Lista.Encantada.Humana.en.Java-Elsy.Godinez.pdf)
|   


U2ACT3 Practica Manual y Algoritmica Lista|[U2ACT3 Practica Manual y Algoritmica Lista-Elsy Juarez (3).pdf](https://github.com/user-attachments/files/22992970/U2ACT3.Practica.Manual.y.Algoritmica.Lista-Elsy.Juarez.3.pdf)|
Listas Simplemete Enlazadas


 * @author Elsy Joselyn Godinez Juarez 

class Nodo {
    String dato;
    Nodo sig; 

    public Nodo(String dato) {
        this.dato = dato;
        this.sig = null;
    }
}
public class ListaSimpleVisual {

    private Nodo inicio; 

    public ListaSimpleVisual() {
        inicio = null;
    }

    public void insertarFinal(String dato) {
        Nodo nuevo = new Nodo(dato);
        if (inicio == null) {
            inicio = nuevo;
        } else {
            Nodo aux = inicio;
            while (aux.sig != null) {
                aux = aux.sig;
            }
            aux.sig = nuevo;
        }
        System.out.println("Insertado: " + dato);
        mostrar();
    }
    public void insertarDespuesDe(String referencia, String nuevoDato) {
        Nodo nuevo = new Nodo(nuevoDato);
        Nodo aux = inicio;

        while (aux != null && !aux.dato.equals(referencia)) {
            aux = aux.sig;
        }

        if (aux != null) {
            nuevo.sig = aux.sig;
            aux.sig = nuevo;
            System.out.println("\nInsertado " + nuevoDato + " después de " + referencia);
            mostrar();
        } else {
            System.out.println("No se encontró el nodo con dato: " + referencia);
        }
    }

   
    public void eliminar(String dato) {
        if (inicio == null) {
            System.out.println("La lista está vacía.");
            return;
        }

        if (inicio.dato.equals(dato)) {
            inicio = inicio.sig;
            System.out.println("\nEliminado: " + dato);
            mostrar();
            return;
        }

      
        Nodo aux = inicio;
        while (aux.sig != null && !aux.sig.dato.equals(dato)) {
            aux = aux.sig;
        }

        if (aux.sig != null) {
            aux.sig = aux.sig.sig;
            System.out.println("\nEliminado: " + dato);
            mostrar();
        } else {
            System.out.println("No se encontró el nodo con dato: " + dato);
        }
    }

    public void mostrar() {
        System.out.println("\nEstado actual de la lista:");
        Nodo aux = inicio;
        while (aux != null) {
            System.out.print("[" + aux.dato + "]");
            if (aux.sig != null) {
                System.out.print(" → ");
            } else {
                System.out.print(" → NULL");
            }
            aux = aux.sig;
        }
        System.out.println("\n");
    }

    
    public static void main(String[] args) {

        ListaSimpleVisual lista = new ListaSimpleVisual();

  
        System.out.println(" Creación de la lista");
        lista.insertarFinal("Ana");
        lista.insertarFinal("Benjamín");
        lista.insertarFinal("Carla");
        lista.insertarFinal("Diego");
        
        lista.insertarDespuesDe("Carla", "Elena");

       
        lista.eliminar("Benjamín");
    }
}

Listas Dobles

/**
 *
 * @author Elsy Joselyn Godinez Juarez


public class ListaDoble {
class Nodo {
    String dato;
    Nodo siguiente;
    Nodo anterior;

    public Nodo(String dato) {
        this.dato = dato;
        this.siguiente = null;
        this.anterior = null;
    }
}


    private Nodo cabeza; 

   
    public ListaDoble() {
        cabeza = null;
    }

    public void crearNodo(String dato) {
        Nodo nuevo = new Nodo(dato);

        if (cabeza == null) {
            cabeza = nuevo;
        } else {
            Nodo temp = cabeza;
            while (temp.siguiente != null) {
                temp = temp.siguiente;
            }
            temp.siguiente = nuevo;
            nuevo.anterior = temp;
        }

        System.out.println("Nodo creado: " + dato);
    }

    
    public void insertarDespuesDe(String referencia, String nuevoDato) {
        Nodo temp = cabeza;

        while (temp != null && !temp.dato.equals(referencia)) {
            temp = temp.siguiente;
        }

        if (temp != null) {
            Nodo nuevo = new Nodo(nuevoDato);
            nuevo.siguiente = temp.siguiente;
            nuevo.anterior = temp;

            if (temp.siguiente != null) {
                temp.siguiente.anterior = nuevo;
            }

            temp.siguiente = nuevo;

            System.out.println("Insertado " + nuevoDato + " después de " + referencia);
        } else {
            System.out.println("No se encontró el nodo con dato: " + referencia);
        }
    }
    public void recorrerAdelante() {
        Nodo temp = cabeza;
        System.out.println("\nRecorrido hacia adelante:");
        while (temp != null) {
            System.out.print("[" + temp.dato + "]");
            if (temp.siguiente != null) {
                System.out.print(" ↔ ");
            }
            temp = temp.siguiente;
        }
        System.out.println(" → NULL");
    }

    public void recorrerAtras() {
        if (cabeza == null) return;

        Nodo temp = cabeza;
        while (temp.siguiente != null) {
            temp = temp.siguiente;
        }

        System.out.println("\nRecorrido hacia atrás:");
        while (temp != null) {
            System.out.print("[" + temp.dato + "]");
            if (temp.anterior != null) {
                System.out.print(" ↔ ");
            }
            temp = temp.anterior;
        }
        System.out.println(" → NULL");
    }


    public static void main(String[] args) {

     ListaDoble lista = new ListaDoble();

        
        lista.crearNodo("Programación");
        lista.crearNodo("Mate");
        lista.crearNodo("Inglés");

        lista.recorrerAdelante();
        lista.insertarDespuesDe("Programación", "Base de Datos");
        lista.recorrerAdelante();
        lista.recorrerAtras();
    }
}

LIstas Circular 


* @author Elsy Joselyn Godinez Juarez 
 */
public class ListaCircular {
    
class Nodo {
    String dato;
    Nodo sig; // referencia al siguiente nodo

    public Nodo(String dato) {
        this.dato = dato;
        this.sig = null;
    }
}

    private Nodo cabeza; 

   
    public ListaCircular() {
        cabeza = null;
    }
    public void crearListaInicial() {
        Nodo rojo = new Nodo("Rojo");
        Nodo verde = new Nodo("Verde");
        Nodo azul = new Nodo("Azul");
        Nodo amarillo = new Nodo("Amarillo");

        rojo.sig = verde;
        verde.sig = azul;
        azul.sig = amarillo;
        amarillo.sig = rojo; 

        cabeza = rojo;
        System.out.println("Lista circular creada correctamente.");
    }
    public void recorrerUnaVuelta() {
        if (cabeza == null) return;

        Nodo aux = cabeza;
        System.out.println("\nRecorrido circular (1 vuelta):");
        do {
            System.out.print("[" + aux.dato + "] → ");
            aux = aux.sig;
        } while (aux != cabeza);
        System.out.println("(vuelve al inicio)");
    }

 
    public void insertarMorado() {
        if (cabeza == null) return;

        Nodo aux = cabeza;
        while (!aux.dato.equals("Azul")) {
            aux = aux.sig;
        }

        Nodo nuevo = new Nodo("Morado");
        nuevo.sig = aux.sig; // Morado apunta a Amarillo
        aux.sig = nuevo;     // Azul apunta a Morado

        System.out.println("\nInsertado 'Morado' entre Azul y Amarillo.");
    }
    public void eliminar(String dato) {
        if (cabeza == null) return;

        Nodo aux = cabeza;
        Nodo anterior = null;

        do {
            if (aux.dato.equals(dato)) {
                if (anterior != null) {
                    anterior.sig = aux.sig;
                } else { // si es el primero
                    Nodo temp = cabeza;
                    while (temp.sig != cabeza) {
                        temp = temp.sig;
                    }
                    cabeza = aux.sig;
                    temp.sig = cabeza;
                }
                System.out.println("\nEliminado nodo: " + dato);
                return;
            }
            anterior = aux;
            aux = aux.sig;
        } while (aux != cabeza);

        System.out.println("\nNo se encontró el nodo: " + dato);
    }

    
    public static void main(String[] args) {

        ListaCircular lista = new ListaCircular();
      
        lista.crearListaInicial();
        lista.recorrerUnaVuelta();
        lista.insertarMorado();
        lista.recorrerUnaVuelta();
        
        lista.eliminar("Verde");
        lista.recorrerUnaVuelta();
    }
}

Listas Enlazadas |[Listas Enlazadas.pdf](https://github.com/user-attachments/files/22987263/Listas.Enlazadas.pdf)

U2ACT2 Ejercicio de Pila con VisuAlgo


| Crear Pila                               | Evidencia          | 
| Ejercicios                               |![insertar](https://github.com/user-attachments/assets/1c6c72bd-be1c-4c3e-9740-7b559322abbd)|

| Preguntas                                |![preguntas](https://github.com/user-attachments/assets/3bf9008d-48a1-4c7c-91b2-ea9e84abb0a6)|

|U2ACT3 Práctica Manual y Algorítmica Lista|![Listas Doblemente Enlazadas](https://github.com/user-attachments/assets/b9e8d5f7-7e55-48b9-b3eb-e1b24d4e24ef)|
|Lista Circular|![Lista Circular](https://github.com/user-attachments/assets/a075a4ed-d474-4c0c-9f69-5a80a5bf62dc)|

|U2ACT2 Especificación de la Pila|

|public class MainMyStack {

    public static void main(String[] args) {
        StackArray<String> nombres = new StackArray<>();

        nombres.push("Luis");
        nombres.push("Marisol");
        nombres.push("Angel");

        System.out.println("Elemento eliminado: " + nombres.pop());
        System.out.println("Elemento eliminado: " + nombres.pop());
        System.out.println("Elemento en el tope: " + nombres.peek());
    }
}

class StackArray<E> implements IStack<E> {
    private E[] elementos;
    private int tope;
    private static final int CAPACIDAD = 10;

    @SuppressWarnings("unchecked")
    public StackArray() {
        elementos = (E[]) new Object[CAPACIDAD];
        tope = -1;
    }

    @Override
    public void push(E elemento) {
        if (tope == elementos.length - 1) {
            throw new RuntimeException("La pila está llena");
        }
        elementos[++tope] = elemento;
    }

    @Override
    public E pop() {
        if (isEmpty()) {
            throw new RuntimeException("La pila está vacía");
        }
        return elementos[tope--];
    }

    @Override
    public E peek() {
        if (isEmpty()) {
            throw new RuntimeException("La pila está vacía");
        }
        return elementos[tope];
    }

    @Override
    public boolean isEmpty() {
        return tope == -1;
    }
}|




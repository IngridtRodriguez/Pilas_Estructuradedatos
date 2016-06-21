/*
-Simular una pila de direcciones con opciones 
(insertar una dirección, quitar una dirección, salir.)
Tome en cuenta las siguientes situaciones pila llena, pila vacia, subdesbordamientos y desbordamiento.
Imprima después de cada proceso.

 */
package proyectodatosi;
import java.util.*;

public class ProyectoDatosI {

    public static void main(String[] args) {
        Pila();
    }
    
    private static void imprimePila (Stack <String> s){
        if (s.isEmpty())
            System.out.print("\nPila vacía. Tope=0");
        else 
            System.out.print(s+ "\tTope="+ s.size());
    }
    
    private static void quitarElemento (Stack <String> s){
        if (!(s.isEmpty()))
            s.pop();
    }
    
    private static void insertarElemento (Stack <String> s, int el, int tamMax){
        if (s.size()>tamMax)
            System.out.print("\nPila en desbordamiento. No se puede insertar elemento.");
        else if (s.size()==tamMax)
            System.out.print("\nPila llena.\n");
        else {
            s.push("ProyectoDatosI@"+Integer.toHexString(System.identityHashCode(el)));
        }
    }

    public static void Pila(){
        Stack<String> pila= new Stack<String>();
        Scanner sc= new Scanner(System.in);
        int opc, dato=0;
        
        do{
            System.out.print("\n\t\tMENÚ\n1.Agregar dirección\t\t2.Eliminar dirección\t\t3.Salir\n");
            System.out.print("Ingrese una opción: ");
            opc=sc.nextInt();
        switch (opc){
            case 1: 
                //System.out.print("Ingrese entero a agregar: ");
                dato++;
                insertarElemento(pila,dato,5);
                imprimePila(pila);
                break;
             
            case 2: 
                quitarElemento(pila);
                imprimePila(pila);
                break;
                
            case 3:
                System.exit(0);
            
            default:
                System.out.println("Opción no válida.");
        }
        }while (opc!=0);  
    }
}

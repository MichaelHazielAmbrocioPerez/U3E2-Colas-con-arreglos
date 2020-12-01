package u3e2;

import java.util.Scanner;
import javax.swing.JOptionPane;

public class Main {

    public static void main(String[] args) {
        int opc;
        String palabra;
    
    Cola cola = new Cola();
    Scanner leer = new Scanner(System.in);

    do{
    System.out.println("[1]Insertar");
    System.out.println("[2]Eliminar");
    System.out.println("[3]Mostrar");
    System.out.println("[4]Salir");
    
    opc = leer.nextInt();
    
    switch(opc){
    
        case 1:
            System.out.println("Palabra a insertar");
            palabra = leer.next();
            cola.Insertar(palabra);
        break;
        
        case 2:
            if (!cola.ColaV()) {
                System.out.println(" Se borró " + cola.sacarCola());
                
            } else {
                System.out.println("Esta vacia");
                
            }
        break;
        
        case 3:
            cola.mostrarCola();
        break;
        
        case 4:
            System.out.println("Chau");
        break;
        
        default:
            System.out.println("Pongalo bien");
        break;    
    }
    
    }while(opc != 4);
    
}
}

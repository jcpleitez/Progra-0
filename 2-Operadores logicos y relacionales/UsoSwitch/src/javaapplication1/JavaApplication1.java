package javaapplication1;

import java.util.Scanner;

/**
 *
 * @author jcpleitez
 */
public class JavaApplication1 {

    public static void main(String[] args) {

        int seleccion = (new Scanner(System.in)).nextInt();
        
        switch (seleccion) {
            case 1:
                System.out.println("Agregar Persona");
                break;
            case 2:
                System.out.println("Pagar");
                break;
            case 3:
                System.out.println("Cerrar");
                break;
            case 4:
                System.out.println("Historial");
                break;
            default:
                break;
        }
        
        
    }

}

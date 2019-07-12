package ejercicio_1_3;

import java.util.Scanner;

/**
 *
 * @author Juan
 */
public class Ejercicio_1_3 {

    public static void main(String[] args) {
        //Ingresar Nombre y mostrar Bienvenido
        
        //Variables principales
        String nombre = "";
        Scanner entrada = new Scanner(System.in);
        
        //Ingresando Nombre
        nombre = entrada.nextLine();
        
        //Mostrar el mensaje
        System.out.println("Bienvenido al curso de Programacion Cero "+nombre);
        
    }
    
}

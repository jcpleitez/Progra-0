package ejercicio_1_2;

import java.util.Scanner;

/**
 *
 * @author Juan
 */
public class Ejercicio_1_2 {

    public static void main(String[] args) {        
        //Preguntar 3 numeros desde la consola y mostrarlos
        
        //Declarar la variables
        Scanner entrada = new Scanner(System.in);
        int numero1, numero2, numero3;
        
        //Ingresar Datos
        System.out.print("Ingrese Numero1:");
        numero1 = entrada.nextInt();
        
        System.out.print("Ingrese Numero2:");
        numero2 = entrada.nextInt();
        
        System.out.print("Ingrese Numero3:");
        numero3 = entrada.nextInt();
        
        //Mostrar en la consola
        System.out.println("Numero1 es: "+numero1);
        System.out.println("Numero2 es: "+numero2);
        System.out.println("Numero3 es: "+numero3);
        
    }
    
}

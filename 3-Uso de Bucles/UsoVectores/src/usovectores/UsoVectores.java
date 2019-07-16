package usovectores;

import java.util.Scanner;
import javax.swing.JOptionPane;

/**
 *
 * @author jcpleitez
 */
public class UsoVectores {

    public static void main(String[] args) {

        /*
        int vector[] = new int[3];
        System.out.println("Ingrese Numeros del 1 al 5");
        
        for (int i = 0; i < vector.length; i++) {
            vector[i] = (new Scanner(System.in)).nextInt();            
        }        
        System.out.println("Imprimiendo Vector");
        for (int i = 0; i < vector.length; i++) {
            System.out.println(vector[i]);
        }
         */
        String nombres[] = new String[3];
        
        
        //Ingresando Alumnos
        for (int i = 0; i < nombres.length; i++) {
            nombres[i] = JOptionPane.showInputDialog("Ingrese el Nombre del estudiante "+(i+1));
        }
        //Mostrando alumnos
        for (int i = 0; i < nombres.length; i++) {
            JOptionPane.showMessageDialog(null, "Alumno "+ (i+1) + " se llama "+ nombres[i]);
        }
    }

}

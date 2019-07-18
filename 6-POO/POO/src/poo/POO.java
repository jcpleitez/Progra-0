package poo;

import java.util.Scanner;
import javax.swing.JOptionPane;

public class POO {

    public static void main(String[] args) {
        //Scanner entrada = new Scanner(System.in);
        
        Persona personas[] = new Persona[3];
        
        for (int i = 0; i < personas.length; i++) {
            Persona p = new Persona();
            p.Registrarme();
            personas[i]=p;
        }
        
        for (int i = 0; i < personas.length; i++) {
            JOptionPane.showMessageDialog(null, "El Nombre de la persona "+(i+1)+" es "+personas[i].getNombres());
        }

        
        

    }

}

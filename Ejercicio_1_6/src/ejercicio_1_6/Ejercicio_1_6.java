package ejercicio_1_6;

import javax.swing.JOptionPane;

/**
 *
 * @author Juan
 */
public class Ejercicio_1_6 {

    public static void main(String[] args) {
        //Mensaje de bienvenida con nombre usando JOptionPane
        
        //Variables Principales
        String nombre = "";
        
        //Ingresando Nombre
        nombre = JOptionPane.showInputDialog("Ingrese su Nombre");
        
        //Mostrar mensaje de bienvenida
        JOptionPane.showMessageDialog(null, "Bienvenido a Progra Cero \n"+nombre);
    }
    
}

package ejercicio_1_5;

import javax.swing.JOptionPane;

/**
 *
 * @author Juan
 */
public class Ejercicio_1_5 {

    public static void main(String[] args) {
        //Preguntar 3 numeros y mostrar con JOptionPane
        //Declarar la variables
        String salida = "";
        int numero1, numero2, numero3;

        //Ingresar Datos con JOptionPane        
        numero1 = Integer.parseInt(JOptionPane.showInputDialog("Ingrese Numero1"));
        numero2 = Integer.parseInt(JOptionPane.showInputDialog("Ingrese Numero2"));
        numero3 = Integer.parseInt(JOptionPane.showInputDialog("Ingrese Numero3"));

        //Crear salida
        salida += "Numero1 es " + numero1 + "\n";
        salida += "Numero2 es " + numero2 + "\n";
        salida += "Numero3 es " + numero3 + "\n";
        
        //Mostrar la Salida con JOptionPane
        JOptionPane.showMessageDialog(null, salida);

    }

}

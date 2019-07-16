package usodowhile;

import javax.swing.JOptionPane;

/**
 *
 * @author jcpleitez
 */
public class UsoDoWhile {

    public static void main(String[] args) {
        int menu = 0;
        String nombre = "";
        //nombre = JOptionPane.showInputDialog("Ingrese su nombre");
        
        do {
            String texto = JOptionPane.showInputDialog("Menu:\n"
                    + "1-Ingrese Su Nombre\n"
                    + "2-Mostrar Nombre\n"
                    + "3-Salir\n");
            menu = Integer.parseInt(texto);
            //Creando Nuestro Menu
            switch (menu) {
                case 1:
                    nombre = JOptionPane.showInputDialog("Ingrese su nombre");
                    break;
                case 2:
                    JOptionPane.showMessageDialog(null, "Su Nombre es:"+nombre);
                    break;
                case 3:
                    JOptionPane.showMessageDialog(null, "Que le vaya bien...");
                    break;
                default:
                    break;
            }
            
            
        } while (nombre.length() == 0 || menu != 3);
        
        
    }
    
}

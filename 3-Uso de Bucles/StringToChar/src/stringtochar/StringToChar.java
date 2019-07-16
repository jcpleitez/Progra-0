package stringtochar;

import javax.swing.JOptionPane;

/**
 *
 * @author jcpleitez
 */
public class StringToChar {

    public static void main(String[] args) {
        
        String frase = JOptionPane.showInputDialog("Ingrese su Frase");
        
        char vector[] = new char[frase.length()];
        
        for (int i = 0; i < vector.length; i++) {
            vector[i] = frase.charAt(i);
        }
        
        System.out.println(vector);
        
    }
    
}

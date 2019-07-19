package usolist;

import java.util.ArrayList;
import java.util.List;
import javax.swing.JOptionPane;

/**
 *
 * @author jcpleitez
 */
public class UsoList {

    public static void main(String[] args) {
        
        boolean repetir = true;
        List<String> nombres = new ArrayList<>();
        
        do {
            //Capturando el nombre
            String nombre = JOptionPane.showInputDialog("Ingrese su nombre");
            nombres.add(nombre);
            //Verificar si quiere seguir
            String continuar = JOptionPane.showInputDialog("Desea Continua?");
            repetir = !continuar.equalsIgnoreCase("no");
            
        } while (repetir);
        
        //Mostrando los nombres
        String reporte = "";
        for (int i = 0; i < nombres.size(); i++) {
            reporte += nombres.get(i) +"\n";
        }
        JOptionPane.showMessageDialog(null, reporte);
        
        
                
        
    }
    
}

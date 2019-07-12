package calculo.de.cifras;

import javax.swing.JOptionPane;

/**
 *
 * @author jcpleitez
 */
public class CalculoDeCifras {

    public static void main(String[] args) {

        String texto = "";
        int numero;
        boolean repetir = true;

        do {

            try {
                texto = JOptionPane.showInputDialog("Ingrese su numero");
                numero = Integer.parseInt(texto);
                //Se ha convertido con Exito
                repetir = false;
            } catch (Exception e) {
                JOptionPane.showMessageDialog(null, "Error, Ingrese de nuevo el Numero");
            }

        } while (repetir);

        //Calculo para determinar las cifras
        JOptionPane.showMessageDialog(null, "La cantidad de cifras es "+texto.length());
                

    }

}

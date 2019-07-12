package descuentos;

import javax.swing.JOptionPane;

/**
 *
 * @author jcpleitez
 */
public class Descuentos {

    public static void main(String[] args) {

        String texto = JOptionPane.showInputDialog("Ingrese Cuanto Gasto:");
        double dinero = Double.parseDouble(texto);

        if (dinero > 300.00) {
            double descuento = (dinero) * (0.2);
            System.out.println("Se Descontaron = $" + descuento);
            dinero = dinero - descuento;
            System.out.println("Se cobraran $" + dinero);
        } else {
            System.out.println("Se cobraran $" + dinero);
        }

    }

}

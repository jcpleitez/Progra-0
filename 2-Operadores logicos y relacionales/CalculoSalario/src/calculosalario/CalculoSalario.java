package calculosalario;

import javax.swing.JOptionPane;

/**
 *
 * @author jcpleitez
 */
public class CalculoSalario {

    public static void main(String[] args) {

        String texto = JOptionPane.showInputDialog("Cuantas Horas Trabajo?");
        int horas = Integer.parseInt(texto);
        double salario = 0.0;

        if (horas <= 40) {
            salario = horas * 16.0;
        } else {
            //Calculo para las 40 horas
            salario = 40 * 16.0;
            //Calculo para las horas extra
            int hExtra = horas - 40;
            salario = salario + (hExtra * 20.0);            
        }
        
        JOptionPane.showMessageDialog(null, "El trabajador gano $"+salario);

    }

}

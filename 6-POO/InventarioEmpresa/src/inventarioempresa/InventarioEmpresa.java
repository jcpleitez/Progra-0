package inventarioempresa;

import javax.swing.JOptionPane;

/**
 *
 * @author jcpleitez
 */
public class InventarioEmpresa {

    public static void main(String[] args) {

        int seleccion;
        boolean repetir = true;
        //Ingresando Tamaño del Inventario
        String textTamanio = JOptionPane.showInputDialog("Ingrese tamaño de su Inventario");
        int tamanio = Integer.parseInt(textTamanio);
        //Declarando Nuestros vectores
        String productos[] = new String[tamanio];
        double precios[] = new double[productos.length];
        //Llenando el vector productos con vacio
        for (int i = 0; i < productos.length; i++) {
            productos[i] = "";
        }

        do {
            String texto = JOptionPane.showInputDialog("Menu\n"
                    + "1. Registrar Entrada\n"
                    + "2. Retirar Entrada\n"
                    + "3. Mostrar Registros\n"
                    + "4. Mostrar Capital Actual\n"
                    + "5. Salir");
            seleccion = Integer.parseInt(texto);

            switch (seleccion) {
                case 1:
                    String nombre = JOptionPane.showInputDialog("Ingrese Nombre Producto:");
                    String tPrecio = JOptionPane.showInputDialog("Ingrese Precio del Producto:");
                    double precio = Double.parseDouble(tPrecio);
                    for (int i = 0; i < productos.length; i++) {
                        if (productos[i].length() == 0) {
                            productos[i] = nombre;
                            precios[i] = precio;
                            break;
                        }
                    }
                    break;
                case 2:
                    String tBorrar = JOptionPane.showInputDialog("Ingrese Posicion a Retirar");
                    int borrar = Integer.parseInt(tBorrar);
                    if (borrar > 0 && borrar <= productos.length) {
                        productos[borrar - 1] = "";
                        precios[borrar - 1] = 0.0;
                    } else {
                        JOptionPane.showMessageDialog(null, "Por favor Ingrese valores correcto");
                    }
                    break;
                case 3:
                    String reporte = "";
                    for (int i = 0; i < productos.length; i++) {
                        String pisto = (precios[i] == 0.0) ? "" : precios[i] + "";
                        if (productos[i].length() != 0) {
                            reporte += productos[i] + "    " + pisto + "\n";
                        }
                    }
                    JOptionPane.showMessageDialog(null, reporte);
                    break;
                case 4:
                    double capital = 0.0;
                    for (int i = 0; i < precios.length; i++) {
                        capital += precios[i];
                    }
                    JOptionPane.showMessageDialog(null, "Su Capital es de " + capital);
                    break;
                case 5:
                    repetir = false;
                    break;
                default:
                    break;
            }
        } while (repetir);

    }

}

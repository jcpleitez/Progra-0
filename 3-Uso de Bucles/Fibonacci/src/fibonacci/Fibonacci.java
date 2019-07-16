package fibonacci;

/**
 *
 * @author jcpleitez
 */
public class Fibonacci {

    public static void main(String[] args) {

        int acumador = 0;
        int anterior = 1;
        int siguiente = 1;
        for (int i = 0; i < 13; i++) {

            if (i == 0) {
                acumador = 0;
            }else if (i == 1 || i == 2){
                acumador = 1;
            }else{
                acumador = anterior + siguiente;
                anterior = siguiente;
                siguiente = acumador;
            }

            System.out.print(acumador + ",");

        }

    }

}

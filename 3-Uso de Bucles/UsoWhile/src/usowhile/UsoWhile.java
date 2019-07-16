package usowhile;

/**
 *
 * @author jcpleitez
 */
public class UsoWhile {

    public static void main(String[] args) {

        int acumulador = 0;
        while (acumulador < 10) {
            System.out.println("Hola" + (acumulador + 1));
            acumulador++;
        }

        for (int i = 0; i < 10; i++) {
            System.out.println("Hola" + (i + 1));
        }

        int contador = 0;
        do {
            System.out.println("Hola" + (contador + 1));
            contador++;
        } while (contador < 10);

    }

}

package escaleranumeros;

import java.util.Scanner;

/**
 *
 * @author jcpleitez
 */
public class EscaleraNumeros {

    public static void main(String[] args) {
        
        Scanner entrad = new Scanner(System.in);
        System.out.println("Ingrese la Altura de su piramide:");
        int altura = entrad.nextInt();
        
        for (int linea = 0; linea < altura; linea++) {
            for (int iterador = 0; iterador < linea+1; iterador++) {
                System.out.print(iterador+1);
            }
            System.out.println();
        }
        
    }
    
}

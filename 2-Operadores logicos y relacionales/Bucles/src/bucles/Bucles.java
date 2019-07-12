package bucles;

import java.util.Scanner;

/**
 *
 * @author jcpleitez
 */
public class Bucles {

    public static void main(String[] args) {
        System.out.println("Ingrese Hasta que numero desea contar");
        int numero = (new Scanner(System.in).nextInt());
        
        for (int i = 0; i < numero; i++) {
            
            if(i == 7){
                break;
            }
            
            System.out.println(i+1);
            
        }
        
        
    }
    
}

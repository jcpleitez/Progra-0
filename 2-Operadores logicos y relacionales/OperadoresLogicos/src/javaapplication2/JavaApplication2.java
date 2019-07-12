package javaapplication2;

/**
 *
 * @author jcpleitez
 */
public class JavaApplication2 {

    public static void main(String[] args) {
        
        boolean x = false;
        boolean y = true;
        int z = 8;
        int w = 6;
        
        if (x == y) {            
            System.out.println("Son Iguales");            
        }
        
        if (x != y) {
            System.out.println("Son distintos");
        }
        
        if (x && y) {
            System.out.println("Ambos son Verdaderos");
        }
        
        if (x || y) {
            System.out.println("Al menos uno es Verdadero");            
        }
        
        if (!x == y) {
            System.out.println("Operador Not en X con Y son Verdaderos");            
        }
        
        if (z > w) {
            System.out.println("Z es mayor que W");            
        }else{
            System.out.println("W es mayor que Z");            
        }
        
        if (z % 2 == 0) {
            System.out.println("Z es Par");
        }else{
            System.out.println("Z es NO ES Par");
        }
        
    }
    
}

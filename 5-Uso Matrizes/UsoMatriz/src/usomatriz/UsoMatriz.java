package usomatriz;

/**
 *
 * @author jcpleitez
 */
public class UsoMatriz {

    public static void main(String[] args) {
        
        double matriz[][] = new double[5][5];
        
        //Imprimiendo Matriz        
        for (int col = 0; col < matriz.length; col++) {
            for (int fila = 0; fila < matriz.length; fila++) {
                System.out.print(matriz[col][fila]+"\t");
            }   
            System.out.println("");
        }
        
    }
    
}

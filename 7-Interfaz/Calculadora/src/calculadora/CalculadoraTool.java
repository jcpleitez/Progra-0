package calculadora;

/**
 *
 * @author jcpleitez
 */
public class CalculadoraTool {

    public CalculadoraTool() {
    }
    
    public int suma(int a, int b){
        return a + b;
    }
    
    public int resta(int a, int b){
        return a - b;
    }
    
    public int multiplicacion(int a, int b){
        return a * b;
    }
    
    public double divison(int a, int b){
        return a / b;
    }
    
    public double potencia(int a, int b){
        return Math.pow(a, b);
    }
    
    public double raizCuadrada(double a){
        return Math.sqrt(a);
    }
}

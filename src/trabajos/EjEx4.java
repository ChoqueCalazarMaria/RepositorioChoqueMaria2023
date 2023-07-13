//ejercicios del examen final
package trabajos;
import java.util.Scanner;
/**
 *
 * @author FER
 */
public class EjEx4 {
    public static void main(String[] args) {
        int x,n;
        double resultado;
        Scanner teclado = new Scanner (System.in);
        System.out.println("Ingrese el valor de n");
        do {
            n=teclado.nextInt();
            if (n<1){
                System.out.println("El valor de n tiene que ser mayor a 0");
            }
        } while (n<=0);
        System.out.println("Ingrese el valor de x");
        do {
            x=teclado.nextInt();
            if (x<n){
                System.out.println("El valor de x tiene que ser mayor o igual a n");
            }
        } while (x<n);
        resultado= factorial(x)/(factorial(x-n)*factorial(n));
        System.out.println("El resultado de la expresion es; "+resultado);
    }
    public static int factorial(int h){
        int f,i;
        f=1;
        for (i=1; i<=h; i++){
            f=f*i;
        }
        return f;
    }
    
}

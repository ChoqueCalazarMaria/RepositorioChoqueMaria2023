//ejercicios del examen final
package trabajos;
import java.util.Scanner;

/**
 *
 * @author FER
 */
public class EjEx2 {
    public static void main(String[] args) {
        int num1,num2,resultado;
        Scanner teclado = new Scanner (System.in);
        System.out.println("Ingrese el valor de num1");
        num1=teclado.nextInt();
        System.out.println("Ingrese el valor de num2");
        num2=teclado.nextInt();
        resultado=queharas(num1,num2);
        System.out.println("El resultado de la suma es: "+resultado);
    }
    public static int queharas(int a, int b){
        int c;
        c= a+b ;
        return c;
    }
}

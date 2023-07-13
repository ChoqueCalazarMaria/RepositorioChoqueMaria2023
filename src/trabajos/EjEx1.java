//ejercicios del examen final
package trabajos;

/**
 *
 * @author FER
 */
public class EjEx1 {

    public static void main(String[] args){
        //¿Por qué no acepta "main"?
        int sp, ss, st, cp, cs, i, j;
        int[][] a = new int[4][4];
        cp = 5;
        sp = 0;
        cs = 4;
        ss = 0;
        for (i = 1; i <= 4; i++) {
            for (j = 1; j <= 4; j++) {
                a[i][j] = cp;
                cp = cp + 5;
                if (i == j) {
                    sp = sp + a[i][j];
                }
            }
        }
        for (i = 1; i <= 4; i++) {
            ss = ss + a[i][cs];
            cs = cs - 1;
        }
        st = sp + ss;
        System.out.println("La matriz es: ");
        for (i = 1; i <= 4; i++) {
            for (j = 1; j <= 4; j++) {
                System.out.println(a[i][j] + " ");
            }
            System.out.println(" ");
        }
        System.out.println("La suma de la diagonal principal es: "+sp);
        System.out.println("La suma de la diagonal secundaria es: "+ss);
        System.out.println("La suma de ambas diagonales es: "+st);
    }

}

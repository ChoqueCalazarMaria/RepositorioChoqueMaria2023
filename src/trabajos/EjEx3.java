//ejercicios del examen final
package trabajos;

import java.util.Scanner;

/**
 *
 * @author FER
 */
public class EjEx3 {

    public static void main(String[] args) {
        double bol;
        int eleccion, inciso;
        Scanner teclado = new Scanner(System.in);
        do {
            do {
                System.out.println("Ingrese la cantidad de bolivianos que desa convertir.");
                bol = teclado.nextDouble();
            } while (bol <= 0);
            do {
                System.out.println("¿A qué moneda quiere cambiar sus bolivianos? Seleccione 1 opción.");
                System.out.println("1.Dólares");
                System.out.println("2.Peso chileno");
                System.out.println("3.Soles");
                System.out.println("4.Euros");
                do {
                    eleccion = teclado.nextInt();
                    if (eleccion < 1 || eleccion > 4) {
                        System.out.println("Digite un número entre 1 y 4, por favor");
                    }
                } while (!(eleccion <= 4 && eleccion >= 1));
                switch (eleccion) {
                    case 1 ->
                        System.out.println("Sus " + bol + " bolivianos equivalen a " + CambioMoneda(bol, 0.14) + " dólares.");
                    case 2 ->
                        System.out.println("Sus " + bol + " bolivianos equivalen a " + CambioMoneda(bol, 117.88) + " pesos chilenos.");
                    case 3 ->
                        System.out.println("Sus " + bol + " bolivianos equivalen a " + CambioMoneda(bol, 0.52) + " soles.");
                    case 4 ->
                        System.out.println("Sus " + bol + " bolivianos equivalen a " + CambioMoneda(bol, 0.13) + " euros.");
                }
                System.out.println("¿Quiere cambiar sus bolivianos a otra moneda?");
                System.out.println("1.Si");
                System.out.println("2.No");
                do {
                    inciso = teclado.nextInt();
                    EleccionSiNo(inciso);
                } while (inciso != 2 && inciso != 1);
            } while (inciso != 2);
            System.out.println("¿Quiere cambiar otra cantidad de bolivianos?");
            System.out.println("1.Si");
            System.out.println("2.No");
            do {
                inciso = teclado.nextInt();
                EleccionSiNo(inciso);
            } while (inciso != 2 && inciso != 1);
        } while (inciso != 2);
        System.out.println("Gracias por su preferencia, vuelva pronto.");
    }

    public static double CambioMoneda(double m, double e) {
        double c;
        c = m * e;
        return c;
    }

    public static void EleccionSiNo(int x) {
        if (x != 1 && x != 2) {
            System.out.println("Por favor,seleccione una de las opciones (Escriba 1 0 2).");
        }
    }
}

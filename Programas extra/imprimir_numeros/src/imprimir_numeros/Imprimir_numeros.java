package imprimir_numeros;

import java.util.Scanner;
import java.util.Locale;

public class Imprimir_numeros {

    public static void main(String[] args) {

        Scanner entrada = new Scanner(System.in);
        entrada.useLocale(Locale.US);

        int minimo;
        int maximo;

        System.out.println("Numero minimo: ");
        minimo = entrada.nextInt();

        System.out.println("Numero maximo: ");
        maximo = entrada.nextInt();

        imprimir(minimo, maximo);

    }

    public static void imprimir(int minimo, int maximo) {

        for (int i = minimo; i <= maximo; i++) {

            if (es_par(i)) {

                System.out.println(i);

            }

        }

    }

    public static boolean es_par(int i) {

        boolean par = false;

        if ((i % 2) == 0) {

            par = true;

        }

        return par;
    }

}

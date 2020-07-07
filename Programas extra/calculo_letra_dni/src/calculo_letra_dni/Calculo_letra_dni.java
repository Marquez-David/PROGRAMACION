package calculo_letra_dni;

import java.util.Locale;
import java.util.Scanner;

public class Calculo_letra_dni {

    public static void main(String[] args) {

        char[] dni;
        int numero_dni;
        char[] letras = {'T', 'R', 'W', 'A', 'G', 'M', 'Y', 'F', 'P', 'D',
            'X', 'B', 'N', 'J', 'Z', 'S', 'Q', 'V', 'H', 'L', 'C', 'K', 'E'};

        Scanner entrada = new Scanner(System.in);
        entrada.useLocale(Locale.US);

        System.out.println("Introduce el numero de tu dni(8 digitos47319570"
                + "): ");
        numero_dni = entrada.nextInt();

        calculo_letra_dni(numero_dni, letras);

    }

    public static void calculo_letra_dni(int numero_dni, char[] letras) {

        char letra;
        int indice = numero_dni % 23;
        letra = letras[indice];

        System.out.println(numero_dni + "-" + letra);

    }

}

package num_mayor;

import java.util.Locale;
import java.util.Scanner;

public class Num_mayor {

    public static void main(String[] args) {

        Scanner entrada = new Scanner(System.in);
        entrada.useLocale(Locale.US);

        int num1;
        int num2;
        int num3;

        System.out.println("Introduc el primer numero: ");
        num1 = entrada.nextInt();

        System.out.println("Itntroduce el segundo numero: ");
        num2 = entrada.nextInt();

        System.out.println("Introduce el tercrnumero: ");
        num3 = entrada.nextInt();

        mayor(num1, num2, num3);

    }

    public static int mayor(int num1, int num2, int num3) {

        int mayor = num1;

        if (num2 > num1 && num2 > num3) {

            mayor = num2;

        } else if (num3 > num1 && num3 > num2) {

            mayor = num3;

        }
        
        System.out.println(mayor);
        return mayor;

    }

}

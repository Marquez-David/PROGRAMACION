package calculadora;

import java.util.Locale;
import java.util.Scanner;

public class Calculadora {

    public static void main(String[] args) {

        Scanner entrada = new Scanner(System.in);
        entrada.useLocale(Locale.US);

        double num1;
        double num2;
        String operacion;

        System.out.println("Introduce la opracion a realizar(+,-,*,/): ");
        operacion = entrada.nextLine();

        System.out.println("Introduce el primer numero: ");
        num1 = entrada.nextDouble();

        System.out.println("Introduce el segundo numero: ");
        num2 = entrada.nextDouble();

        if ("+".equals(operacion)) {

            suma(num1, num2);

        } else if ("-".equals(operacion)) {

            resta(num1, num2);

        } else if ("/".equals(operacion)) {

            division(num1, num2);

        } else if ("*".equals(operacion)) {

            multiplicacion(num1, num2);

        }

    }

    public static void suma(double num1, double num2) {

        System.out.println("La suma es: " + (num1 + num2));

    }

    public static void resta(double num1, double num2) {

        System.out.println("La resta es: " + (num1 - num2));

    }

    public static void division(double num1, double num2) {

        System.out.println("La division es: " + num1 / num2);

    }

    public static void multiplicacion(double num1, double num2) {

        System.out.println("La multiplicacion es : " + num1 * num2);

    }

}

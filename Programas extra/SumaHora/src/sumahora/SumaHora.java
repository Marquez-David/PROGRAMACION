package sumahora;

import java.util.Scanner;
import java.util.Locale;

public class SumaHora {

    public static void main(String[] args) {

        Scanner entrada = new Scanner(System.in);
        entrada.useLocale(Locale.US);

        int hora, minuto, segundo;
        boolean hora_valida = true;

        do {

            System.out.println("Introduce la hora: ");
            hora = entrada.nextInt();

            System.out.println("Introduce los minutos: ");
            minuto = entrada.nextInt();

            System.out.println("Introduce los segundos: ");
            segundo = entrada.nextInt();

            if (hora < 0 || minuto < 0 || segundo < 0) {

                System.out.println("Fecha no valida. ");
                hora_valida = false;

            } else if (hora > 60 || minuto > 60 || segundo > 60) {

                System.out.println("Fecha no valida. ");
                hora_valida = false;

            }
        } while (hora_valida == false);

        segundo++; //Aumentamos un segundo

        if (segundo >= 60) {
            minuto++;
            segundo -= 60;
        }
        if (minuto >= 60) {
            hora++;
            minuto -= 60;
        }

        System.out.println(hora + " : " + minuto + " : "
                + "" + segundo);

    }

}

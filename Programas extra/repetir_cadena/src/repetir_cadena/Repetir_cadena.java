package repetir_cadena;

import java.util.Scanner;

public class Repetir_cadena {

    public static void main(String[] args) {

        Scanner entrada = new Scanner(System.in);

        int num_veces;
        String cadena;

        System.out.println("Introduce la cadena: ");
        cadena = entrada.nextLine();

        System.out.println("Introduce el numero de veces a repertir: ");
        num_veces = entrada.nextInt();

        for (int i = 0; i < num_veces; i++) {

            System.out.println(cadena);

        }

    }

}

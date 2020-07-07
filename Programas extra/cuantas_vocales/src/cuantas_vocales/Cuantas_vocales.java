package cuantas_vocales;

import java.util.Random;

public class Cuantas_vocales {

    public static void main(String[] args) {

        char letras[] = new char[50];
        int numero;

        Random rand = new Random();

        for (int i = 0; i < letras.length; i++) {

            numero = rand.nextInt(23) + 97;

            char c = (char) numero;

            letras[i] = c;

        }

        num_vocales(letras);

    }

    public static void num_vocales(char letras[]) {

        int cont = 0;

        for (int i = 0; i < letras.length; i++) {

            if (letras[i] == 'a' || letras[i] == 'e' || letras[i] == 'i'
                    || letras[i] == 'o' || letras[i] == 'u') {

                cont += 1;

            }
        }

        System.out.println("El numerode voccales es: " + cont);

    }

}

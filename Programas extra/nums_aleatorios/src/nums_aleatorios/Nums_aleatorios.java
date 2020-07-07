package nums_aleatorios;

import java.util.Arrays;
import java.util.Random;

public class Nums_aleatorios {

    public static void main(String[] args) {

        int numeros[] = new int[100];
        //char letras[] = impar_par(numeros);

        Random rand = new Random();

        //Genero numeros aleatorios.
        for (int i = 0; i < numeros.length; i++) {

            numeros[i] = rand.nextInt(501)+1;

        }

        //Ordenamos el array.
        Arrays.sort(numeros);

        //Llamamos al metodo que crea otro array dieciendo si es par o impar.
        char letras[] = impar_par(numeros);

        //Llamamos al metodo que imprime los dos arrays.
        imprimir(numeros, letras);

    }

    public static char[] impar_par(int[] numeros) {

        char letras[] = new char[numeros.length];

        for (int i = 0; i < numeros.length; i++) {

            if (numeros[i] % 2 == 0) {

                letras[i] = 'p';

            } else {

                letras[i] = 'i';

            }

        }

        return letras;

    }

    public static void imprimir(int[] numeros, char[] letras) {

        for (int i = 0; i < numeros.length; i++) {

            System.out.print(numeros[i]);
            System.out.println(letras[i] + "-");

        }

    }

}

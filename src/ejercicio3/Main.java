package ejercicio3;

import java.util.Scanner;

/**
 * @author Jose Daniel Maza - josedmaza@gmail.com
 *
 * @version
 *
 * Clase principal del programa, se crea un array aleatorio y se le da la opcion
 * al usuario de ordenarlo por medio de una funcion de ordenamiento.
 */

public class Main {
    public static void main(String[] args) {
        RandomArray randomArray = new RandomArray();
        randomArray.generateRandomArray();

        int right = 0;
        int left = 0;

        int opcion;
        do {
            System.out.println("Selecciona una opción:");
            System.out.println("1. Mostrar array ordenado por burbuja");
            System.out.println("2. Mostrar array por quick sort");
            System.out.println("3. Salir");

            Scanner sc = new Scanner(System.in);
            opcion = sc.nextInt();

            switch (opcion) {
                case 1:
                    randomArray.bubbleSort();
                    break;

                case 2:
                    randomArray.Quicksort(randomArray.List, right, left);
                    break;

                case 3:
                    System.exit(0);
                    break;
            }
        } while (opcion != 3);
    }
}

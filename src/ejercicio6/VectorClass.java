package ejercicio6;

import java.util.Scanner;
import java.util.Vector;

public class VectorClass {

    Vector<Integer> vector = new Vector<Integer>();
    Integer previous = null;

    public void classVector() {

        try (Scanner sc = new Scanner(System.in)) {
            System.out.println("\nEl programa finalizara cuando se ingresen 2 numeros iguales consecutivos");
            while (true) {

                System.out.print("Ingrese un numero: ");

                int number = sc.nextInt();
                if (previous != null && previous == number){
                    break;
                }
                vector.add(number);
                previous = number;
            }
        }
        System.out.println("Ingreso un numero igual al anterior" + vector);
    }
}

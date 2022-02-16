package ejercicio4;

import java.util.ArrayList;
import java.util.Scanner;

/**
 * @author Jose Daniel Maza - josedmaza21@gmail.com
 *
 * @version 1.0
 *
 * @since 1.0
 *
 * Clase principal del programa, se crea un array donde se guardan los 10 vehiculos para posteriormente
 * ser leidos por el usuario.
 */

public class Main {
    public static void main(String[] args) {

        ArrayList<Vehicle> list = new ArrayList<>();

        while (list.toArray().length <1) {

            Scanner sc = new Scanner(System.in);
            Vehicle vehicle = new Vehicle();

            System.out.println("Ingrese el numero de pasajeros");
            vehicle.setNumPassengers(sc.nextByte());
            System.out.println("Ingrese el numero de ruedas");
            vehicle.setNumWheels(sc.nextByte());
            System.out.println("Hay tripulacion? (true/false)");
            vehicle.setCrew(sc.nextBoolean());
            System.out.println("Ingrese fecha de matricula (dd/mm/yyyy)" );
            vehicle.setEnrollmentDate(sc.next());
            System.out.println("Ingrese el medio en el que se transporta el vehiculo");
            vehicle.setTrack(sc.next());

            list.add(vehicle);
        }

        for (Vehicle v : list) {
            System.out.println(v.toString());
            System.out.println(" ");
        }
    }
}

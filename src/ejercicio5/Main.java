package ejercicio5;

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


        Scanner sc = new Scanner(System.in);
        ArrayList<Vehicle> vehiculos = new ArrayList<Vehicle>();
        byte select = 0;

        while (vehiculos.size() < 10) {

            System.out.println("Selecciona el tipo de vehiculo que quieres crear: " +
                    "\n1. Coche" +
                    "\n2. Camioneta" +
                    "\n3. Moto" +
                    "\n4. Bicicleta" +
                    "\n5. Bote");  // Se crean 10 vehiculos


            select = sc.nextByte();

            switch (select) {
                case 1:
                    /**
                     * Se crea un objeto de tipo Car y se le pide los datos necesarios para crearlo
                     */
                    System.out.println("Creando carro");

                    Car car = new Car();

                    System.out.println("Introduce el numero de pasajeros: ");
                    car.setNumPassengers(sc.nextByte());

                    System.out.println("Seleccione el numero de puertas, 3 o 5");
                    car.setNumOfDoors(sc.nextByte());

                    System.out.println("Seleccione el numero de llantas");
                    car.setNumWheels(sc.nextByte());

                    System.out.println("Seleccione si tiene tripulacion, true or false");
                    car.setCrew(sc.nextBoolean());

                    System.out.println("Seleccione la fecha de matricula / AAAA-MM-DD");
                    car.setEnrollmentDate(sc.next());

                    System.out.println("Seleccione la via");
                    car.setTrack(sc.next());
                    /**
                     * Se agrega el objeto creada a la lista de vehiculos
                     */
                    vehiculos.add(car);
                    break;

                case 2:
                    /**
                     * Se crea un objeto de tipo Truck y se le pide los datos necesarios para crearlo
                     */
                    System.out.println("Creando camion");

                    Truck truck = new Truck();

                    System.out.println("Seleccione el peso de la carga en kilos");
                    truck.setWeight(sc.nextFloat());

                    System.out.println("Seleccione el numero de pasajeros");
                    truck.setNumPassengers(sc.nextByte());

                    System.out.println("Seleccione el numero de llantas");
                    truck.setNumWheels(sc.nextByte());

                    System.out.println("Seleccione si tiene tripulacion, true or false");
                    truck.setCrew(sc.nextBoolean());

                    System.out.println("Seleccione la fecha de matricula / AAAA-MM-DD");
                    truck.setEnrollmentDate(sc.next());

                    System.out.println("Seleccione la via");
                    truck.setTrack(sc.next());
                    /**
                     * Se agrega el objeto creada a la lista de vehiculos
                     */
                    vehiculos.add(truck);
                    break;

                case 3:
                    /**
                     * Se crea un objeto de tipo Motorcycle y se le pide los datos necesarios para crearlo
                     */
                    System.out.println("Creando moto");

                    Motorcycle motorcycle = new Motorcycle();

                    System.out.println("Seleccione la posicion del conductor");
                    motorcycle.setDriverPosition(sc.next());

                    System.out.println("Selecciona el numero de pasajeros");
                    motorcycle.setNumPassengers(sc.nextByte());

                    System.out.println("Seleccione el numero de llantas");
                    motorcycle.setNumWheels(sc.nextByte());

                    System.out.println("Seleccione si tiene tripulacion, true or false");
                    motorcycle.setCrew(sc.nextBoolean());

                    System.out.println("Seleccione la fecha de matricula / AAAA-MM-DD");
                    motorcycle.setEnrollmentDate(sc.next());

                    System.out.println("Seleccione la via");
                    motorcycle.setTrack(sc.next());
                    /**
                     * Se agrega el objeto creada a la lista de vehiculos
                     */
                    vehiculos.add(motorcycle);

                    break;

                case 4:
                    /**
                     * Se crea un objeto de tipo Bike y se le pide los datos necesarios para crearlo
                     */
                    System.out.println("Creando bicicleta");

                    Bike bike = new Bike();

                    System.out.println("Seleccione el tipo de bicicleta");
                    bike.setType(sc.next());

                    System.out.println("Seleccione el numero de pasajeros");
                    bike.setNumPassengers(sc.nextByte());

                    System.out.println("Seleccione el numero de llantas");
                    bike.setNumWheels(sc.nextByte());

                    System.out.println("Seleccione si tiene tripulacion, true or false");
                    bike.setCrew(sc.nextBoolean());

                    System.out.println("Seleccione la via");
                    bike.setTrack(sc.next());
                    /**
                     * Se agrega el objeto creada a la lista de vehiculos
                     */
                    vehiculos.add(bike);
                    break;

                case 5:
                    /**
                     * Se crea un objeto de tipo SpeedBoat y se le pide los datos necesarios para crearlo
                     */
                    System.out.println("Creando barco");

                    SpeedBoat speedBoat = new SpeedBoat();

                    System.out.println("que velocidad alcanza el barco en km/h");
                    speedBoat.setMaxSpeed(sc.nextInt());

                    System.out.println("Seleccione el numero de pasajeros");
                    speedBoat.setNumPassengers(sc.nextByte());

                    System.out.println("Seleccione si tiene tripulacion, true or false");
                    speedBoat.setCrew(sc.nextBoolean());

                    System.out.println("Seleccione la fecha de matricula / AAAA-MM-DD");
                    speedBoat.setEnrollmentDate(sc.next());

                    System.out.println("Seleccione la via");
                    speedBoat.setTrack(sc.next());
                    /**
                     * Se agrega el objeto creada a la lista de vehiculos
                     */
                    vehiculos.add(speedBoat);
                    break;
            }
        }
        /**
         * Se muestran los vehiculos almacenados en la lista
         */
        vehiculos.forEach(vehicle -> System.out.println(vehicle.toString()));
    }
}
package ejercicio5;

/**
 * @author Jose Daniel Maza - josedmaza21@gmail.com
 * @version 1.0
 *
 * Clase que representa un carro y que hereda de la clase Vehiculo
 */

public class Car extends Vehicle {

    /**
     * atributos de la clase
     */

    private byte numOfDoors;

    /**
     * COnstructor por defecto
     */

    public Car() {
        super();
    }
    /**
     * Constructor con parametros
     * @param numPassengers
     * @param numWheels
     * @param crew
     * @param enrollmentDate
     * @param track
     * @param numOfDoors
     */

    public Car(byte numPassengers, byte numWheels, boolean crew, String enrollmentDate, String track, byte numOfDoors) {
        super(numPassengers, numWheels, crew, enrollmentDate, track);
        this.numOfDoors = numOfDoors;
    }

    public byte getNumOfDoors() {
        return numOfDoors;
    }

    public void setNumOfDoors(byte numOfDoors) {
        this.numOfDoors = numOfDoors;
    }

    @Override
    public String toString() {
        return "Car :" +"\nNumero de puertas: " + numOfDoors +  super.toString();

    }

}

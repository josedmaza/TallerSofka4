package ejercicio5;

/**
 * @author Jose Daniel Maza - josedmaza21@gmail.com
 * @version 1.0
 *
 * Clase que representa una bicicleta y que hereda de la clase Vehiculo
 */

public class Truck extends Vehicle {
    private float weight;

    /**
     * Constructor por defecto
     */
    public Truck() {
        super();
    }

    /**
     *  Constructor con parametros
     * @param numPassengers
     * @param numWheels
     * @param crew
     * @param enrollmentDate
     * @param track
     * @param weight
     */
    public Truck(byte numPassengers, byte numWheels, boolean crew, String enrollmentDate, String track, float weight) {
        super(numPassengers, numWheels, crew, enrollmentDate, track);
        this.weight = weight;
    }

    public float getWeight() {
        return weight;
    }

    public void setWeight(float weight) {
        this.weight = weight;
    }

    @Override
    public String toString() {
        return "Truck: \nPeso: " + weight + "Kg" +  super.toString();
    }

}

package ejercicio5;

/**
 * @author Jose Daniel Maza - josedmaza21@gmail.com
 * @version 1.0
 *
 * Clase que representa una moto y que hereda de la clase Vehiculo
 */

public class Motorcycle extends Vehicle {

    /**
     * atributos de la clase
     */
    private String driverPosition;

    /**
     * Constructor por defecto
     */
    public Motorcycle() {
    }
    /**
     * Constructor con parametros
     * @param numPassengers
     * @param numWheels
     * @param crew
     * @param enrollmentDate
     * @param track
     * @param driverPosition
     */
    public Motorcycle(byte numPassengers, byte numWheels, boolean crew, String enrollmentDate, String track, String driverPosition) {
        super(numPassengers, numWheels, crew, enrollmentDate, track);
        this.driverPosition = driverPosition;
    }

    public String getDriverPosition() {
        return driverPosition;
    }

    public void setDriverPosition(String driverPosition) {
        this.driverPosition = driverPosition;
    }

    @Override
    public String toString() {
        return "Moto \nPosicion del conductor: " + driverPosition +
                "\nNumero de pasajeros: " + getNumPassengers() +
                "\nNumero de ruedas: " + getNumWheels() +
                "\nTripulacion: " + isCrew() +
                "\nFecha de matricula: " + getEnrollmentDate() +
                "\nVia: " + getTrack() + "\n";

    }
}

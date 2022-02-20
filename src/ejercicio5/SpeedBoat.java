package ejercicio5;

/**
 * @author Jose Daniel Maza - josedmaza21@gmail.com
 * @version 1.0
 *
 * Clase que representa una bicicleta y que hereda de la clase Vehiculo
 */

public class SpeedBoat extends Vehicle {

    /**
     * Atributos de la clase
     */
    private int maxSpeed;

    /**
     * Constructor con parametros
     * @param numPassengers
     * @param crew
     * @param enrollmentDate
     * @param track
     * @param maxSpeed
     */
    public SpeedBoat(byte numPassengers, boolean crew, String enrollmentDate, String track, int maxSpeed) {
        super(numPassengers, crew, enrollmentDate, track);
        this.maxSpeed = maxSpeed;
    }

    /**
     * Constructor por defecto
     */
    public SpeedBoat() {
        super();
    }

    public int getMaxSpeed() {
        return maxSpeed;
    }

    public void setMaxSpeed(int maxSpeed) {
        this.maxSpeed = maxSpeed;
    }

    @Override
    public String toString() {
        return "SpeedBoat " +
                "\nVelocidad maxima: " + maxSpeed + " km/h" +
                "\nNumero de pasajeros: " + getNumPassengers() +
                "\nFecha de matricula: " + getEnrollmentDate() +
                "\nTripulacion: " + isCrew() +
                "\nVia : " + getTrack() + "\n";

    }
}

package ejercicio4;

/**
 * @author Jose Daniel Maza - josedmaza21@gmail.com
 *
 * @version 1.0
 *
 * Clase vehiculo
 */

public class Vehicle {

    private byte numPassengers;
    private byte numWheels;
    private boolean crew;
    private String enrollmentDate;
    private String track;

    /**
     * Constructor por defecto
     */

    public Vehicle() {
    }

    /**
     * Constructor con parametros
     * @param numPassengers
     * @param numWheels
     * @param crew
     * @param enrollmentDate
     * @param track
     *
     */
    public Vehicle (byte numPassengers, byte numWheels, boolean crew, String enrollmentDate, String track) {
        this.numPassengers = numPassengers;
        this.numWheels = numWheels;
        this.crew = crew;
        this.enrollmentDate = enrollmentDate;
        this.track = track;
    }

    public byte getNumPassengers() {
        return numPassengers;
    }

    public void setNumPassengers(byte numPassengers) {
        this.numPassengers = numPassengers;
    }

    public byte getNumWheels() {
        return numWheels;
    }

    public void setNumWheels(byte numWheels) {
        this.numWheels = numWheels;
    }

    public boolean isCrew() {
        return crew;
    }

    public void setCrew(boolean crew) {
        this.crew = crew;
    }

    public String getEnrollmentDate() {
        return enrollmentDate;
    }

    public void setEnrollmentDate(String enrollmentDate) {
        this.enrollmentDate = enrollmentDate;
    }

    public String getTrack() {
        return track;
    }

    public void setTrack(String track) {
        this.track = track;
    }

    public String toString() {
        return "Vehicle: " + "\nNumero de pasajeros: " + numPassengers +
                "\nNumero de llantas: " + numWheels +
                "\nTripulacion: " + crew +
                "\nFecha de matricula: " + enrollmentDate +
                "\nVia: " + track;
    }
}

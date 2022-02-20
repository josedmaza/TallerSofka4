package ejercicio5;

/**
 * @author Jose Daniel Maza - josedmaza21@gmail.com
 * @version 1.0
 *
 * Clase que representa una bicicleta y que hereda de la clase Vehiculo
 */

public class Bike extends  Vehicle{

    /**
     * Atributos de la clase
     */

    private String type;

    /**
     * Constructor por defecto
     */
    public Bike() {
        super();
    }

    /**
     * Constructor con parametros
     * @param numPassengers
     * @param numWheels
     * @param crew
     * @param enrollmentDate
     * @param track
     * @param type
     */

    public Bike (byte numPassengers, byte numWheels, boolean crew, String enrollmentDate, String track, String type){
        super(numPassengers, numWheels, crew, enrollmentDate, track);
        this.type = type;
    }

    public String getType(){
        return type;
    }

    public void setType(String tipo){
        this.type = tipo;
    }

    public String toString(){
        return "Bicicleta" +
                "\nTipo: " + type +
                "\nNumero de pasajeros: " + getNumPassengers() +
                "\nNumero de ruedas: " + getNumWheels() +
                "\nTripulacion: " + getType() +
                "\nViajes: " + getTrack() + "\n";
    }
}
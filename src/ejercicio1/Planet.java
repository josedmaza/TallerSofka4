package ejercicio1;

/**
 * @author Jose Daniel Maza
 *
 * @version 1.0
 *
 * Clase Planeta que hereda de la clase CelestialBody e implementa la interfaz Ibetween2Planets
 */

public class Planet extends CelestialBody implements Ibetween2Planets {

    /**
     * Constructor de la clase Planeta
     * @param id identificador del planeta
     * @param name Nombre del planeta
     * @param mass Masa del planeta
     * @param density Densidad del planeta
     * @param diameter Diametro del planeta
     * @param distanceToSun Distancia del planeta al sol
     *
     */
    public Planet (int id, String name, double mass, double density, double diameter, double distanceToSun) {
        super(id, name, mass, density, diameter, distanceToSun);
    }


    /**
     * Método que calcula la distancia entre dos planetas
     * @param distance2bodies
     * @param mass1
     * @param mass2
     */
    @Override
    public void GravitationalAttraction(double distance2bodies, double mass1, double mass2) {
        final double gravitationalConstant = 6.67408 * Math.pow(10, -11);
        double force = (gravitationalConstant * mass1 * mass2) / Math.pow(distance2bodies, 2);

        System.out.println("The gravitational force between the two bodies is: " + force);
    }
}


package ejercicio1;

/**
 * Se crea la clase abstracta Planet
 *
 * @author Jose Daniel Maza - josedmaza2@gmail.com
 *
 * @version 1.0
 */

public abstract class CelestialBody {

    private final int id;
    private String name;
    private double mass;
    private double density;
    private double diameter;
    private double distanceToSun;


    /**
     * Atributos de la clase Planet
     * @param id identificador del planeta
     * @param name Nombre del planeta
     * @param mass Masa del planeta
     * @param density Densidad del planeta
     * @param diameter Diametro del planeta
     * @param distanceToSun Distancia al sol del planeta
     */

    /**
     * Constructor por defecto de la clase Planet
     * @param id
     */


    /**
     * Constructor de la clase CelestialBody
     */
    public CelestialBody(int id, String name, double mass, double density, double diameter, double distanceToSun) {
        this.id = id;
        this.name = name;
        this.mass = mass;
        this.density = density;
        this.diameter = diameter;
        this.distanceToSun = distanceToSun;
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getMass() {
        return mass;
    }

    public void setMass(double mass) {
        this.mass = mass;
    }

    public double getDensity() {
        return density;
    }

    public void setDensity(double density) {
        this.density = density;
    }

    public double getDiameter() {
        return diameter;
    }

    public void setDiameter(double diameter) {
        this.diameter = diameter;
    }

    public double getDistanceToSun() {
        return distanceToSun;
    }

    public void setDistanceToSun(double distanceToSun) {
        this.distanceToSun = distanceToSun;
    }


    @Override
    public String toString() {
        return "CelestialBody " +
                "\nid:" + id + "" +
                "\nName: " + name +
                "\nmass: " + mass +
                "\ndensity: " + density +
                "\ndiameter: " + diameter +
                "\ndistanceToSun: " + distanceToSun +
                "\n";
    }
}

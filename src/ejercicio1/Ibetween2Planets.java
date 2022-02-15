package ejercicio1;

/**
 * Se crea la interfaz Ibetween2Planets para poder implementarla en la clase
 *
 * @author Jose Daniel Maza
 *
 * @version 1.0
 */
public interface Ibetween2Planets {

    /**
     * @return devuelve la atraccion gravitacional de 2 cuerpos
     * @param distance2bodies
     * @param mass1
     * @param mass2
     */

    public void GravitationalAttraction(double distance2bodies, double mass1, double mass2);
}

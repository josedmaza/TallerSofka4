package ejercicio1;

/**
 * @author Jose Daniel Maza
 *
 * @version 1.0
 * Se instancia 2 objetos de la clase Planet y se efectua el metodo para calcular la distancia gravitacional de 2 cuerpos
 */
public class Main {
    public static void main(String[] args) {

        Planet earth = new Planet(1, "Earth", 5.972e24, 5.15, 12.742, 1.5e11);
        Planet Mars = new Planet(2, "Mars", 6.39e23, 3.39, 6.39, 2.1e11);

        System.out.println("Earth: " + earth.toString());
        System.out.println("Mars: " + Mars.toString());

        Mars.GravitationalAttraction(54600000,  earth.getMass(), Mars.getMass());
    }
}

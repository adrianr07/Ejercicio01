/**
 * @author: Adrian Avellan
 * @version: 1.0
 *
 *
 */

package adrian.avellan.bl.entidades;

public class Empleado {

    private String nombre;
    private String cedula;


    /**
     *
     * @return nombre del empleado que va a usar la computadora
     */
    public String getNombre() {
        return nombre;
    }

    /**
     *
     * @param nombre registro del nombre del empleado
     */
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    /**
     *
     * @return cedula del empleado que va a usar la computadora
     */
    public String getCedula() {
        return cedula;
    }

    /**
     *
     * @param cedula cedula del empleado
     */
    public void setCedula(String cedula) {
        this.cedula = cedula;
    }

    /**
     * Constructor Vacio
     */

    public Empleado() {
    }

    /**
     * Constructor con parametros necesarios para registrar un empleado
     * @param nombre
     * @param cedula
     */

    public Empleado(String nombre, String cedula) {
        this.nombre = nombre;
        this.cedula = cedula;
    }

    @Override
    public String toString() {
        return "Empleado{" +
                "nombre='" + nombre + '\'' +
                ", cedula='" + cedula + '\'' +
                '}';
    }

}

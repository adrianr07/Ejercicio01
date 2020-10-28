/**
 * @author: Adrian Avellan
 * @version: 1.0
 *
 *
 */

package adrian.avellan.bl.entidades;

public class Computadora {


    private String serie;
    private String marca;
    private Empleado nuevoEmpleado;

    /**
     *
     * @return numero de serie de la computadora
     */
    public String getSerie() {
        return serie;
    }

    /**
     *
     * @param serie registro del numero de serie
     */

    public void setSerie(String serie) {
        this.serie = serie;
    }

    /**
     *
     * @return marca de la computadora
     */

    public String getMarca() {
        return marca;
    }

    /**
     *
     * @param marca registro de la marca de la computadora
     */

    public void setMarca(String marca) {
        this.marca = marca;
    }

    /**
     * Constructor Vacio a
     * @param nuevaComputadora
     */

    public Computadora(Computadora nuevaComputadora) {
    }

    /**
     * COnstructor con los parametros necesarios para registrar una computadora
     * @param serie
     * @param marca
     * @param nuevoEmpleado
     */

    public Computadora(String serie, String marca, Empleado nuevoEmpleado) {
        this.serie = serie;
        this.marca = marca;
        this.nuevoEmpleado = nuevoEmpleado;

    }

    @Override
    public String toString() {
        return "Computadora{" +
                "serie='" + serie + '\'' +
                ", marca='" + marca + '\'' +
                ", Empleado= " + nuevoEmpleado +
                '}';
    }

    public Empleado getNuevoEmpleado() {
        return nuevoEmpleado;
    }

    public void setNuevoEmpleado(Empleado nuevoEmpleado) {
        this.nuevoEmpleado = nuevoEmpleado;
    }
}

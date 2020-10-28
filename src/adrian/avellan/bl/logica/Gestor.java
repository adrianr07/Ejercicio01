package adrian.avellan.bl.logica;

import adrian.avellan.bl.entidades.Computadora;
import adrian.avellan.bl.entidades.Empleado;

import java.util.ArrayList;

public class Gestor {

    private ArrayList<Computadora> registros = new ArrayList<>();

    public void registrarComputadora(String serie,String marca,Empleado nuevoEmpleado){
        Computadora nueva = new Computadora(serie, marca, nuevoEmpleado);
        registros.add(nueva);
    }


    public ArrayList<Computadora> listarRegistros() {
        return this.registros;
    }


}

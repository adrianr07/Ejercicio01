package adrian.avellan.controlador;

import adrian.avellan.bl.entidades.Computadora;
import adrian.avellan.bl.entidades.Empleado;
import adrian.avellan.bl.logica.Gestor;
import adrian.avellan.ui.UI;

import java.io.PrintStream;
import java.util.ArrayList;
import java.util.Scanner;

public class Controlador {

    private static Scanner input = new Scanner(System.in);
    private PrintStream output = new PrintStream(System.out);
    private ArrayList<Computadora> registros = new ArrayList<>();

    private UI interfaz = new UI();
    private Gestor gestor = new Gestor();
    //private ArrayList<Computadora> registros = new ArrayList<>();

    public void ejecutarPrograma() {
        int opcion = 0;
        do {
            interfaz.mostrarMenu();
            opcion = interfaz.leerOpcion();
            procesarOpcion(opcion);
        } while (opcion != 3);
    }

    private void procesarOpcion(int opcion) {
        switch (opcion) {
            case 1:
                registro();
                break;
            case 2:
                listarRegistros();
                break;
            default:
                interfaz.imprimirMensaje("Opcion desconocida");
        }
    }

    public void registro(){

        interfaz.imprimirMensaje("Ingrese el nombre del Empleado");
        String nombre = interfaz.leerTexto();
        interfaz.imprimirMensaje("Ingrese el numero de Cedula");
        String cedula = interfaz.leerTexto();

        Empleado nuevoEmpleado = new Empleado(nombre,cedula);

        interfaz.imprimirMensaje("Registro de Empleado Creado con exito");

        interfaz.imprimirMensaje("Ingrese el numero de serie de la computadora asignada a este Empleado");
        String serie = interfaz.leerTexto();
        interfaz.imprimirMensaje("Ingrese la marca de la computadora asignada a este Empleado");
        String marca = interfaz.leerTexto();

        gestor.registrarComputadora(serie, marca, nuevoEmpleado);

    }

    public void listarRegistros(){
        ArrayList<Computadora> lista = gestor.listarRegistros();
        interfaz.imprimirMensaje("Lista de Registros");
        for (int i = 0; i < lista.size(); i++) {
            interfaz.imprimirMensaje(lista.get(i).toString());
        }
    }


}

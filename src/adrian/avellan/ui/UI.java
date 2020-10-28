package adrian.avellan.ui;

import java.io.PrintStream;
import java.util.Scanner;

public class UI {

    private PrintStream output = new PrintStream(System.out);
    private Scanner input = new Scanner(System.in);

    public void mostrarMenu(){
        output.println("EJEMPLO ASOCIACION");
        output.println("1. Registrar Empleado y Computadora");
        output.println("2. Listar Registros");
        output.println("3. Salir");
    }

    public int leerOpcion(){
        output.println("Su opcion es: ");
        return input.nextInt();
    }

    public void imprimirMensaje(String mensaje){
        output.println(mensaje);
    }

    public String leerTexto(){
        return input.next();
    }

}

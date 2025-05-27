package taller5;

import java.util.ArrayList;
import java.util.Scanner;

public class Problema5_GYMejecutor {
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        ArrayList<Problema5_ClienteBase> listaClientes = new ArrayList<>();
        String identificador = "", rutina = "";
        double duracion = 0;
        boolean completado;
        int numeroClientes = 0;

        Problema5_ClienteBase clienteTemp = new Problema5_ClienteBase();
        Problema5_GYMBase gimnasio = new Problema5_GYMBase("Inca");

        System.out.println("Ingrese la cantidad de clientes: ");
        numeroClientes = leer.nextInt();
        leer.nextLine();

        for (int i = 0; i < numeroClientes; i++) {
            System.out.println("\n------------- Cliente " + (i + 1) + " -------------");
            System.out.print("Nombre del cliente: ");
            identificador = leer.nextLine();
            System.out.print("Tipo de rutina: ");
            rutina = leer.nextLine();
            System.out.print("Duración de la rutina (en minutos): ");
            duracion = leer.nextDouble();
            System.out.print("¿Completó la rutina? (true/false): ");
            completado = leer.nextBoolean();
            leer.nextLine();

            clienteTemp.registrarCliente(listaClientes, identificador, rutina, duracion, completado);
        }

        gimnasio.calcularResumen(listaClientes);
        System.out.println(gimnasio.toString());
    }
}

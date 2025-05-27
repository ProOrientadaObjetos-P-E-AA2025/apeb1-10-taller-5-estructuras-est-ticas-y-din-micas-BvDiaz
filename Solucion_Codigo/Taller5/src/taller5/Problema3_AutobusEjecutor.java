package taller5;

import java.util.ArrayList;
import java.util.Scanner;

public class Problema3_AutobusEjecutor {
    
    public static void main(String[] args) {
        
        Scanner leer = new Scanner(System.in);
        ArrayList<Problema3_EstudianteBase> estudiantes = new ArrayList<>();

        System.out.print("Ingrese el número de estudiantes: ");
        int total = Integer.parseInt(leer.nextLine());

        for (int i = 0; i < total; i++) {
            System.out.println("\nEstudiante #" + (i + 1));
            System.out.print("Nombre: ");
            String nombre = leer.nextLine();
            System.out.print("Grado: ");
            String grado = leer.nextLine();
            System.out.print("Ruta: ");
            String ruta = leer.nextLine();
            System.out.print("¿Tiene permiso vigente? (true/false): ");
            boolean permiso = Boolean.parseBoolean(leer.nextLine());

            estudiantes.add(new Problema3_EstudianteBase(nombre, grado, ruta, permiso));
        }

        Problema3_AutobusBase bus = new Problema3_AutobusBase("Ruta 1", true);
        bus.procesarEstudiantes(estudiantes);

        System.out.println(bus.generarResumen());
        System.out.println(bus);
    }
}

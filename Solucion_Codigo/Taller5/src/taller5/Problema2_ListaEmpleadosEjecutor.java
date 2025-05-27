package taller5;

import java.util.ArrayList;
import java.util.Scanner;

public class Problema2_ListaEmpleadosEjecutor {
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        ArrayList<Problema2_EmpleadoBase> empleados = new ArrayList<>();
        int opcion;

        do {
            System.out.println("MENU");
            System.out.println("[1] Agregar un empleado: ");                    
            System.out.println("[2] Visualizar la información de los empleados: ");    
            System.out.println("[3] Solicitar un aumento de salario: ");
            System.out.println("[4] Salir");    
            System.out.print("Seleccione una opción: ");
            opcion = leer.nextInt();

            switch (opcion) {
                case 1 -> {
                    leer.nextLine(); 
                    System.out.print("Nombre del empleado: ");
                    String nombre = leer.nextLine();
                    System.out.print("Edad del empleado: ");
                    int edad = leer.nextInt();
                    System.out.print("Salario del empleado: ");
                    double salario = leer.nextDouble();
                    Problema2_EmpleadoBase.agregarEmpleado(empleados, nombre, edad, salario);
                }
                case 2 -> {
                    System.out.println("\nLISTADO DE EMPLEADOS");
                    System.out.println(Problema2_EmpleadoBase.mostrarInformacion(empleados));
                }
                case 3 -> {
                    System.out.print("Ingrese el porcentaje de aumento: ");
                    double aumento = leer.nextDouble();
                    Problema2_EmpleadoBase.aplicarAumento(empleados, aumento);
                    System.out.println("Aumento aplicado a todos los empleados.");
                }
                case 4 -> System.out.println("Saliendo del sistema...");
                default -> System.out.println("Opción no válida. Intente nuevamente.");
            }

        } while (opcion != 4);
    }
}

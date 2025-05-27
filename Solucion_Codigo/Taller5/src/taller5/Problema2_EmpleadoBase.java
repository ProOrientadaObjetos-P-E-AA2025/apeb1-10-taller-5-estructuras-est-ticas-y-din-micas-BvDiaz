package taller5;
import java.util.ArrayList;

public class Problema2_EmpleadoBase {
    private String nombres;
    private int edad;
    private double salario;

    public Problema2_EmpleadoBase() {}

    public Problema2_EmpleadoBase(String nombres, int edad, double salario) {
        this.nombres = nombres;
        this.edad = edad;
        this.salario = salario;
    }

    public static void agregarEmpleado(ArrayList<Problema2_EmpleadoBase> lista, String nombre, int edad, double salario) {
        lista.add(new Problema2_EmpleadoBase(nombre, edad, salario));
    }

    public static String mostrarInformacion(ArrayList<Problema2_EmpleadoBase> lista) {
        StringBuilder sb = new StringBuilder();
        int i = 1;
        for (Problema2_EmpleadoBase emp : lista) {
            sb.append("Empleado Nº ").append(i++)
              .append("\nNombre: ").append(emp.nombres)
              .append("\nEdad: ").append(emp.edad)
              .append("\nSalario: $").append(emp.salario)
              .append("\n-----------------------------\n");
        }
        return sb.toString();
    }

    public static void aplicarAumento(ArrayList<Problema2_EmpleadoBase> lista, double porcentaje) {
        double factor = (porcentaje + 100.0) / 100.0;
        for (Problema2_EmpleadoBase emp : lista) {
            emp.salario *= factor;
        }
    }
}

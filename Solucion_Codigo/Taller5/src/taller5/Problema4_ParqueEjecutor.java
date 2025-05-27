package taller5;

import java.util.ArrayList;
import java.util.Scanner;

public class Problema4_ParqueEjecutor {
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);

        ArrayList<Problema4_VisitanteBase> visitantesGrupo = new ArrayList<>();
        Problema4_VisitanteBase visitanteTemporal = new Problema4_VisitanteBase();

        Problema4_ParqueBase parque = new Problema4_ParqueBase("Juego 1", 15, 1.60);

        System.out.print("Ingrese cuántos visitantes ingresarán: ");
        int cantidadVisitantes = leer.nextInt();
        leer.nextLine();

        for (int i = 0; i < cantidadVisitantes; i++) {
            System.out.println("---------------- Visitante " + (i + 1) + " ----------------");
            System.out.print("Ingrese la atracción a la que quiere ingresar el visitante: ");
            String atraccionPref = leer.nextLine();
            System.out.print("Ingrese la estatura del visitante: ");
            double tallaVisitante = leer.nextDouble();
            System.out.print("Ingrese la edad del visitante: ");
            int edadVisitante = leer.nextInt();
            leer.nextLine();

            visitanteTemporal.agregarVisitante(visitantesGrupo, atraccionPref, edadVisitante, tallaVisitante);
        }

        parque.verificarAcceso(visitantesGrupo);

        System.out.println("\nResumen del día:\n" + parque.toString());
    }
}

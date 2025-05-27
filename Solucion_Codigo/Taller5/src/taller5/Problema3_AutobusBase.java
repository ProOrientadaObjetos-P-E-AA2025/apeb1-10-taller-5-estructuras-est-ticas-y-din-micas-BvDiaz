package taller5;

import java.util.ArrayList;

public class Problema3_AutobusBase {

    private String ruta;
    private boolean autorizado;
    private int estudiantesAdmitidos;
    private int estudiantesRechazados;

    public Problema3_AutobusBase(String ruta, boolean autorizado) {
        this.ruta = ruta;
        this.autorizado = autorizado;
    }

    public void procesarEstudiantes(ArrayList<Problema3_EstudianteBase> estudiantes) {
        for (Problema3_EstudianteBase est : estudiantes) {
            if (autorizado && est.tienePermiso() && est.getRuta().equalsIgnoreCase(this.ruta)) {
                estudiantesAdmitidos++;
            } else {
                estudiantesRechazados++;
            }
        }
    }

    public String generarResumen() {
        return "--------------RESUMEN--------------\n"
                + "Estudiantes aceptados: " + estudiantesAdmitidos + "\n"
                + "Estudiantes rechazados: " + estudiantesRechazados + "\n";
    }

    @Override
    public String toString() {
        return "\nAutobus{"
                + "\nRuta: " + ruta
                + "\nAutorización: " + autorizado
                + "\nEstudiantes admitidos: " + estudiantesAdmitidos
                + "\nEstudiantes rechazados: " + estudiantesRechazados
                + "\n}\n";
    }
}

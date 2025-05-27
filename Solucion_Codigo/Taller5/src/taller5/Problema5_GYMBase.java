package taller5;

import java.util.ArrayList;

class Problema5_GYMBase {
    private String nombreCentro;
    private int rutinasFinalizadas;
    private int rutinasPendientes;
    private double minutosTotales;

    public Problema5_GYMBase() {
    }

    public Problema5_GYMBase(String nombreCentro) {
        this.nombreCentro = nombreCentro;
    }

    public void calcularResumen(ArrayList<Problema5_ClienteBase> clientes) {
        for (Problema5_ClienteBase c : clientes) {
            if (c.isCompletado()) {
                rutinasFinalizadas++;
            } else {
                rutinasPendientes++;
            }
            minutosTotales += c.getDuracion();
        }
    }

    @Override
    public String toString() {
        return "\nGimnasio{" +
                "\nNombre del centro: " + nombreCentro +
                "\nRutinas completadas: " + rutinasFinalizadas +
                "\nRutinas incompletas: " + rutinasPendientes +
                "\nMinutos totales acumulados: " + minutosTotales +
                "\n}";
    }
}

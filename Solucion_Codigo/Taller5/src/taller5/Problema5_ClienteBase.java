package taller5;

import java.util.ArrayList;

class Problema5_ClienteBase {
    private String identificador;
    private String rutina;
    private double duracion;
    private boolean completado;

    public Problema5_ClienteBase() {
    }

    public Problema5_ClienteBase(String identificador, String rutina, double duracion, boolean completado) {
        this.identificador = identificador;
        this.rutina = rutina;
        this.duracion = duracion;
        this.completado = completado;
    }

    public void registrarCliente(ArrayList<Problema5_ClienteBase> clientes, String identificador, String rutina, double duracion, boolean completado) {
        clientes.add(new Problema5_ClienteBase(identificador, rutina, duracion, completado));
    }

    public boolean isCompletado() {
        return completado;
    }

    public double getDuracion() {
        return duracion;
    }
}

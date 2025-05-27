package taller5;

import java.util.ArrayList;

public class Problema4_ParqueBase {
    private int cantidadCumplen;
    private String nombreAtraccion;
    private int edadMinima;
    private double alturaMinima;

    public Problema4_ParqueBase() {
    }

    public Problema4_ParqueBase(String nombreAtraccion, int edadMinima, double alturaMinima) {
        this.nombreAtraccion = nombreAtraccion;
        this.edadMinima = edadMinima;
        this.alturaMinima = alturaMinima;
    }

    public void verificarAcceso(ArrayList<Problema4_VisitanteBase> visitantes) {
        for (Problema4_VisitanteBase visitante : visitantes) {
            if (visitante.getAnios() >= edadMinima && visitante.getTalla() >= alturaMinima) {
                cantidadCumplen++;
                System.out.println("El visitante puede acceder a todos los juegos");
            } else if (visitante.getAnios() >= edadMinima || visitante.getTalla() >= alturaMinima) {
                if (visitante.getAtraccionFavorita().equalsIgnoreCase(nombreAtraccion)) {
                    System.out.println("El visitante puede subir a su atracción preferida");
                }
                System.out.println("El visitante puede acceder a la siguiente atracción: " + nombreAtraccion);
            }
        }
    }

    @Override
    public String toString() {
        return "\nParque{" +
                "\nCantidad que cumplen requisitos: " + cantidadCumplen +
                "\nNombre atracción: " + nombreAtraccion +
                "\nEdad mínima requerida: " + edadMinima +
                "\nAltura mínima requerida: " + alturaMinima +
                "\n}";
    }
}

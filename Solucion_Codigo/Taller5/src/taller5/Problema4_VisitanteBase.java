package taller5;

import java.util.ArrayList;

public class Problema4_VisitanteBase {
    private int anios;
    private double talla;
    private String atraccionFavorita;

    public Problema4_VisitanteBase() {
    }

    public Problema4_VisitanteBase(String atraccionFavorita, int anios, double talla) {
        this.anios = anios;
        this.talla = talla;
        this.atraccionFavorita = atraccionFavorita;
    }

    public void agregarVisitante(ArrayList<Problema4_VisitanteBase> grupo, String atraccionFavorita, int anios, double talla) {
        grupo.add(new Problema4_VisitanteBase(atraccionFavorita, anios, talla));
    }

    public int getAnios() {
        return anios;
    }

    public double getTalla() {
        return talla;
    }

    public String getAtraccionFavorita() {
        return atraccionFavorita;
    }
}

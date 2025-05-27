package taller5;

public class Problema3_EstudianteBase {

    private String nombre;
    private String grado;
    private String ruta;
    private boolean permisoVigente;

    public Problema3_EstudianteBase(String nombre, String grado, String ruta, boolean permisoVigente) {
        this.nombre = nombre;
        this.grado = grado;
        this.ruta = ruta;
        this.permisoVigente = permisoVigente;
    }

    public String getRuta() {
        return ruta;
    }

    public boolean tienePermiso() {
        return permisoVigente;
    }

    @Override
    public String toString() {
        return "\nEstudiante{"
                + "Nombre='" + nombre + '\''
                + ", Grado='" + grado + '\''
                + ", Ruta='" + ruta + '\''
                + ", Permiso Vigente=" + permisoVigente
                + '}';
    }
}

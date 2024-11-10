package proyectointegrador.modelos;

/**
 * Representa un tipo de módulo para un anuncio
 */
public class TipoModulo {
    String nombre;

    /**
     * Constructor de la clase TipoModulo.
     * @param nombre El nombre del tipo de módulo
     */
    public TipoModulo(String nombre) {
        this.nombre = nombre;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
}

package proyectointegrador.modelos;

/**
 * Representa la frecuencia de publicación de un anuncio
 */
public class FrecuenciaPublicacion {

    String nombre;

    /**
     * Constructor de la clase FrecuenciaPublicacion.
     * @param nombre El nombre de la frecuencia de publicación.
     */
    public FrecuenciaPublicacion(String nombre) {
        this.nombre = nombre;
    }


    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
}

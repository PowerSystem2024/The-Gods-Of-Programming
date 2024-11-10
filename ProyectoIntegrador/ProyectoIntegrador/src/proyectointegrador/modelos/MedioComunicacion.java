package proyectointegrador.modelos;

/**
 * Representa un medio de comunicación donde se pueden publicar anuncios
 */
public class MedioComunicacion {
    String nombre;

    /**
     * Constructor de la clase MedioComunicacion.
     * @param nombre El nombre del medio de comunicación
     */
    public MedioComunicacion(String nombre) {
        this.nombre = nombre;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
}
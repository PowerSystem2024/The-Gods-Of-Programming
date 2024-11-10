package proyectointegrador.modelos;

/**
 * Representa un anuncio publicitario
*/
public class Anuncio {
    
    /**
     * El medio de comunicación donde se publica el anuncio, el tipo de módulo, la frecuencia de publicación, el precio y el nombre de la empresa que publica el anuncio
     */
    MedioComunicacion medio;
    TipoModulo modulo;
    FrecuenciaPublicacion frecuencia;
    double precio;
    String empresa;

    /**
     * Constructor de la clase Anuncio.
     * @param medio El medio de comunicación del anuncio.
     * @param modulo El tipo de módulo del anuncio.
     * @param frecuencia La frecuencia de publicación del anuncio.
     * @param precio El precio del anuncio.
     * @param empresa El nombre de la empresa del anuncio.
     */
    public Anuncio(MedioComunicacion medio, TipoModulo modulo, FrecuenciaPublicacion frecuencia, double precio, String empresa) {
        this.medio = medio;
        this.modulo = modulo;
        this.frecuencia = frecuencia;
        this.precio = precio;
        this.empresa = empresa;
    }


    public MedioComunicacion getMedio() {
        return medio;
    }

    public void setMedio(MedioComunicacion medio) {
        this.medio = medio;
    }

    public TipoModulo getModulo() {
        return modulo;
    }

    public void setModulo(TipoModulo modulo) {
        this.modulo = modulo;
    }

    public FrecuenciaPublicacion getFrecuencia() {
        return frecuencia;
    }

    public void setFrecuencia(FrecuenciaPublicacion frecuencia) {
        this.frecuencia = frecuencia;
    }

    public double getPrecio() {
        return precio;
    }

    public void setPrecio(double precio) {
        this.precio = precio;
    }

    public String getEmpresa() {
        return empresa;
    }

    public void setEmpresa(String empresa) {
        this.empresa = empresa;
    }

}

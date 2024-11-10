package proyectointegrador.modelos;

public class Anuncio {
    MedioComunicacion medio;
    TipoModulo modulo;
    FrecuenciaPublicacion frecuencia;
    double precio;
    String empresa;

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

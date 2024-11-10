package proyectointegrador;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class ProyectoIntegrador {

    //Nueva inicialización de datos
    private static final List<MedioComunicacion> mediosComunicacion = new ArrayList<>();
    private static final List<TipoModulo> tiposModulos = new ArrayList<>();
    private static final List<FrecuenciaPublicacion> frecuenciasPublicacion = new ArrayList<>();
    private static final List<Anuncio> anuncios = new ArrayList<>();
    
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int opcion;

        inicializarDatos();

        do {
            mostrarMenu();
            opcion = scanner.nextInt();
            scanner.nextLine(); // Consumir el salto de línea

            switch (opcion) {
                case 1 -> mostrarPrecios();
                case 2 -> agregarAnuncio(scanner);
                case 3 -> eliminarAnuncio(scanner);
                case 4 -> mostrarAnuncios();
                case 5 -> buscarAnuncioPorEmpresa(scanner);
                case 6 -> modificarAnuncio(scanner);
                case 7 -> System.out.println("El ingreso total de todos los anuncios cargados en el sistema es: $" + calcularIngresosTotales());
                case 0 -> System.out.println("Saliendo...");
                default -> System.out.println("Opción incorrecta");
            }
        } while (opcion != 0);
        
        scanner.close();
    }

    private static void mostrarMenu() {
        System.out.println("Menú Principal");
        System.out.println("1. Mostrar precios");
        System.out.println("2. Agregar anuncio");
        System.out.println("3. Eliminar anuncio");
        System.out.println("4. Mostrar anuncios");
        System.out.println("5. Buscar anuncio por empresa");
        System.out.println("6. Modificar anuncio");
        System.out.println("7. Calcular ingresos totales de los anuncios cargados");
        System.out.println("0. Salir");
    }
    
    private static void inicializarDatos() {

        // Inicializar medios de comunicación
        mediosComunicacion.add(new MedioComunicacion("El Norteño"));
        mediosComunicacion.add(new MedioComunicacion("Del Sur"));
        mediosComunicacion.add(new MedioComunicacion("Patagónico"));
        mediosComunicacion.add(new MedioComunicacion("Del Centro"));
        mediosComunicacion.add(new MedioComunicacion("El Cuyano"));
        mediosComunicacion.add(new MedioComunicacion("Del Litoral"));

        // Inicializar tipos de módulos
        tiposModulos.add(new TipoModulo("M1"));
        tiposModulos.add(new TipoModulo("M2"));
        tiposModulos.add(new TipoModulo("M3"));
        tiposModulos.add(new TipoModulo("M4"));
        tiposModulos.add(new TipoModulo("M6"));
        tiposModulos.add(new TipoModulo("M8"));
        tiposModulos.add(new TipoModulo("M12"));
        tiposModulos.add(new TipoModulo("M16"));


        // Inicializar frecuencias de publicación
        frecuenciasPublicacion.add(new FrecuenciaPublicacion("D"));
        frecuenciasPublicacion.add(new FrecuenciaPublicacion("LAV"));
        frecuenciasPublicacion.add(new FrecuenciaPublicacion("SD"));
        frecuenciasPublicacion.add(new FrecuenciaPublicacion("1S"));
        frecuenciasPublicacion.add(new FrecuenciaPublicacion("2S"));
        frecuenciasPublicacion.add(new FrecuenciaPublicacion("3S"));
        frecuenciasPublicacion.add(new FrecuenciaPublicacion("1.15"));
        frecuenciasPublicacion.add(new FrecuenciaPublicacion("1.30"));

        // Cargar anuncios de prueba
        anuncios.add(new Anuncio(mediosComunicacion.get(0), tiposModulos.get(0), frecuenciasPublicacion.get(0), 1000.0, "Empresa 1"));
        anuncios.add(new Anuncio(mediosComunicacion.get(1), tiposModulos.get(1), frecuenciasPublicacion.get(1), 800.0, "Empresa 2"));
        
    }

    private static void mostrarPrecios() {
        System.out.println("Precios de los espacios publicitarios:");
        for (int i = 0; i < tiposModulos.size(); i++) {
            for (int j = 0; j < frecuenciasPublicacion.size(); j++) {
               // System.out.println(TIPOS_MODULOS[i] + " - " + FRECUENCIAS_PUBLICACION[j] + ": $" + PRECIOS[i][j]);
                System.out.println(tiposModulos.get(i).getNombre() + " - " + frecuenciasPublicacion.get(j).getNombre() + ": $" + getPrecio(i,j));
            }
        }
    }
    
    private static double getPrecio(int modulo, int frecuencia) {

        double[][] PRECIOS = {
                {1000.0, 800.0, 500.0, 200.0, 350.0, 500.0, 150.0, 100.0},
                {1800.0, 1500.0, 900.0, 350.0, 650.0, 900.0, 250.0, 180.0},
                {2100.0, 2100.0, 1300.0, 500.0, 950.0, 1300.0, 350.0, 250.0},
                {3000.0, 2500.0, 1500.0, 600.0, 1100.0, 1500.0, 400.0, 300.0},
                {4500.0, 3800.0, 2300.0, 900.0, 1700.0, 2300.0, 600.0, 450.0},
                {6000.0, 5000.0, 3000.0, 1200.0, 2200.0, 3000.0, 800.0, 600.0},
                {8500.0, 7100.0, 4300.0, 1700.0, 3200.0, 4300.0, 1100.0, 800.0},
                {11000.0, 9200.0, 5500.0, 2200.0, 4200.0, 5500.0, 1400.0, 1000.0}
        };

        return PRECIOS[modulo][frecuencia];
    }

    private static void agregarAnuncio(Scanner scanner) {

        System.out.println("Seleccione el medio de comunicación:");
        for (int i = 0; i < mediosComunicacion.size(); i++) {
            System.out.println((i + 1) + ". " + mediosComunicacion.get(i).getNombre());
        }
        int medioIndex = scanner.nextInt() -1;
        
        scanner.nextLine();
        MedioComunicacion medioSeleccionado = mediosComunicacion.get(medioIndex);
        
        // Seleccionar módulo
        System.out.println("Seleccione el tipo de módulo:");
        for (int i = 0; i < tiposModulos.size(); i++) {
            System.out.println((i + 1) + ". " + tiposModulos.get(i).getNombre());
        }
        int tipoModuloIndex = scanner.nextInt() -1;
        scanner.nextLine();
        TipoModulo tipoModuloSeleccionado = tiposModulos.get(tipoModuloIndex);

        // Seleccionar frecuencia
        System.out.println("Seleccione la frecuencia de publicación:");
        for (int i = 0; i < frecuenciasPublicacion.size(); i++) {
            System.out.println((i + 1) + ". " + frecuenciasPublicacion.get(i).getNombre());
        }
        int frecuenciaIndex = scanner.nextInt() - 1;
         scanner.nextLine();

        FrecuenciaPublicacion frecuenciaSeleccionada = frecuenciasPublicacion.get(frecuenciaIndex);

        System.out.println("Ingresar nombre empresa:");
        String nombreEmpresa = scanner.nextLine();
        
        // Calcular precio total
        double precio = getPrecio(tipoModuloIndex,frecuenciaIndex);

        // Agregar el anuncio
        Anuncio nuevoAnuncio = new Anuncio(medioSeleccionado, tipoModuloSeleccionado, frecuenciaSeleccionada, precio, nombreEmpresa);
        anuncios.add(nuevoAnuncio);

        System.out.println("Anuncio agregado exitosamente.");
    }

    private static void eliminarAnuncio(Scanner scanner) {
        mostrarAnuncios();
        System.out.println("Ingrese el ID del anuncio a eliminar:");
        int anuncioId = scanner.nextInt();

        if (anuncioId >= 0 && anuncioId < anuncios.size()) {
           anuncios.remove(anuncioId);
            System.out.println("Anuncio eliminado exitosamente.");

        } else {
            System.out.println("ID de anuncio inválido.");
        }
    }

    private static void mostrarAnuncios() {
        System.out.println("Lista de anuncios:");
        for (int i = 0; i < anuncios.size(); i++) {
            Anuncio anuncio = anuncios.get(i);
            System.out.printf("ID: %d, Medio: %s, Módulo: %s, Frecuencia: %s, Precio: $%.2f, Nombre de la empresa: %s%n",
                    i, anuncio.getMedio().getNombre(), anuncio.getModulo().getNombre(), anuncio.getFrecuencia().getNombre(), anuncio.getPrecio(), anuncio.getEmpresa());

        }
    }

    private static double calcularIngresosTotales() {
        double totalIngresos = 0;
        for (Anuncio anuncio : anuncios) {
             totalIngresos += anuncio.getPrecio();
        }
        return totalIngresos;
    }

    private static void buscarAnuncioPorEmpresa(Scanner scanner) {
        System.out.println("Ingrese el nombre de la empresa a buscar:");
        String nombreEmpresa = scanner.nextLine();
        boolean encontrado = false;

        for (Anuncio anuncio : anuncios) {
            if (anuncio.getEmpresa().equalsIgnoreCase(nombreEmpresa)) {
                System.out.printf(
                        "ID: %d, Medio: %s, Módulo: %s, Frecuencia: %s, Precio: $%s, Empresa: %s%n",
                        anuncio.getMedio().getNombre(), anuncio.getModulo().getNombre(), anuncio.getFrecuencia().getNombre(), anuncio.getPrecio(), anuncio.getEmpresa()
                );
                encontrado = true;
            }
        }

        if (!encontrado) {
            System.out.println("No se encontraron anuncios para la empresa: " + nombreEmpresa);
        }
    }

    private static void modificarAnuncio(Scanner scanner) {
        mostrarAnuncios();
        
        System.out.println("Ingrese el ID del anuncio a modificar:");
        int id = scanner.nextInt();
        scanner.nextLine();// Consumir el salto de línea
        
        if (id >= 0 && id < anuncios.size()) {
            Anuncio anuncio = anuncios.get(id);
            
            System.out.println("Ingrese el nuevo nombre de la empresa (o presione Enter para dejar igual):");
            String nuevoNombreEmpresa = scanner.nextLine();
            if (!nuevoNombreEmpresa.isEmpty()) {
                anuncio.setEmpresa(nuevoNombreEmpresa);
            }

            System.out.println("Seleccione el nuevo medio de comunicación (o 0 para dejar igual):");
            for (int i = 0; i < mediosComunicacion.size(); i++) {
                System.out.println((i + 1) + ". " + mediosComunicacion.get(i).getNombre());
            }
            int medio = scanner.nextInt();
            if (medio != 0) {
                anuncio.setMedio(mediosComunicacion.get(medio - 1));
            }
            scanner.nextLine();

            System.out.println("Seleccione el nuevo tipo de módulo (o 0 para dejar igual):");
            for (int i = 0; i < tiposModulos.size(); i++) {
                System.out.println((i + 1) + ". " + tiposModulos.get(i).getNombre());
            }
            int modulo = scanner.nextInt();
            if (modulo != 0) {
                 anuncio.setModulo(tiposModulos.get(modulo-1));
            }
            scanner.nextLine();

            System.out.println("Seleccione la nueva frecuencia de publicación (o 0 para dejar igual):");
            for (int i = 0; i < frecuenciasPublicacion.size(); i++) {
                System.out.println((i + 1) + ". " + frecuenciasPublicacion.get(i).getNombre());
            }
            int frecuencia = scanner.nextInt();
            if (frecuencia != 0) {
               anuncio.setFrecuencia(frecuenciasPublicacion.get(frecuencia-1));
            }

            // Actualizar precio si se cambió el módulo y frecuencia
            double nuevoPrecio = getPrecio(modulo == 0 ? tiposModulos.indexOf(anuncio.getModulo()) : modulo-1, frecuencia == 0 ? frecuenciasPublicacion.indexOf(anuncio.getFrecuencia()) : frecuencia -1 );
            anuncio.setPrecio(nuevoPrecio);

            System.out.println("Anuncio modificado exitosamente.");
        } else {
            System.out.println("ID inválido o anuncio no encontrado.");
        }
    }
}



class MedioComunicacion {
    String nombre;

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

class TipoModulo {
    String nombre;

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

class FrecuenciaPublicacion {
    String nombre;

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

class Anuncio {
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

 
    


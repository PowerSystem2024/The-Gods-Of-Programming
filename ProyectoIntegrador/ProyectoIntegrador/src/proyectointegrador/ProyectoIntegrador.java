package proyectointegrador;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import proyectointegrador.modelos.Anuncio;
import proyectointegrador.modelos.FrecuenciaPublicacion;
import proyectointegrador.modelos.MedioComunicacion;
import proyectointegrador.modelos.TipoModulo;

public class ProyectoIntegrador {

    //Lista de medios de comunicación, tipos de módulos, frecuencias de publicación y anuncios creados
    private static final List<MedioComunicacion> mediosComunicacion = new ArrayList<>();
    private static final List<TipoModulo> tiposModulos = new ArrayList<>();
    private static final List<FrecuenciaPublicacion> frecuenciasPublicacion = new ArrayList<>();
    private static final List<Anuncio> anuncios = new ArrayList<>();

    //Scanner global para que sea accesible desde todos los métodos
    private static final Scanner scanner = new Scanner(System.in);

    //Método principal del programa.
    public static void main(String[] args) {
        int opcion;

        inicializarDatos();

        do {
            mostrarMenu();
            opcion = obtenerOpcion();

            switch (opcion) {
                case 1 -> mostrarPrecios();
                case 2 -> agregarAnuncio();
                case 3 -> eliminarAnuncio();
                case 4 -> mostrarAnuncios();
                case 5 -> buscarAnuncioPorEmpresa();
                case 6 -> modificarAnuncio();
                case 7 -> mostrarIngresosTotales();
                case 0 -> System.out.println("Saliendo...");
                default -> System.out.println("Opción incorrecta");
            }
        } while (opcion != 0);
        
        scanner.close();
    }

    /**
     * Obtiene una opción numérica del usuario.
     * Valida que la entrada sea un número entero.
     */
    private static int obtenerOpcion() {
        while (!scanner.hasNextInt()) {
            System.out.println("Entrada inválida. Ingrese un número.");
            scanner.next(); // Descartar la entrada inválida
        }
        int opcion = scanner.nextInt();
        scanner.nextLine(); // Consumir el salto de línea
        return opcion;
    }

    //Muestra el menú principal del programa.
    private static void mostrarMenu() {
        System.out.println("****************************************");
        System.out.println("********** Menú Principal **********");
        System.out.println("****************************************");
        System.out.println("1. Mostrar precios");
        System.out.println("2. Agregar anuncio");
        System.out.println("3. Eliminar anuncio");
        System.out.println("4. Mostrar anuncios");
        System.out.println("5. Buscar anuncio por empresa");
        System.out.println("6. Modificar anuncio");
        System.out.println("7. Calcular ingresos totales de los anuncios cargados");
        System.out.println("0. Salir");
        System.out.println("****************************************");
    }

    //Inicializa los datos del programa (medios, módulos, frecuencias y anuncios de prueba).
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
        anuncios.add(new Anuncio(mediosComunicacion.get(0), tiposModulos.get(3), frecuenciasPublicacion.get(1), 2500.0, "Tech Solutions Inc."));
        anuncios.add(new Anuncio(mediosComunicacion.get(1), tiposModulos.get(1), frecuenciasPublicacion.get(0), 1800.0, "Innovate Corp."));
        anuncios.add(new Anuncio(mediosComunicacion.get(2), tiposModulos.get(5), frecuenciasPublicacion.get(6), 4300.0, "Global Industries Ltd."));
        anuncios.add(new Anuncio(mediosComunicacion.get(3), tiposModulos.get(0), frecuenciasPublicacion.get(2), 500.0, "Creative Designs Studio"));
        anuncios.add(new Anuncio(mediosComunicacion.get(4), tiposModulos.get(2), frecuenciasPublicacion.get(4), 1300.0, "Marketing Masters"));
        anuncios.add(new Anuncio(mediosComunicacion.get(5), tiposModulos.get(7), frecuenciasPublicacion.get(7), 1000.0, "Digital Dynamics"));
        anuncios.add(new Anuncio(mediosComunicacion.get(0), tiposModulos.get(4), frecuenciasPublicacion.get(3), 200.0, "Code Wizards"));
        anuncios.add(new Anuncio(mediosComunicacion.get(1), tiposModulos.get(6), frecuenciasPublicacion.get(5), 900.0, "Future Vision"));
        anuncios.add(new Anuncio(mediosComunicacion.get(2), tiposModulos.get(0), frecuenciasPublicacion.get(0), 2100.0, "Open Source Solutions"));
        anuncios.add(new Anuncio(mediosComunicacion.get(3), tiposModulos.get(2), frecuenciasPublicacion.get(1), 2100.0, "Web Dev Experts"));
        anuncios.add(new Anuncio(mediosComunicacion.get(4), tiposModulos.get(1), frecuenciasPublicacion.get(4), 2100.0, "Marketing Masters"));
        
    }
    
    //Muestra los precios de los espacios publicitarios.
    private static void mostrarPrecios() {
        System.out.println("Precios de los espacios publicitarios:");
        for (int i = 0; i < tiposModulos.size(); i++) {
            for (int j = 0; j < frecuenciasPublicacion.size(); j++) {
                System.out.println(tiposModulos.get(i).getNombre() + " - " + frecuenciasPublicacion.get(j).getNombre() + ": $" + getPrecio(i,j));
            }
        }
    }

    //Obtiene el precio de un espacio publicitario según el módulo y la frecuencia
    //@param modulo Índice del módulo
    //@param frecuencia Índice de la frecuencia
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

    //Agrega un nuevo anuncio al sistema
    //Solicita al usuario los datos del anuncio (medio, módulo, frecuencia, empresa)
    private static void agregarAnuncio() {

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

    //Elimina un anuncio del sistema
    //Solicita al usuario el ID del anuncio a eliminar
    private static void eliminarAnuncio() {
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

    //Muestra la lista de anuncios creados
    private static void mostrarAnuncios() {
        System.out.println("Lista de anuncios:");
        for (int i = 0; i < anuncios.size(); i++) {
            Anuncio anuncio = anuncios.get(i);
            System.out.printf("ID: %d, Medio: %s, Módulo: %s, Frecuencia: %s, Precio: $%.2f, Nombre de la empresa: %s%n",
                    i, anuncio.getMedio().getNombre(), anuncio.getModulo().getNombre(), anuncio.getFrecuencia().getNombre(), anuncio.getPrecio(), anuncio.getEmpresa());

        }
    }

    //Calcula los ingresos totales de los anuncios cargados
    private static double calcularIngresosTotales() {
        double totalIngresos = 0;
        for (Anuncio anuncio : anuncios) {
             totalIngresos += anuncio.getPrecio();
        }
        return totalIngresos;
    }

    //Busca anuncios por el nombre de la empresa
    private static void buscarAnuncioPorEmpresa() {
        System.out.println("Ingrese el nombre de la empresa a buscar:");
        String nombreEmpresa = scanner.nextLine();
        boolean encontrado = false;

        for (int i = 0; i < anuncios.size(); i++) {
            Anuncio anuncio = anuncios.get(i); // Obtener el anuncio por índice
            if (anuncio.getEmpresa().equalsIgnoreCase(nombreEmpresa)) {
                System.out.printf(
                        "ID: %d, Medio: %s, Módulo: %s, Frecuencia: %s, Precio: $%s, Empresa: %s%n",
                        i, anuncio.getMedio().getNombre(), anuncio.getModulo().getNombre(), anuncio.getFrecuencia().getNombre(), anuncio.getPrecio(), anuncio.getEmpresa()
                );
                encontrado = true;
            }
        }

        if (!encontrado) {
            System.out.println("No se encontraron anuncios para la empresa: " + nombreEmpresa);
        }
    }

    //Modifica un anuncio existente
    //Solicita al usuario el ID del anuncio a modificar y los nuevos datos
    private static void modificarAnuncio() {
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

    //Muestra el total de ingresos de los anuncios cargados
    private static void mostrarIngresosTotales(){
        System.out.println("El ingreso total de todos los anuncios cargados en el sistema es: $" + calcularIngresosTotales());
    }
}

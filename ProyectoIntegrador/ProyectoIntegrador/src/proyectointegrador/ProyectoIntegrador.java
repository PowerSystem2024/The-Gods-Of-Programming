
package proyectointegrador;

import java.util.Scanner;

public class ProyectoIntegrador {
    // Inicializar datos
    private static final String[] MEDIOS_COMUNICACION = {
        "El Norteño", "Del Sur", "Patagónico", "Del Centro", "El Cuyano", "Del Litoral"
    };
    private static final String[] TIPOS_MODULOS = {
        "M1", "M2", "M3", "M4", "M6", "M8", "M12", "M16"
    };
    private static final String[] FRECUENCIAS_PUBLICACION = {
        "D", "LAV", "SD", "1S", "2S", "3S", "1.15", "1.30"
    };
    private static final double[][] PRECIOS = {
        {1000.0, 800.0, 500.0, 200.0, 350.0, 500.0, 150.0, 100.0},
        {1800.0, 1500.0, 900.0, 350.0, 650.0, 900.0, 250.0, 180.0},
        {2100.0, 2100.0, 1300.0, 500.0, 950.0, 1300.0, 350.0, 250.0},
        {3000.0, 2500.0, 1500.0, 600.0, 1100.0, 1500.0, 400.0, 300.0},
        {4500.0, 3800.0, 2300.0, 900.0, 1700.0, 2300.0, 600.0, 450.0},
        {6000.0, 5000.0, 3000.0, 1200.0, 2200.0, 3000.0, 800.0, 600.0},
        {8500.0, 7100.0, 4300.0, 1700.0, 3200.0, 4300.0, 1100.0, 800.0},
        {11000.0, 9200.0, 5500.0, 2200.0, 4200.0, 5500.0, 1400.0, 1000.0}
    };
    
    private static String[][] anuncios = new String[100][5];

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int opcion;

        inicializarDatos();

        do {
            System.out.println("Menú Principal");
            System.out.println("1. Mostrar precios");
            System.out.println("2. Agregar anuncio");
            System.out.println("3. Eliminar anuncio");
            System.out.println("4. Mostrar anuncios");
            System.out.println("5. Buscar anuncio por empresa");
            System.out.println("6. Modificar anuncio");
            System.out.println("7. Calcular ingresos totales de los anuncios cargados");
            System.out.println("0. Salir");
            opcion = scanner.nextInt();

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

    private static void inicializarDatos() {
        for (int i = 0; i < 100; i++) {
            for (int j = 0; j < 5; j++) {
                anuncios[i][j] = "";
            }
        }

        // Cargar anuncios de prueba
        anuncios[0][0] = MEDIOS_COMUNICACION[0];
        anuncios[0][1] = TIPOS_MODULOS[0];
        anuncios[0][2] = FRECUENCIAS_PUBLICACION[0];
        anuncios[0][3] = String.valueOf(PRECIOS[0][0]);
        anuncios[0][4] = "Empresa 1";

        anuncios[1][0] = MEDIOS_COMUNICACION[1];
        anuncios[1][1] = TIPOS_MODULOS[1];
        anuncios[1][2] = FRECUENCIAS_PUBLICACION[1];
        anuncios[1][3] = String.valueOf(PRECIOS[1][1]);
        anuncios[1][4] = "Empresa 2";
    }

    private static void mostrarPrecios() {
        System.out.println("Precios de los espacios publicitarios:");
        for (int i = 0; i < TIPOS_MODULOS.length; i++) {
            for (int j = 0; j < FRECUENCIAS_PUBLICACION.length; j++) {
                System.out.println(TIPOS_MODULOS[i] + " - " + FRECUENCIAS_PUBLICACION[j] + ": $" + PRECIOS[i][j]);
            }
        }
    }

    private static void agregarAnuncio(Scanner scanner) {
        int anuncioId = -1;

        // Encontrar un lugar vacío en la matriz de anuncios
        for (int i = 0; i < 100; i++) {
            if (anuncios[i][3].isEmpty()) {
                anuncioId = i;
                break;
            }
        }

        if (anuncioId == -1) {
            System.out.println("No hay espacio para más anuncios.");
            return;
        }

        // Seleccionar medio
        System.out.println("Ingresar nombre empresa:");
        String nombreEmpresa = scanner.next();

        System.out.println("Seleccione el medio de comunicación:");
        for (int i = 0; i < MEDIOS_COMUNICACION.length; i++) {
            System.out.println(i + ". " + MEDIOS_COMUNICACION[i]);
        }
        int medio = scanner.nextInt();

        // Seleccionar módulo
        System.out.println("Seleccione el tipo de módulo:");
        for (int i = 0; i < TIPOS_MODULOS.length; i++) {
            System.out.println(i + ". " + TIPOS_MODULOS[i]);
        }
        int modulo = scanner.nextInt();

        // Seleccionar frecuencia
        System.out.println("Seleccione la frecuencia de publicación:");
        for (int i = 0; i < FRECUENCIAS_PUBLICACION.length; i++) {
            System.out.println(i + ". " + FRECUENCIAS_PUBLICACION[i]);
        }
        int frecuencia = scanner.nextInt();

        // Calcular precio total
        double precioTotal = PRECIOS[modulo][frecuencia];

        // Agregar el anuncio a la matriz
        anuncios[anuncioId][0] = MEDIOS_COMUNICACION[medio];
        anuncios[anuncioId][1] = TIPOS_MODULOS[modulo];
        anuncios[anuncioId][2] = FRECUENCIAS_PUBLICACION[frecuencia];
        anuncios[anuncioId][3] = String.valueOf(precioTotal);
        anuncios[anuncioId][4] = nombreEmpresa;

        System.out.println("Anuncio agregado exitosamente.");
    }

    private static void eliminarAnuncio(Scanner scanner) {
        mostrarAnuncios();
        System.out.println("Ingrese el ID del anuncio a eliminar:");
        int anuncioId = scanner.nextInt();

        if (anuncioId >= 0 && anuncioId < 100) {
            if (!anuncios[anuncioId][0].isEmpty()) {
                for (int i = 0; i < 5; i++) {
                    anuncios[anuncioId][i] = "";
                }
                System.out.println("Anuncio eliminado exitosamente.");
            } else {
                System.out.println("El ID ingresado no corresponde a ningún anuncio.");
            }
        } else {
            System.out.println("ID de anuncio inválido.");
        }
    }

    private static void mostrarAnuncios() {
        System.out.println("Lista de anuncios:");
        for (int i = 0; i < anuncios.length; i++) {
            if (!anuncios[i][3].isEmpty()) {
                System.out.printf("ID: %d, Medio: %s, Módulo: %s, Frecuencia: %s, Precio: $%s, Nombre de la empresa: %s%n",
                        i, anuncios[i][0], anuncios[i][1], anuncios[i][2], anuncios[i][3], anuncios[i][4]);
            }
        }
    }

    private static double calcularIngresosTotales() {
        double totalIngresos = 0;
        for (String[] anuncio : anuncios) {
            if (!anuncio[3].isEmpty()) {
                totalIngresos += Double.parseDouble(anuncio[3]);
            }
        }
        return totalIngresos;
    }

    private static void buscarAnuncioPorEmpresa(Scanner scanner) {
        System.out.println("Ingrese el nombre de la empresa a buscar:");
        String nombreEmpresa = scanner.next();
        boolean encontrado = false;

        for (int i = 0; i < anuncios.length; i++) {
            if (anuncios[i][4].equalsIgnoreCase(nombreEmpresa)) {
                System.out.printf("ID: %d, Medio: %s, Módulo: %s, Frecuencia: %s, Precio: $%s, Empresa: %s%n",
                        i, anuncios[i][0], anuncios[i][1], anuncios[i][2], anuncios[i][3], anuncios[i][4]);
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

        if (id >= 0 && id < 100 && !anuncios[id][0].isEmpty()) {
            System.out.println("Ingrese el nuevo nombre de la empresa (o presione Enter para dejar igual):");
            scanner.nextLine(); // Limpiar buffer
            String nuevoNombreEmpresa = scanner.nextLine();
            if (!nuevoNombreEmpresa.isEmpty()) {
                anuncios[id][4] = nuevoNombreEmpresa;
            }

            System.out.println("Seleccione el nuevo medio de comunicación (o 0 para dejar igual):");
            for (int i = 0; i < MEDIOS_COMUNICACION.length; i++) {
                System.out.println(i + ". " + MEDIOS_COMUNICACION[i]);
            }
            int medio = scanner.nextInt();
            if (medio != 0) {
                anuncios[id][0] = MEDIOS_COMUNICACION[medio];
            }

            System.out.println("Seleccione el nuevo tipo de módulo (o 0 para dejar igual):");
            for (int i = 0; i < TIPOS_MODULOS.length; i++) {
                System.out.println(i + ". " + TIPOS_MODULOS[i]);
            }
            int modulo = scanner.nextInt();
            if (modulo != 0) {
                anuncios[id][1] = TIPOS_MODULOS[modulo];
            }

            System.out.println("Seleccione la nueva frecuencia de publicación (o 0 para dejar igual):");
            for (int i = 0; i < FRECUENCIAS_PUBLICACION.length; i++) {
                System.out.println(i + ". " + FRECUENCIAS_PUBLICACION[i]);
            }
            int frecuencia = scanner.nextInt();
            if (frecuencia != 0) {
                anuncios[id][2] = FRECUENCIAS_PUBLICACION[frecuencia];
            }

            // Actualizar precio si se cambió el módulo y frecuencia
            double nuevoPrecio = PRECIOS[modulo][frecuencia];
            anuncios[id][3] = String.valueOf(nuevoPrecio);

            System.out.println("Anuncio modificado exitosamente.");
        } else {
            System.out.println("ID inválido o anuncio no encontrado.");
        }
    }
}


 
    


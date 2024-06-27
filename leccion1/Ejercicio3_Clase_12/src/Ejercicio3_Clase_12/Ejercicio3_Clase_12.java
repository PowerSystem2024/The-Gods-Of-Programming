package Ejercicio3_Clase_12;

import java.util.Scanner;

public class Ejercicio3_Clase_12 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Solicitar las calificaciones al usuario
        System.out.print("Ingrese la calificación de participación: ");
        double participacion = scanner.nextDouble();

        System.out.print("Ingrese la calificación del primer examen parcial: ");
        double primerParcial = scanner.nextDouble();

        System.out.print("Ingrese la calificación del segundo examen parcial: ");
        double segundoParcial = scanner.nextDouble();

        System.out.print("Ingrese la calificación del examen final: ");
        double examenFinal = scanner.nextDouble();

        // Calcular la calificación final utilizando las ponderaciones
        double calificacionFinal = (participacion * 0.10) +
                                   (primerParcial * 0.25) +
                                   (segundoParcial * 0.25) +
                                   (examenFinal * 0.40);

        // Mostrar la calificación final
        System.out.println("La calificación final del estudiante es: " + calificacionFinal);
    }
}

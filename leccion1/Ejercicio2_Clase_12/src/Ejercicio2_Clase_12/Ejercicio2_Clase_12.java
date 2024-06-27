package Ejercicio2_Clase_12;

import java.util.Scanner;

public class Ejercicio2_Clase_12 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Solicitar los valores de a y b al usuario
        System.out.print("Ingrese el valor de a: ");
        double a = scanner.nextDouble();

        System.out.print("Ingrese el valor de b: ");
        double b = scanner.nextDouble();

        // Calcular el cuadrado de la suma usando la fórmula
        double resultado = Math.pow(a, 2) + Math.pow(b, 2) + 2 * a * b;

        // Mostrar el resultado
        System.out.println("El resultado de (a + b)^2 es: " + resultado);
    }
}


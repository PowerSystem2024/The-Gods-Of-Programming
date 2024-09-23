package Ejercicio1_Clase_12;

import java.util.Scanner;

public class Ejercicio1_Clase_12 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Ingrese la cantidad de horas: ");
        // Total de horas de entrada
        int totalHoras = scanner.nextInt();

        // Calcular semanas, días y horas
        int horasPorSemana = 168; // 7 días * 24 horas
        int horasPorDia = 24;

        int semanas = totalHoras / horasPorSemana;
        int horasRestantes = totalHoras % horasPorSemana;

        int dias = horasRestantes / horasPorDia;
        int horas = horasRestantes % horasPorDia;

        // Mostrar el resultado
        System.out.println("Total de horas: " + totalHoras);
        System.out.println("Equivalente a: " + semanas + " semanas, " + dias + " días, y " + horas + " horas.");
    }
}




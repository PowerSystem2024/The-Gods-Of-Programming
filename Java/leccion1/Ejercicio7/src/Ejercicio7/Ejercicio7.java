

package Ejercicios7;

import java.util.Scanner;

public class Ejercicio7 {

  public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
    // Variables para almacenar cantidad de carros vendidos y el valor total de las ventas
    int carrosVendidos;
    double valorVentas;

    // Salario base
    final int SALARIO_BASE = 1000;

    // Indicar la cantidad de carros vendidos
    System.out.print("Ingrese la cantidad de carros vendidos: ");
    carrosVendidos = scanner.nextInt();
    // Indicar el monto total de ventas (el 5% de cada venta o el total es el mismo)
    System.out.print("Ingrese el valor total de las ventas: $");
    valorVentas = scanner.nextDouble();

    // Calcula la comisión por carro vendido
    int comisionCarro = carrosVendidos * 150;
    // Calcula el 5% del valor de la venta por carro
    double comisionVenta = valorVentas * 0.05;

    // Calcula el salario mensual del vendedor
    double salarioMensual = SALARIO_BASE + comisionCarro + comisionVenta;

    System.out.println("El salario mensual del vendedor es: $" + salarioMensual);
}
}


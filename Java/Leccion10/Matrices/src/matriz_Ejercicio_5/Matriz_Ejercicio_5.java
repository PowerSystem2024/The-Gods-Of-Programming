/*
 * Ejercicio 5: Crear y cargar una matriz de tamaño n x m, mostrar la 
 * suma de cada fila y de cada columna
 */
package matriz_ejercicio_5;

import java.util.Scanner;
import javax.swing.JOptionPane;

public class Matriz_Ejercicio_5 {

    public static void main(String[] args) {
        int[][] matriz;
        int nFilas, nColumnas;
        Scanner entrada = new Scanner(System.in); // Crear Scanner

        nFilas = Integer.parseInt(JOptionPane.showInputDialog("Ingrese el número de filas: "));
        nColumnas = Integer.parseInt(JOptionPane.showInputDialog("Ingrese el número de columnas: "));

        matriz = new int[nFilas][nColumnas];
        int[] filas = new int[nFilas];
        int[] columnas = new int[nColumnas];

        System.out.println("Rellenando la matriz");
        for (int i = 0; i < nFilas; i++) {
            for (int j = 0; j < nColumnas; j++) {
                System.out.print("Matriz [" + i + "] [" + j + "]: ");
                matriz[i][j] = entrada.nextInt();
            }
        }

        System.out.println("\nMatriz Original");
        for (int i = 0; i < nFilas; i++) {
            for (int j = 0; j < nColumnas; j++) {
                System.out.print(matriz[i][j] + "  ");
            }
            System.out.println(); // Salto de línea después de cada fila
        }

        // Sumando las filas
        for (int i = 0; i < nFilas; i++) {
            int sumaFilas = 0;
            for (int j = 0; j < nColumnas; j++) {
                sumaFilas += matriz[i][j];
            }
            filas[i] = sumaFilas;
        }

        // Sumando las columnas
        for (int i = 0; i < nColumnas; i++) {
            int sumaColumnas = 0;
            for (int j = 0; j < nFilas; j++) {
                sumaColumnas += matriz[j][i]; // Corrección aquí
            }
            columnas[i] = sumaColumnas;
        }

        System.out.println("\nLa suma de las filas es: ");
        for (int suma : filas) {
            System.out.print(suma + " - ");
        }
        System.out.println();

        System.out.println("\nLa suma de las columnas es: ");
        for (int suma : columnas) {
            System.out.print(suma + " - ");
        }
        System.out.println();

        entrada.close(); // Cerrar Scanner
    }
}

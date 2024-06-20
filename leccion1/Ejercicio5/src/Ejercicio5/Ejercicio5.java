
package Ejercicio5;


import java.util.Scanner;
public class Ejercicio5 {
    
public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        // Pedir al usuario que ingrese las tres calificaciones
        System.out.print("Ingrese la primera calificación: ");
        double calificacion1 = scanner.nextDouble();
        
        System.out.print("Ingrese la segunda calificación: ");
        double calificacion2 = scanner.nextDouble();
        
        System.out.print("Ingrese la tercera calificación: ");
        double calificacion3 = scanner.nextDouble();
        
        // Calcular la suma de las tres calificaciones
        double suma = calificacion1 + calificacion2 + calificacion3;
        
        // Imprimir la suma de las calificaciones
        System.out.println("La suma de las tres calificaciones es: " + suma);
        

        scanner.close();
    }   
}


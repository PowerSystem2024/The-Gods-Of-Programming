
package ejercicio1_Clase_11;

import java.util.Scanner;

public class Ejercicio1_clase_11 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        // Pedir al usuario que ingrese las tres calificaciones
        System.out.print("Ingrese la primera calificación: ");
        double calificacion1 = scanner.nextDouble();
        
        System.out.print("Ingrese la segunda calificación: ");
        double calificacion2 = scanner.nextDouble();
        
        System.out.print("Ingrese la tercera calificación: ");
        double calificacion3 = scanner.nextDouble();
        
        // Calcular el promedio de las tres calificaciones
        double promedio= (calificacion1 + calificacion2 + calificacion3)/3;
        
        if(promedio >= 70){
               System.out.println("El alumno esta aprobado con el: " + promedio);
        }
        else {
            System.out.println("El alumno NO esta aprobado con el: "  + promedio);
        }
    }   

}

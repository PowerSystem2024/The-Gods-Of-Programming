/*Ejercicio 2: Leer un numero e indicar si es positivo o 
negativo . El proceso se repita hasta que se introduzca un cero*/


package Ciclos02;

import java.util.Scanner;

 

public class Ejercicio02 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner (System.in);
        System.out.println("Digite un numero: ");
        var numero = Integer.parseInt(entrada.nextLine());
             
           
       while (numero != 0){
            if (numero > 0) {
                System.out.println("El numero " +numero+ " es Positivo ");
            }
            else if (numero < 0) {
                System.out.println("El numero " +numero+ " es Negativo ");
            }
            else {
                System.out.println("Se ha ingresado un cero. Fin del programa.");
            }
           System.out.println("Digite otro numero: ");
           numero = Integer.parseInt(entrada.nextLine()); 
       }
       System.out.println("El programa a finalizado por numero igual a Cero");
    }
}

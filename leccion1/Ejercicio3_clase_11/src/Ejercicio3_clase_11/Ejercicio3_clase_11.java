
package Ejercicio3_clase_11;

import java.util.Scanner;

public class Ejercicio3_clase_11 {
    public static void main(String[] args) {
         Scanner scanner  = new Scanner(System.in);
        
        System.out.print("Ingrese un numero: ");
        double num1 = scanner.nextDouble();
        
        System.out.print("Ingrese otro numero: ");
        double num2 = scanner.nextDouble();
        double resultado = 0;
        
        if( num1 == num2){
            resultado = num1 * num2;
        } 
        else if(num1 > num2){
             resultado = num1 - num2;
        }
        else{
            resultado =  num1 + num2;
        }
        
        System.out.println("resultado = " + resultado);
    }
}

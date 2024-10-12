/*
Ejercicio 3: Leer numeros hasta que se introduzca un cero
para cada uno indicar si es par o impar.
primero lo haremos con la clase Scanner
luego con la clase JOptionPane
 */
package Ciclos03;

import java.util.Scanner;
import javax.swing.JOptionPane;


public class Ejercicio03 {
    public static void main(String[] args) {
                
        Scanner entrada = new Scanner(System.in);
        System.out.println("Digite un numero");
        var numero = Integer.parseInt(entrada.nextLine());
        while (numero != 0){
            if (numero%2 == 0){
                System.out.println("El numero "+numero+ " es Par");
            }
            else {
                System.out.println("El numero "+numero+ " es Impar");
            }
            System.out.println("Digite otro numero");
             numero = Integer.parseInt(entrada.nextLine()); 
        }
        
        System.out.println("El numero "+numero+ " finaliza el programa");
    }
        
}

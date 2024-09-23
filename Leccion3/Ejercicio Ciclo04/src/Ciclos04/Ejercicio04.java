/*
Ejercicio 4: pedir numeros hasta que se teclee uno negativo,
y mostrar cuantos numeros se han introducido.
lo hacemos primero con la clase scanner
luego lo hacemos con la clase JOptionPane
 */
package Ciclos04;

import java.util.Scanner;

public class Ejercicio04 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        System.out.println("Digite un numero");
        var numero = Integer.parseInt(entrada.nextLine());
        int contador = 0;
        
        while (numero >= 0) {
            contador = contador +1;
            System.out.println("Digite otro numero");
            numero = Integer.parseInt(entrada.nextLine());     
        }
        System.out.println("El numero: "+numero+ " al ser negativo finaliza el programa" );
        System.out.println("Lon numeros ingresadoa correctamente fueron:  " + contador);
        
    }
    
}

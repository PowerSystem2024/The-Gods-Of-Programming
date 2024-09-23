/*
Ejercicio 5: Realizar un juego para adivinar un numero,
para ello generar un numero aleatorio entre 0 - 100, y luego in pidiendo numeros 
indicando "es mayor" o es "menor" segun sea mayor o menos con respecto a N.
El proceso termina cuando acierta y mostramos el numero de intentos hechos.
 */
package Ciclos05;

import java.util.Scanner;

public class Ciclo05 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner (System.in);
        int numero, aleatorio, conteo = 0;
        aleatorio = (int)(Math.random()*100); // esto genera un numero aleatorio
        do{
            System.out.println("Digite un numero:  ");
            numero = Integer.parseInt(entrada.nextLine());
            if(numero < aleatorio){
                System.out.println("Digite un numero Mayor ");
            }
            else if (numero > aleatorio){
                System.out.println("Difite un numero menor ");
            }
            else{
                System.out.println("Felicidades!!! Has adivinado el numero");
            }
            conteo++;
        }
        while (numero != aleatorio);
        System.out.println("Adivinaste el numero en: "+conteo+" intentos");
    }
}

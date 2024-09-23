
package Ejercicio2_clase11;

import java.util.Scanner;


public class Ejercicio2_clase11 {
    public static void main(String[] args) {
          Scanner scanner = new Scanner(System.in);
          
        System.out.print("Ingrese la cantidad a pagar:  ");
        double compra = scanner.nextDouble();
        double descuento;
        if(compra >100){
            descuento = compra*0.2;
        }
        else{
            descuento = 0;
        }
        double precio_final= compra - descuento;
        
        System.out.println("El precio a abonar es: " + precio_final);
        
    }
    
}

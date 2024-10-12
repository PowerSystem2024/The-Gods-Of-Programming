/*Ejercicio1: leer un numero y mostrar su cuadrado, repetir 
el proceso hasta que se introduzca un numero negativo
*/


package Ciclos1;

import javax.swing.JOptionPane;




public class Ejercicio01 {
    public static void main(String[] args) {
   
        
        int numero, cuadrado;
  
        numero = Integer.parseInt(JOptionPane.showInputDialog("digite un numero: ")) ; //JOptionPane, ventana emergente para ingresar el numero
        
         while(numero >= 0) { //Mientras el numero sea mayor a 0
            cuadrado = (int)Math.pow(numero, 2);
            System.out.println("El numero " +numero+ " elevado al cuadrado es: " +cuadrado);
            numero = Integer.parseInt(JOptionPane.showInputDialog("digite otro numero: "));
         
         }
         System.out.println("El programa a finalizado por numero negativo");
        
        
    }
    
}

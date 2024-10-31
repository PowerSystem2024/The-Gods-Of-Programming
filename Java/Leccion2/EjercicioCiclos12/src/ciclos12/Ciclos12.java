/*
 Ejercicio 12: pedir un numero y calcular su factorial 
Hacerlo en las 2 clases, Scanner y JOptionPane
 */
package ciclos12;

//import java.util.Scanner;

import javax.swing.JOptionPane;



public class Ciclos12 {
    public static void main(String[] args) {
       // Scanner entrada= new Scanner(System.in);
       long factorial = 1;
       //System.out.println("Ingrese un numero: ");
        
       // int numero = Integer.parseInt(entrada.nextLine());
        int numero = Integer.parseInt(JOptionPane.showInputDialog("Ingrese un numero: "));
        for (int i=1; i<=numero; i++){
                factorial *= i;
        
    }
        JOptionPane.showMessageDialog(null, "El factorial del numero ingresado es: "+factorial);
        //System.out.println("el factorial del numero ingresado es: "+factorial);
                
        
        
    }
    
}

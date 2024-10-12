/*
Ejercicio 4: pedir numeros hasta que se teclee uno negativo,
y mostrar cuantos numeros se han introducido.
lo hacemos primero con la clase scanner
luego lo hacemos con la clase JOptionPane
 */
package Ciclos04;

import javax.swing.JOptionPane;


public class Ciclos04 {
    public static void main(String[ ] args) {
       var numero = Integer.parseInt(JOptionPane.showInputDialog("Ingrese un numero"));
        int contador = 0;
        
        while (numero >= 0) {
         
            JOptionPane.showInternalMessageDialog(null, "El numero: "+numero+ " es Positivo" );
            contador = contador +1;
            
            numero = Integer.parseInt(JOptionPane.showInputDialog("Ingrese otro numero"));
        }
        
        JOptionPane.showInternalMessageDialog(null, "El numero: "+numero+ " al ser negativo finaliza el programa" );
        JOptionPane.showMessageDialog(null, "Lon numeros ingresadoa correctamente fueron:  " + contador);
       
    }
}

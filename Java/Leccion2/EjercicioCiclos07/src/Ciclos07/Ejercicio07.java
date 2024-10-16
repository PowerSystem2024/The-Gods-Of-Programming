/*
Ejercicio 7: pedir numeros hasta que se introduzca uno negativo
y calcular la media

*/
package Ciclos07;

import javax.swing.JOptionPane;


public class Ejercicio07 {
    public static void main(String[] args) {
        
        int numero, conteo = 0, suma = 0;
        float promedio = 0;
        numero = Integer.parseInt(JOptionPane.showInputDialog("Ingrese un numero: "));
        
        while(numero >= 0) { //mientras el numero no sea negativo
            suma += numero;
            conteo++;
            
            numero = Integer.parseInt(JOptionPane.showInputDialog("Digite un numero: "));
        }
        if(conteo == 0){
            JOptionPane.showMessageDialog(null, "\nError, la division entre 0 no existe");
        }
        else{
            promedio= (float)suma/conteo;
            JOptionPane.showMessageDialog(null, "\nEl promedio es: "+promedio);
        }
    }
}


package Ejercicio6;

import java.util.Scanner;
        
public class Ejercicio6 {
    public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
            
    System.out.print("Ingrese la cantidad de dólares que tiene Guillermo: ");
    
    int  dolarGuillermo = scanner.nextInt();
    
    double  dolarLuis = dolarGuillermo/2;
    double  dolarJuan = (dolarGuillermo + dolarLuis) /2;
    double suma = dolarGuillermo + dolarLuis + dolarJuan;
    
     System.out.println("Guillermo tiene: $" + dolarGuillermo);
    System.out.println("Luis tiene: $" + dolarLuis);
    System.out.println("Juan tiene: $" + dolarJuan);
    
    System.out.println ("Entre los 3 tienen :  " +  suma);
    
     }
}

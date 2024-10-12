
package leccion2;

import java.util.Scanner;

/**
 *
 * @author gapel
 */
public class leccion2 {
    public static void main(String[] args) {
//        var condicion = false;
//        if(condicion){
//            System.out.println("Condición Verdadera"); //condicional simple solo if
//        }
//        else{
//            System.out.println("Condición Falsa"); // consicional doble if/else
//        }
//        
//        var numero = 4;
//        var numeroTexto = "Número desconocido";
//        if(numero == 1){
//            numeroTexto = "Número Uno";
//        }
//        else if (numero ==2) {
//            numeroTexto = "Número Dos";
//        }
//        else if (numero == 3) {
//            numeroTexto = "Número Tres";
//        }
//        else if (numero == 4){
//            numeroTexto = "Número Cuatro";
//        }
//        else {
//            numeroTexto = "Número no encontrado";
//        }
//        System.out.println("numeroTexto = " + numeroTexto);
//        


        // switch 
        Scanner entrada = new Scanner (System.in);
        System.out.println("Digite un numero del 1 al 4: ");
        var numero = Integer.parseInt(entrada.nextLine()); // pedimos un numero y pasamos de texto a numero
        var numeroTexto = "Valor desconocido";
        switch (numero) {
            case 1 :
                numeroTexto = "Número uno";
                break;
            case 2 :
                numeroTexto = "Numero dos";
                break;
            case 3 : 
                numeroTexto = "Numero tres";
                break;
            case 4 :
                numeroTexto = "Numero cuatro";
                break;
            default: 
                numeroTexto = "Caso no encontrado"; 
        }
        System.out.println("numeroTexto = " + numeroTexto);
        
        
    }
    
}

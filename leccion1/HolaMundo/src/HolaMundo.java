
import java.util.Scanner;





public class HolaMundo {

    public static void main(String[] args) {
        /* System.out.println("Hola mundo desde java");
        
        int miVariable = 10;
        System.out.println(miVariable);
        miVariable = 5;
        System.out.println(miVariable);
        
        //tipo string
        String miVariableCadena = "Bienvenidos";
        System.out.println(miVariableCadena);
        miVariableCadena = "Sigamos creciendo en programacion";
        System.out.println(miVariableCadena);
         */

        //var-inferencia de tipo en java
        /*var miVariableEntera2 = 10;
        var miVariableCadena2 = "seguimos estudiando";
        System.out.println("miVariableEntera2 = " + miVariableEntera2);
        System.out.println("miVariableCadena2 =" + miVariableCadena2);
        //soutV + tab
        //shift + f6 para ejecutar
        //reglas para definir una vble
        //no empezar con numero, no caracter especial 
        //camelCase, si puede iniciarse con _ $ se puede usar acentos pero 
        //no se recomienda
        var usuario = "Osvaldo";
        var titulo = "Ingeniero";
        var union = titulo + " " + usuario;
        System.out.println("union = " + union);

        var a = 8;
        var b = 4;
        System.out.println(a + b);
        System.out.println(usuario + a + b); // lee de izquierda a derecha
        System.out.println(usuario + (a + b));//alteramos la prioridad con el ()
        //elercicio: caracteres especiales con Java

        var nombre = "Natalia";
        System.out.println("Nueva Linea : \n" + nombre);//salto de linea = \n
        System.out.println("\nNueva Linea : \n" + nombre);
        System.out.println("Tabulacion: \t" + nombre); //espacio de tabulacion \t
        System.out.println("\t.:Menú:."); //centrar una palabra
        System.out.println("\t\t.:Menú:."); //mas tabulacion y mas centrado 
        System.out.println("Retroceso: \b " + nombre); //caracer de retroceso
        System.out.println("Comillas simples: \'"+ nombre+"\'");//incorpora comillas simples al nombre
        System.out.println("Comillas Dobles: \""+ nombre+"\"");//incorpora comillas dobles al nombre
       */
        //Clase Scanner
        /*Scanner entrada = new Scanner(System.in);
        System.out.println("Digite su nombre: ");
        var usuario2 = entrada.nextLine();
        System.out.println("usuario2 = " + usuario2);
        System.out.println("Escriba el titulo: ");
        var titulo2 = entrada.nextLine();
        System.out.println("Resulatado: " + usuario2 +" "+ titulo2);
        */
       /* byte numEnteroByte = 127;
        System.out.println("Valor minimo del Byte"+ Byte.MIN_VALUE); //la clase se escribe con Mayuscula la primer letra Byte
        System.out.println("Valor maximo del Byte"+ Byte.MAX_VALUE);
        
        short numEnteroShort = 10;
        System.out.println("numeroEnteroShort = "+ numEnteroShort);
        System.out.println("Valor minimo del Short"+ Short.MIN_VALUE);
        System.out.println("Valor maximo del Short"+ Short.MAX_VALUE);
        
        int numEnteroInt = 10;
        System.out.println("numeroEnteroInt = "+ numEnteroInt);
        System.out.println("Valor minimo del Int"+ Integer.MIN_VALUE);
        System.out.println("Valor maximo del Int"+ Integer.MAX_VALUE);    
        
        long numEnteroLong = 10;
        System.out.println("numeroEnteroLong = "+ numEnteroLong);
        System.out.println("Valor minimo del long"+ Long.MIN_VALUE);
        System.out.println("Valor maximo del long"+ Long.MAX_VALUE);    
         
        
        float numFloat = 10.0F;  //3.4028235E38 E es de exponente
        System.out.println("numFloat = "+ numFloat);
        System.out.println("Valor minimo del float"+ Float.MIN_VALUE); 
        System.out.println("Valor maximo del float"+ Float.MAX_VALUE);    
         
        double numDouble = 10; 
        System.out.println("numDouble = "+ numDouble);
        System.out.println("Valor minimo del double"+ Double.MIN_VALUE);
        System.out.println("Valor maximo del double"+ Double.MAX_VALUE);    
        */
       // Inferenca  de tipo var y tipo primitivos
       
      /* var numEntero = 20; //las literales sin punto automaticamente son tipo int
        System.out.println("numEntero =" + numEntero);
        var numFloat = 10.0F; // automaticamente con el pnto se transforma en tipo double, ponemos F al final para que sea float
        System.out.println("numFloat = " + numFloat);
        var numDouble = 10.0;
        System.out.println("numDouble = " + numDouble);
        
      
        // Tipos primitivos char
        char miVariableChar = 'a' ;
        System.out.println("miVariableChar = " + miVariableChar);
        
        char varCaracter = '\u0024'; //indicamos a java con el codigo unicode
        System.out.println("varCaracter = " + varCaracter);
        char varCaracterDecimal = 36;  //valor decimal del juego de caracteres unicode
        System.out.println("varCaracterDecimal = " + varCaracterDecimal);
        char varCaracterSimbolo = '$'; // un caracter especial, podemos copiar y pegar desde unicode
        System.out.println("varCaracterSimbolo = " + varCaracterSimbolo);
        
        
        
        
        var varCaracter1 = '\u0024'; //indicamos a java con el codigo unicode
        System.out.println("varCaracter1= " + varCaracter1);
        var varCaracterDecimal1 = 36;  //valor  entero y le asigna un tipo int
        System.out.println("varCaracterDecimal1 = " + varCaracterDecimal1);
        var varCaracterSimbolo1 = '$'; // un caracter especial, podemos copiar y pegar desde unicode
        System.out.println("varCaracterSimbolo1 = " + varCaracterSimbolo1);
                
        int varEnteroChar = '$';
        System.out.println("varEnteroChar = " + varEnteroChar);
        int caracterChar = 'c';
        System.out.println("caracterChar = " + caracterChar);
        
        */
       /*//Tipos primitivos tipos booleanos
      
         boolean varBool = false; // minuscula, diferente a python
         System.out.println("varBool = " + varBool);
         
         if(varBool){
             System.out.println("La Bandera es verde");
         }
         else {
             System.out.println("La bandera es roja");
         }
      
         //Algoritmo es mayor de edad
         var edad = 10;
        // var adulto = edad >= 18;
         if(edad>=18){
             System.out.println("Es mayor de edad");
         }
         else{
             System.out.println("Eres menor de edad");
         }
        */
       //conversion de tipos primitivos
       
       // var edad = Integer.parseInt("20"); //convertir dato str a int
       // System.out.println("edad = " + edad);
       
       
       //var edad = Integer.parseInt("20"); //convertir dato str a int
       //System.out.println("edad = " + (edad + 1);
       
//        var edad = "20";  //vble str
//        var edad = Integer.parseInt("20"); //convertir dato str a int
//        System.out.println("edad = " + (edad + 1));
//        var valorPI =  Double.parseDouble("3.1416");
//        System.out.println("valorPI = " + valorPI);
//       
//      pedir un valor
//      var entrada = new Scanner(System.in);
//        System.out.println("Digite una edad: ") ;
//        edad =  Integer.parseInt ( entrada .nextLine());
//        System.out.println("edad = " + edad);
//        
//      
      // convertir de tipo primitivo en java parte 2
//            var edadTexto = String.valueOf(10);
//            System.out.println("edadTexto = " + edadTexto);
//            
//            var fraseChar = "programadores".charAt(12); // metodo para mostrar el valor que se encuentra en el indice que buscamos en este ejemplo muetsra la "s" porque esta en el indice 12
//            System.out.println("fraseChar = " + fraseChar);
//            
//            System.out.println("Digite un caracter : ");
//            fraseChar = entrada.nextLine().charAt(0); 
//            System.out.println("fraseChar = " + fraseChar);
      
                //inicializar varias variables al mismo tiempo
          /*      
                int num1 = 5, num2 = 4;
                var solucion = num1 + num2;
                System.out.println("solucion de la suma = " + solucion);
                
                solucion = num1 - num2;
                System.out.println("solucion de la resta =  " + solucion);
                
                solucion = num1 * num2;
                System.out.println("solucion de la multiplicación =  " + solucion);
                
                solucion = num1 / num2;
                System.out.println("solucion de la división =  " + solucion);
                
                var solucion2 = 3.4/num2;
                System.out.println("solucion2 Resultado de la división = " + solucion2);
                
                solucion =  num1 % num2;  // guarda el residuo entero de la division 
                System.out.println("solucion = " + solucion);
                
                if (num2 % 2 == 0) 
                    System.out.println("El número es par");
                else
                    System.out.println("El número es impar");
        */       
                int varNum1 = 1,  varNum2  = 4;
                int varNum3 = varNum1 + 6 -  varNum2;
                System.out.println("varNum3 = " + varNum3);
                
                varNum1 +=  1 ;
                 System.out.println("varNum1 = " + varNum1);
                
                 varNum2 -=  2 ;
                 System.out.println("varNum2 = " + varNum2);
                 
                 
                 varNum1 *=  3 ;
                 System.out.println("varNum1 = " + varNum1);
                 
                  varNum3 /=  2 ;
                 System.out.println("varNum3 = " + varNum3);
                 
                 
                  varNum1 %=  6 ;
                  System.out.println("varNum1 = " + varNum1);
                 
                                 
                  
                 
          
      
    }
}


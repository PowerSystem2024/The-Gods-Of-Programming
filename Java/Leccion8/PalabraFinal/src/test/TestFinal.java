
/*
 uso de la palabra final 
Esta palabra tiene diferentes significados dependiendo donde se aplique
Variable: evita cmabiar el valor que almacena la variable
metodo: evita que se modifique la definicion o el comportamiento de un metodo 
                 dede una subclase(hija)
clases; evita que se creen clase hijas
otras caracteristicas es qie normalmente, cuando trabajamos con vbles se combina con el
modificador de acceso estático para convertir una vble en una constante, es decir que no se puede 
modificar su valor, el ejemplo de esto es la clase Math en la cual todos sis atributos son del tipo 
Static y final, es por eso que la vble pi* se conoce como una constante
*/
package test;

import domain.Persona;

public class TestFinal {
    public static void main(String[] args) {
        final int miDni= 30968706;
        System.out.println("miDni = " + miDni);
        // miDni = 29384673 // no se puede modificar
        System.out.println("Mi atributo constante es:   " +Persona.CONSTANTE_AQUI );
        
        final Persona persona1 = new Persona();
      //  persona1 = new Persona(); // no se puede asignar una nueva referencia
      persona1.setNombre("Carina");
      
        System.out.println("persona1 nombre = " +persona1.getNombre());
       persona1.setNombre("Martina");
         System.out.println("persona1 nombre = " +persona1.getNombre());
    }
}

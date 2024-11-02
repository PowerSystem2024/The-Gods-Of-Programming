
package test;

import dominio.Persona;

public class pruebaPersona {
    public static void main(String[] args) {
       Persona persona1 = new Persona("Gabriel", 57.000, false); 
       System.out.println("Persopna1 su nombre es: "+persona1.getNombre());
       System.out.println("persona1: "+persona1);
        //Modificamos a traves de los metodos
        persona1.setNombre("Juan Ignacio");
       // persona1.nombre = "Juan Ignacio" : //ya no se puede utilizar
      //  System.out.println("Nombre es: "+persona.nombre); //error
      
        System.out.println("Persopna1 su nombre modificado: "+persona1.getNombre());
        System.out.println("persona1 el resultado para el sueldo: "+persona1.getSueldo());
        System.out.println("persona1 para obtener el booleano: "+persona1.isEliminado());
        System.out.println("persona1: "+persona1.toString());
         System.out.println("persona1: "+persona1);
    }
    
}


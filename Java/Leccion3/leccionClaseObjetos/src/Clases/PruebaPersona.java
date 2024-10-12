
package Clases;


public class PruebaPersona {
    public static void main(String[] args) {
        Persona persona1 =new Persona(); //llamamos al constructor
        persona1.nombre = "Carina"; //el valos hexadecimal normalmente comienza con 0x
        persona1.apellido = "Londero";
        persona1.obtenerInformacion();
        
        Persona persona2 =new Persona(); 
        System.out.println("persona2 = "+persona2);
        System.out.println("persona1= "+ persona1);
        
        persona2.nombre = "Gabriel"; //el valos hexadecimal normalmente comienza con 0x
        persona2.apellido = "Pellicer";
        persona2.obtenerInformacion(); 
    }
    
}

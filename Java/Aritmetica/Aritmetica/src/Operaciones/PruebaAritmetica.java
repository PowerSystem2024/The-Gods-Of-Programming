
package Operaciones;


public class PruebaAritmetica {
    public static void main(String[] args) {
        Aritmetica aritmetica1 = new Aritmetica();
        aritmetica1.a = 3; //asignamos valor a el atributo a 
        aritmetica1.b = 7;
        aritmetica1.sumarNumeros(); //atraves del objeto llamamos al metoodo
        
        int resultado = aritmetica1.sumarConRetorno();
        System.out.println("resultado = " + resultado);
        
        resultado = aritmetica1.sumarConArgumentos(12, 26);
        System.out.println("Resultado usando argumentos: "+resultado);
    }
    
}

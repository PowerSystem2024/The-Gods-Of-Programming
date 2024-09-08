
package cicloWhile;


public class EjercicioWhile01 {
    public static void main(String[] args) {
        var conteo = 0; //inferencia de tipos
        while (conteo <3){
            System.out.println("conteo = " + conteo);
            conteo ++; //va incrementando la vble
        }           
        var contador = 0;
        do{
            System.out.println("contador = " + contador);
            contador ++;
        }while(contador<=7);
        
        for(var contando=0; contando < 7; contando ++) {
            System.out.println("contando = " + contando);
        }
    }
    
}

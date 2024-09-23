
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
        //uso de la palabra break y continue junto a las etiquetas (labels)
        Inicio:
         for(var contando=0; contando < 7; contando ++) {
             if(contando % 2 == 0){
                System.out.println("contando = " + contando);
                break Inicio;   //imprime el primer numero par y se corta
             }
         }
          for(var contando1=0; contando1 < 7; contando1 ++) {
              if(contando1 % 2 != 0){
                   continue; //vamos a la siguiente iteracion
              }
              System.out.println("contando1 = " + contando1);
          }
          
          //Etiqueta labels
         
        
    }
    
}

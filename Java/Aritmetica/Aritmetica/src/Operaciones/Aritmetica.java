
package Operaciones;

public class Aritmetica { //PAscalCase para clases 
    //atributos de la clase
    int a;
    int b;
    // Metodo
    public void sumarNumeros(){  //publico void es q no va devolver nada cammelCase para metodo y atributos
        int resultado = a + b;
        System.out.println("resultado = " + resultado);
    }
    public int sumarConRetorno(){
        int resultado = a + b; //vble 
        return resultado;
    }
    public int sumarConArgumentos(int arg1, int arg2){
         a = arg1;
         b = arg2;
         //return a + b;
         return sumarConRetorno();
}
}


package test;



public class TestArreglos {
     public static void main(String[] args) {
        int edades[] = new int [3];
        System.out.println("edades = " + edades);
        
        edades[0] = 17;
        System.out.println("edades 0 = "+ edades[0]);
        
        edades[1] = 22;
        System.out.println("edades[1] = " + edades[1]);
        
        edades[2] =18;
        System.out.println("edades 2 = " +  edades[2]);
        
        // edades[3]= 7 ; fuera del rango, error en tiempo de ejecucion
        
        for(int i = 0; i < edades.length; i++){
            System.out.println("Edades y sus elementos"+i+": "+edades[i]);
        }
    }

    
}

/*
    Crea una funcion que devuelva un número aleatorio entre dos numeros 
    enteros que nosotros les demos.

*/
package Otros;

public class FuncionesNumerosAleatorios {
    public static void main(String[]args){
        
        int x=10,y=3,resultado;
        resultado=Math.floorDiv(x, y);
        double resultadoDecimal=(double)x/y - resultado;
        System.out.printf("%.3f",resultado+resultadoDecimal);
        
    }
    
    public static int generarNumAleatorio(int min, int max){
       return (int) Math.floor(Math.random()*(min-(max+1))+(max+1));        
    }
}

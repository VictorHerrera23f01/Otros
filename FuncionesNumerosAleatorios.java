/*
    Crea una funcion que devuelva un número aleatorio entre dos numeros 
    enteros que nosotros les demos.

*/
package Otros;

public class FuncionesNumerosAleatorios {
    public static void main(String[]args){
        
        
    }
    
    public static int generarNumAleatorio(int min, int max){
       return (int) Math.floor(Math.random()*(min-(max+1))+(max+1));        
    }
}

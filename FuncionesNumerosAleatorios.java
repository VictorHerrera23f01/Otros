/*
    Crea una funcion que devuelva un número aleatorio entre dos numeros 
    enteros que nosotros les demos.

*/
package Otros;
import java.util.Scanner;

public class FuncionesNumerosAleatorios {
    public static void main(String[]args){
        Scanner leer=new Scanner(System.in);
        
        int x,y;
        System.out.print("Ingrese el limite inferior: ");
        x=leer.nextInt();
        System.out.print("Ingrese el limite superior: ");
        y=leer.nextInt();
        
        System.out.println("El numero aleatorio entre "+x+" y "+y+" es: "+generarNumAleatorio(x,y));
        
    }
    
    public static int generarNumAleatorio(int min, int max){
       return (int) Math.floor(Math.random()*(min-(max+1))+(max+1));        
    }
}

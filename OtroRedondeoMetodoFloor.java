/*
 */
package Otros;
import java.util.Scanner;

public class OtroRedondeoMetodoFloor {
    public static void main(String[]args){
        Scanner leer=new Scanner(System.in);
        
        int x,y,resultado;
        double resultadoDecimal;
        
        System.out.print("Ingrese el dividendo: ");
        x=leer.nextInt();
        System.out.print("Ingrese el divisor: ");
        y=leer.nextInt();
        
        resultado=Math.floorDiv(x, y);
        resultadoDecimal=(double)x/y - resultado;
        
        //se modifica el "%.nf" para n decimales
        System.out.printf("%.2f",resultado+resultadoDecimal);
        
    }
}

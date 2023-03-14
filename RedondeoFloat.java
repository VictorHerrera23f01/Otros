/*
 */
package Otros;
import java.util.Scanner;

public class RedondeoFloat {
    public static void main(String [] args){
        Scanner leer = new Scanner(System.in);
        
        float numero,valorRedondeado;
        System.out.print("Ingrese un numero con decimales: ");
        numero=leer.nextFloat();           
           /// si aumentamos los ceros del producto aumentamos los decimales
        valorRedondeado=Math.round(numero*100.0f) / 100.0f;
        System.out.println("Valor redondeado: "+valorRedondeado);
    }
}
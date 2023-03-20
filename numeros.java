/*
Escriba un programa que lea 20 números. Si el número leído es igual a cero 
se debe salir del bucle y mostrar el mensaje "Se capturó el numero cero".  
El programa deberá calcular y mostrar el resultado de la suma de los números 
leídos, pero si el número es negativo no debe sumarse. Nota: recordar el uso 
de la sentencia break.

*/
package Otros;

import java.util.Scanner;

/**
 *
 * @author USUARIO
 */
public class numeros {
    public static void main(String []args){
        Scanner leer=new Scanner(System.in);
        
        int i=0,num,suma=0;
        
        do{
            System.out.print("Ingrese el siguiente numero: ");
            num=leer.nextInt();
            
            if(num==0){
                break;
            }else if(num>0){
                suma+=num;
            }
            
            i++;
        }while(i<20);
        
        if (num==0){
            System.out.println("Se capturó el numero CERO!!!");
        }
        
        System.out.println("Suma de numeros: "+suma);
    }
}

/*
    crea una funcion que nos devuelva el numero ASCII de un caracter pasado por 
    parametro.

 */
package Otros;
import java.util.Scanner;

public class CodigoASCIIFunciones {
    public static void main(String[]args){
        Scanner leer=new Scanner(System.in);
        
        int opc;
        char caracter;
        
        do {
            menu();
            System.out.print("Ingrese la opcion: ");
            opc=leer.nextInt();
            if(opc!=1){
                continue;
            }
            System.out.print("Ingrese un caracter a saber su codigo asociado: ");
            caracter = leer.next().charAt(0);

            System.out.println("El caracter: " + caracter + " tiene el codigo " + devuelveCodigoASCII(caracter));
            System.out.println("\n");
        } while (opc!=2);
        
    }
    
    public static int devuelveCodigoASCII(char caracter){        
        return (int) caracter;        
    }
    
    public static void menu(){
        System.out.println("MENU");
        System.out.println("1_Caracter numeracion Codigo ASCII");
        System.out.println("2_Salir");
    }
}

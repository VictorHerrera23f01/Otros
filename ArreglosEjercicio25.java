/*
Realizar un programa que rellene un matriz de 4 x 4 de valores aleatorios y 
muestre traspuesta. ¿Que es una matriz traspuesta?

 */
package Otros;

public class ArreglosEjercicio25 {
    public static void main(String[]args){
        
        int matriz [][]= new int [4][4];
        
        System.out.println("\n Matriz\n");
        for(int i=0; i<4; i++){
            for(int j=0; j<4; j++){
                matriz[i][j]= (int)(Math.random()*10);
                System.out.print(matriz[i][j]+" ");
            }
            System.out.println("");
        }
        
        System.out.println("\n Transpuesta\n");
        for(int i=0; i<4;i++){
            for(int j=0; j<4; j++){
                System.out.print(matriz[j][i]+" ");
            }
            System.out.println("");
        }
    }
}

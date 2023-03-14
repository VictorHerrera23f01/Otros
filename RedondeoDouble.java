/*
 */
package Otros;

import java.math.BigDecimal;
import java.math.RoundingMode;
import java.util.Scanner;

public class RedondeoDouble {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Digite un número: ");
        double numero = scanner.nextDouble();
        BigDecimal valorOriginal = BigDecimal.valueOf(numero);
        // indicamos al newScale atraves del metodo setScale de la clase RoundingMode la cantidad de decimales deseados
        BigDecimal valorRedondeado = valorOriginal.setScale(4, RoundingMode.HALF_UP);
        System.out.println("Valor original: " + valorOriginal);
        System.out.println("Valor redondeado: " + valorRedondeado);
    }
}


package ejerciciof;

import java.util.Scanner;

public class EjercicioF {

    public static void main(String[] args) {
        /*f)Realizar un programa que permita calcular el área de un triángulo. 
        Se recuerda que la fórmula para calcular el área de un triángulo es: 
        (base * altura) / 2. Se debe permitir al usuario ingresar la base y la 
        altura, mientras que el programa  debe calcular el área 
        y mostrar el resultado por pantalla. */
        
        System.out.println("CALCULO DE AREA DE UN TRIANGULO");
        
        System.out.println("Ingrese la base: ");
        Scanner tecladoBase = new Scanner(System.in);
        int base = tecladoBase.nextInt();
        
        System.out.println("Ingrese la altura: ");
        Scanner tecladoAltura = new Scanner(System.in);
        int altura = tecladoAltura.nextInt();
        
        int total = (base * altura) / 2;
        
        System.out.println("El area de su triangulo es: " + total);
        
        
        
    }
    
}

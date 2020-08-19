
package arrays;

import java.util.Scanner;

public class Arrays {

    public static void main(String[] args) {
        int numeros [] = new int  [3];
        Scanner teclado = new Scanner(System.in);
//        numeros[0] = 28;
//        numeros[1] = 35;
//        numeros[2] = 40;
        //carga
         for(int i =0; i< numeros.length; i++){
             System.out.println("Ingrese el numero que quiere en el indice" + i);
             numeros[i] = teclado.nextInt();
             
         }

         System.out.println("-----||-----");
            
        for(int i =0; i< numeros.length; i++){
            
            System.out.println("Estoy en el indice: " + i + " y el valor q esta guardado es: " + numeros[i]);
            
        }
    }
    
}

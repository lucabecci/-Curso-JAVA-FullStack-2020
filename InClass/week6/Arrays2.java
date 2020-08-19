
package array2;

import java.util.Scanner;

public class Array2 {


    public static void main(String[] args) {
        String nombres [] = new String  [3];
        Scanner teclado = new Scanner(System.in);
//        numeros[0] = 28;
//        numeros[1] = 35;
//        numeros[2] = 40;
        //carga
         for(int i =0; i< nombres.length; i++){
             System.out.println("Ingrese el nombre que quiere en el indice" + i);
             nombres[i] = teclado.next();           
         }

         System.out.println("-----|Busqueda|-----");
         
         System.out.println("Ingrese el nombre que quiere buscar ");
         Scanner teclado2 = new Scanner(System.in);
         String nombreBuscar = teclado2.next();
         
        for(int i =0; i< nombres.length; i++){
            
            if (nombreBuscar.equals(nombres[i])){
                System.out.println("Encontre el nombre y esta en la posicion: " + i);
                i = nombres.length;
            }
            
            System.out.println("Estoy en la posicion " + i);
        }
    }
    
}


package matricesejercicio.a;

import java.util.Scanner;


public class MatricesEjercicioA {

    public static void main(String[] args) {
        int arr [][] = new int [4][5];
        System.out.println("Ingrese el numero a cargar en la matriz");
        Scanner teclado = new Scanner(System.in);
        int n = teclado.nextInt();
        
        //carga de n
        for(int f = 0; f < arr.length; f++){
            for(int c = 0; c < 5; c++ ){
                arr[f][c] = n; 
            }    
        }
        //mostrando
        for(int a = 0; a < arr.length; a++){
            System.out.println("Fila" + (a + 1));
            for(int b = 0; b < 5; b++ ){
                System.out.println("columna" + (b + 1));
                System.out.println(arr[a][b]); 
            }    
        }
    }
    
}


package matricesejerciciob;

import java.util.Scanner;


public class MatricesEjercicioB {

    public static void main(String[] args) {
        String razas [][]= new String [3][3];
        int counter = 1;
        Scanner teclado = new Scanner(System.in);
        for(int f = 0; f< razas.length; f++){
            for(int c = 0; c < 3; c++){
                System.out.println("Ingrese la raza de perro a guardar: ");
                razas[f][c] = teclado.nextLine();
            }
        }
        for(int i = 0; i < razas.length; i++){      
            for(int t = 0; t < 3; t++){
                System.out.println("raza " +  counter + ":  " + razas[i][t]);
                counter++;
            }
        }
       
    }
    
}

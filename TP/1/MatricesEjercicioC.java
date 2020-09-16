
package matricesejercicio.c;

import java.util.Scanner;

public class MatricesEjercicioC {

    public static void main(String[] args) {
        double notas [][] = new double [4][4];
        Scanner teclado = new Scanner(System.in);

        for(int f=0; f<4; f++){    
            System.out.println("Por favor ingrese la notas del alumno" +  (f + 1));
            for(int c=0; c<3;c++){
                notas[f][c] = teclado.nextDouble();
            }
        }
        double suma;
        for(int f=0; f<4; f++){    
            suma = 0;
            for(int c=0; c<3;c++){
               suma += notas[f] [c]; 
            }
            notas [f][3] = suma/3;
        }
        for(int f=0; f<4; f++){    
            System.out.println("Las notas del alumno" +  (f + 1) + "fueron: ");
            for(int c=0; c<3;c++){
                System.out.println("Nota" + (c + 1) + " " + notas [f] [c]);
            }
            System.out.println("Y el promedio final es: " + notas [f] [3]);
        }
    }
    
}

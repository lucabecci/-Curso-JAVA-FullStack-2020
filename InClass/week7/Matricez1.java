
package matricez1;

public class Matricez1 {

    public static void main(String[] args) {
        // Declaracion de una matriz
        //el primer [] es para las filas
        //el segundo [] es para las columnas
        int matriz [] [] = new int [4] [8];
        
        //Recorriendo una matriz
        //se utiliza f(filas) y c(columnas)// i y j
        //recorro y voy cargando mi matriz con i
        for( int f=0; f<4; f++){
            for(int c=0; c<8; c++){
                matriz [f] [c] = 1;
            }//cierre primer for
        }//cierre segundo for
    }
}

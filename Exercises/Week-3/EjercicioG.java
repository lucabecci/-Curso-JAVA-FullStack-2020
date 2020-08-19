
package ejerciciog;

import java.util.Scanner;

public class EjercicioG {

    public static void main(String[] args) {
        /*
     g)	Realizar un programa que permita intercambiar el valor de dos variables. 
        Por ejemplo, si la variable1 vale 5 y la variable2 vale 12, hacer que la 
        variable1 valga 12 y la variable2 valga 5. Tener en cuenta que al 
        asignar un valor a una variable se sobrescribe el valor anterior. 
        */
        
        int variable1 = 12;
        int variable2 = 5;
        int variable3 = variable1;
        
        System.out.println("Sus variables en este momento son: V1 = " + variable1 + " || " + "V2 = " + variable2);
        
        System.out.println("Desea intercambiar el valor de las variables?");
        System.out.println("ingrese 1 si quiere intercambiarlas o ingrese 0 si quiere mantenerlas con ese valor");
        
        Scanner tecladoRespuesta = new Scanner(System.in);
        int respuesta = tecladoRespuesta.nextInt();
        
        if(respuesta == 1){
            variable1 = variable2;
            variable2 = variable3;
            System.out.println("Sus variables ahora son: V1 = " + variable1 + " || " + "V2 = " + variable2);
        }else{
            System.out.println("Finalizando programa...");
        }
    }
    
}

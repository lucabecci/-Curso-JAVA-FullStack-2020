
package vectores.ejercicioe;

import java.util.Scanner;

public class VectoresEjercicioE {
    /*
        En tres vectores diferentes se guardan los datos de temperaturas máximas y
    mínimas de 5 ciudades de Misiones. En el primer vector se guardan los
    nombres de las ciudades, en el segundo las temperaturas mínimas alcanzadas
    y en el tercero las temperaturas máximas alcanzadas en la última semana. Se
    necesita un programa que permita la carga de las ciudades, sus temperaturas
    mínimas y máximas; además, deberá poder informar por pantalla cual fue la
    ciudad con la temperatura más baja y cual con la temperatura más alta (dando
    a conocer al mismo tiempo la cantidad de grados).
    */
    public static void main(String[] args) {
        //vector de ciudades
        String ciudades [] = new String [5];
        //vectores de temps bajas y altas
        int bajas [] = new int [5];
        int altas [] = new int [5];
        //auxiliares de alta y baja
        int tempAlta = 0;
        int tempBaja = 0;
        //auxiliares para mostrar que valor del vector ciudades es mayor y menor en temperaturas
        int ciudadMasBaja = 0;
        int ciudadMasAlta = 0;
        
        Scanner teclado = new Scanner(System.in);
        
        System.out.println("CARGUE LAS TEMPERATURAS MINIMAS Y MAXIMAS DE LA SEMANA PARA CADA CIUDAD");
        //guardando datos
        for(int i = 0; i < ciudades.length; i++){           
            //cargamos el vector de ciudades
            System.out.println("Ingrese la ciudad N" + (i + 1) + " de Buenos Aires");
            ciudades[i] = teclado.nextLine();
            //Carga de temperaturas
            for(int t=0;t < 1;t++){
                //carga de temperatura baja
                System.out.println("Ingrese la tempera minima de la ciudad " + ciudades[i]);
                bajas[i] = teclado.nextInt();
                //carga de temperatura alta
                System.out.println("Ingrese la tempera maxima de la ciudad " + ciudades[i]);
                altas[i] = teclado.nextInt();
            }
            System.out.println("///////-----------////////");
        }
        tempBaja = bajas[0];
        tempAlta = altas[0];
        //comparando datos
        
       //Temperatura mas alta
        for(int a = 0; a < altas.length; a++){
            if(altas[a] > tempBaja){
                tempBaja = altas[a];
                ciudadMasAlta = a;                  
            }
        }
        //Temperatura mas baja
        for(int b = 0; b < bajas.length; b++){
            if(bajas[b] < tempBaja){
                tempBaja = bajas[b];
                ciudadMasBaja = b;                  
            }
        }
            
        //mostrando datos      

        System.out.println("///////// RESULTADOS SEMANALES /////////");
        System.out.println("ciudad con la temperatura mas alta " +  ciudades[ciudadMasAlta] + " con: " + tempAlta + " grados");
        System.out.println("ciudad con la temperatura mas baja: " + ciudades[ciudadMasBaja] + " con: " + tempBaja + " grados");
    }
    
}


package ejercicioe;

import java.util.Scanner;

public class EjercicioE {

   
    public static void main(String[] args) {
        /*e)	Realizar un programa que permita a un profesor 
        calcular el promedio de un alumno. Para esto, el algoritmo 
        debe permitir ingresar las 4 notas del mismo
        (por ejemplo, 8, 7, 9.50 y 10), luego calcular el promedio de 
        las mismas y mostrar el resultado por pantalla. 
        Se recuerda que el promedio es la suma de todas las notas 
        dividido la cantidad, en el ejemplo sería: (8+7+9.50+10)/4.*/
        //NOMBRE Y APELLIDO
        System.out.println("|//INGRESE EL NOMBRE DEL ALUMNO//|");
        Scanner tecladoNombre = new Scanner(System.in);
        String  nombre = tecladoNombre.next();
        System.out.println("|//INGRESE EL APELLIDO DEL ALUMNO//|");
        Scanner tecladoApellido = new Scanner(System.in);
        String  apellido = tecladoApellido.next();
        
        //NOTAS
        System.out.println("|//INGRESE LAS CUATRO NOTAS PARA SACAR EL PROMEDIO DEL ALUMNO//|");      
        
        System.out.println("Primer nota:");
        Scanner inputN1 = new Scanner(System.in);
        float nota1 = inputN1.nextFloat();
        
        System.out.println("Segunda nota:");
        Scanner inputN2 = new Scanner(System.in);
        float nota2 = inputN2.nextFloat();
        
        System.out.println("Tercera nota:");
        Scanner inputN3 = new Scanner(System.in);
        float nota3 = inputN3.nextFloat();
        
        System.out.println("Cuarta nota:");
        Scanner inputN4 = new Scanner(System.in);
        float nota4 = inputN4.nextFloat();
        
        float valorFinal = (nota1 + nota2 + nota3 + nota4) / 4;
        
        System.out.println("La nota del " + nombre + " " + apellido + " es: " + valorFinal);
        
        


    }
    
}

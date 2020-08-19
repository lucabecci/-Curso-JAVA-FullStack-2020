/*
    LUCA BECCI GITHUB
   1) Una pequeña despensa desea calcular los sueldos de sus empleados. Los puestos
   de los mismos pueden tener 3 categorías: 1- repositor, 2-cajero y 3-supervisor.
   a) Los repositores cobran $15.890 + un bono de 10%.
   b) Los cajeros cobran $25.630,89 fijos.
   c) Los supervisores cobran $35.560,20 en bruto al cual se les descuenta un 11%    
   de jubilación.
   Se necesita un programa que, dependiendo el tipo de empleado del que se trate,
   calcule y muestre en pantalla el correspondiente sueldo.
 */
package condicionales1;

import java.util.Scanner;

public class Condicionales1 {

    public static void main(String[] args) {
        System.out.println("Ingrese el numero de categoria del empleado ||1-repositor, 2-cajero y 3-supervisor||: ");
        Scanner entradaTeclado = new Scanner(System.in);
        int empleado = entradaTeclado.nextInt();
        
        double resultado = 0; //valor del sueldo
        String mensaje = "El sueldo del empleado es: ";//mensaje para el sueldo
        
        if(empleado == 1){
            resultado = 15.890 + (15.890 * 0.10);
            System.out.println(mensaje + resultado);
        }else if(empleado == 2){
            resultado = 25.631;
            System.out.println(mensaje + resultado);
        }else if(empleado == 3){
            resultado = 35.560 - (35.560 * 0.11);
            System.out.println(mensaje + resultado);
        }else{
            mensaje = "El numero de empleado es invalido.";
            System.out.println(mensaje);     
        }
    }
    
}

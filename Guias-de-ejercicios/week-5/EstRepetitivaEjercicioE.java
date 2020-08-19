/*
LUCA BECCI GITHUB
Un gerente de una empresa prestadora de servicios de internet necesita un
algoritmo que permita realizar el cálculo del monto a pagar de la factura
de consumo de internet de 5 clientes de una empresa. Para ello, el algoritmo
debe solicitar por teclado dos datos: Dni del cliente y tipo de servicio.
Los tipos de servicio son 3:
1. Internet 30 megas (cuyo valor es de $750 – 10% de descuento)
2. Internet 50 megas (Cuyo valor es de $930 – 5% de descuento)
3. Internet 100 megas (Cuyo valor fijo es de $1200)
El algoritmo debe poder calcular el monto a pagar (dependiendo del tipo de
servicio con el que cuente el cliente) e informar por pantalla el dni del
mismo junto con el monto a pagar y el número de servicio con el que cuenta.
 */
package estrepetitivaejercicioe;

import java.util.Scanner;

public class EstRepetitivaEjercicioE {

    public static void main(String[] args) {
        int counter = 1;
        
        while( counter <= 5){
            //DNI
            System.out.println("Ingrese su DNI(sin puntos): ");
            Scanner teclado = new Scanner(System.in);
            int dni = teclado.nextInt();
            //tipo de servicio
            System.out.println("Ingrese el numero de su tipo de servicio: ");
            Scanner teclado2 = new Scanner(System.in);
            int categoria = teclado2.nextInt();
            
            double precio = 0;
            
            
            
            if(categoria == 1){
                precio = 750 - (750 * 0.10);
                System.out.println("Dni Del Cliente: " + dni);
                System.out.println("Su servicio es de Internet 30 megas");
                System.out.println("Valor a pagar: " + precio);
            }else if(categoria == 2){
                precio = 930 - (930 * 0.05);
                System.out.println("Dni Del Cliente: " + dni);
                System.out.println("Su servicio es de Internet 50 megas");
                System.out.println("Valor a pagar: " + precio);
            }else if(categoria == 3){
                precio = 1200;
                System.out.println("Dni Del Cliente: " + dni);
                System.out.println("Su servicio es de Internet 100 megas");
                System.out.println("Valor a pagar: " + precio);
        }else{
                System.out.println("Tipo de servicio incorrecto.");
                counter--;
            }
            
            counter++;
        }
            
    }
    
}


package condicionalesejercicio;

import java.util.Scanner;

public class CondicionalesEjercicio {

    public static void main(String[] args) {
        
//        int tipo = 0;
//        double sueldo = 0;
//        System.out.println("Por favor ingrese la categoria del empleado...");
//        
//        Scanner teclado = new Scanner(System.in);
//        tipo = teclado.nextInt();
//        
//        if( tipo == 1){
//            sueldo = 15890 + (15890 * 0.10);
//            System.out.println("El sueldo del repositor es:" + sueldo);
//        }else {
//            if( tipo == 2){
//            sueldo = 25630.89;
//            System.out.println("El sueldo del cajero es:" + sueldo);
//        } else{
//                if( tipo == 3){
//            sueldo = 35560.20 + (35560.20 * 0.11);
//            System.out.println("El sueldo del supervisor es:" + sueldo);
//        }else{
//                    System.out.println("El numero ingresado no es correcto");
//                }
//            }
//        }


    //EJERCICIO REPETITIVO DE CLIENTES
    
    String dni;
    double monto;
    int servicio, cont = 0;
    
    while(cont < 5){
        System.out.println("Ingrese su dni");
        Scanner teclado = new Scanner(System.in);
        dni = teclado.next();
        
        System.out.println("Ingrese su tipo de servicio");
        Scanner teclado2 = new Scanner(System.in);
        servicio = teclado.nextInt();
        
        
        if( servicio == 1){
            monto = 750 - (750*0.10);
            System.out.println("El dni " + dni + " debe de abonar el monto de :" + monto);
        }else{
            if(servicio == 2){
                monto = 930 - (930*0.05);
                System.out.println("El dni " + dni + " debe de abonar el monto de :" + monto);
            }else{
                if(servicio == 3){
                    monto = 1200;
                    System.out.println("El dni " + dni + " debe de abonar el monto de :" + monto);
                }else{
                    System.out.println("Tipo de servicio incorrecto.");
                }
            }
        }
        cont ++;
    }
    
        
        
        
       
    }
    
}

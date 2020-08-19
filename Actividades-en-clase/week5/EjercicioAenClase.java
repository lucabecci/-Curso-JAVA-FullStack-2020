/*
LUCA BECCI GITHUB
a.Declarar una variable de tipo entero, otra de tipo double y otra de tipo
String.
b.Asignar un valor a la variable de tipo entero y asignar esta última a
la variable de tipo double. ¿Existe un error? ¿Se puede hacer esta
operación?
c.Asignar un valor a la variable de tipo double y asignar esta última a
la variable de tipo entero. ¿Existe un error? ¿Se puede hacer esta
operación?
d.Asignar el valor 35 a la variable de tipo String. ¿Existe un error? ¿Se
puede hacer esta operación?
e.Si quiero almacenar el número 48 en la variable String. ¿Cómo debo
realizar la asignación?
 */
package ejercicioa;

public class EjercicioA {

    public static void main(String[] args) {
//        int var1 = 34;
//        double var2 = var1;
//        String var3 = "Hello World";
//        System.out.println(var2);
        
        /*B) Si se puede asignar el valor de var1(int) a var2(double)solo que siempre
        tendra un "X.0" al final por el tipo de var2*/
        
//        double var2 = 10.05;
//        int var1 = var2;
//        String var3 = "Hello World";
//        System.out.println(var1);
        
        /*C) No se puede mutar el valor de var1 por el de var2 porque var1 es de
        tipo int y no espera numeros con coma.*/
        
        /*D)No se puede asignar el valor de 35 a var3(Strin) porque este espera
        cadena de caracteres, se podria llegar a almacenarlo si se encerrara 
        entre"" pero no seria int, seria Str.*/
        
        /*E)La forma de almacenar el valor 48 en una variable String es la sig:*/
        String strNum = "35";
        System.out.println("Demostracion: " + strNum);
    }
    
}

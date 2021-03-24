
import java.util.Scanner;


public class conversionTipos {
    public static void main(String[] args) {
        //Convertir un tipo String a un tipo int
        var edad = Integer.parseInt("20");
        //var edad="20";
        System.out.println("edad = " + (edad +1));
        //Convertir un tipo String a un tipo double
        var valorPI = Double.parseDouble("3.1416");
        System.out.println("valorPI = " + valorPI);
        
        //Pedir un valor
        var consola = new Scanner(System.in);
//        System.out.println("Proporciona tu edad:");
//        edad = Integer.parseInt(consola.nextLine());
//        System.out.println("edad = " + edad);
        
//Convertir tipo int a String 
        var edadTexto= String.valueOf(252);
        System.out.println("edadTexto = " + edadTexto);
 //recuperar un caracter de una cadena
  var caracter = "hola".charAt(1);
        System.out.println("caracter = " + caracter);
        
        System.out.println("Proporcione un caracter");
        caracter = consola.nextLine().charAt(0);
        System.out.println("caracter = " + caracter);
         
    }
}

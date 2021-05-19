
import java.util.Scanner;


public class HolaMundo {
    public static void main(String[] args) {
        

       var edad = Integer.parseInt("20");
        System.out.println("edad = " + (edad+1));
       var PI = Double.parseDouble("3.1416");
        System.out.println("PI = " + PI);
       // pedir un valor 
       
     Scanner consola = new Scanner(System.in);
//        System.out.println("Proporcine su edad:");
//     var valor = Integer.parseInt(consola.nextLine());
//        System.out.println("valor = " + valor);   
//        
        
        var edadTexto = String.valueOf(25);
        System.out.println("edadTexto = " + edadTexto);
        
        var caracter="hola".charAt(1);
        System.out.println("Proporcione un caracter");
        caracter = consola.nextLine().charAt(0);
        System.out.println("caracter = " + caracter);
    }
}

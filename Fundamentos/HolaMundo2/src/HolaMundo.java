
import java.util.Scanner;


public class HolaMundo {

    public static void main(String[] args) {

      int numero1,numero2;
      Scanner consola = new Scanner(System.in);
        System.out.println("Proporcione el numero1");
        numero1 = Integer.parseInt(consola.nextLine());
       
        System.out.println("Proporcione el numero2");
         numero2 = Integer.parseInt(consola.nextLine());
        var mayor = numero1 >numero2 ? numero1:numero2;
        System.out.println("El numero mayor es: "+ mayor);
                 
    }
}

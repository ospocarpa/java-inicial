
import java.util.Scanner;


public class mayor2Numeros {
    public static void main(String[] args) {
       Scanner leer = new Scanner(System.in);
        System.out.println("Proporciona el numero1:");
        int numero1 = Integer.parseInt(leer.nextLine());
        System.out.println("Proporciona el numero2:");
        int numero2 = Integer.parseInt(leer.nextLine());
       var numeroMayor=numero1 >numero2?numero1:numero2;
       System.out.println("numeroMayor = " + numeroMayor);
    }
}
 
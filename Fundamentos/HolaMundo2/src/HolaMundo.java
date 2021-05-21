
import java.util.Scanner;


public class HolaMundo {

    public static void main(String[] args) {

      int alto,ancho;
      Scanner consola = new Scanner(System.in);
        System.out.println("Proporcione el alto");
        alto = Integer.parseInt(consola.nextLine());
       
        System.out.println("Proporcione el ancho");
         ancho = Integer.parseInt(consola.nextLine());
        System.out.println("Area: "+alto*ancho);
        System.out.println("Perimentro: "+(alto+ancho)*2);
                 
    }
}

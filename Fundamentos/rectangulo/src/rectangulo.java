
import java.util.Scanner;

public class rectangulo {

    public static void main(String[] args) {
        var leer = new Scanner(System.in);

        System.out.println("Proporciona el alto");
        var alto = Integer.parseInt(leer.nextLine());

        System.out.println("Proporciona el ancho");
        var ancho = Integer.parseInt(leer.nextLine());

        System.out.println("Area: " + alto * ancho);
        System.out.println("Perimetro: " + (alto + ancho) * 2);

    }
}

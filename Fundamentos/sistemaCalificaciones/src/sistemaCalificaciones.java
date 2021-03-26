
import java.util.Scanner;

public class sistemaCalificaciones {

    public static void main(String[] args) {
        System.out.println("Proporcione un valor entre 0 y 10");
        Scanner leer = new Scanner(System.in);
        float valor = Float.parseFloat(leer.nextLine());
        if (valor <= 10 && valor >= 0) {
            if (valor < 6) {
                System.out.println("F");
            } else if (valor < 7) {
                System.out.println("D");
            } else if (valor < 8) {
                System.out.println("C");
            } else if (valor < 9) {
                System.out.println("B");
            } else {
                System.out.println("A");
            }
        } else {
            System.out.println("Valor desconocido");

        }

    }
}

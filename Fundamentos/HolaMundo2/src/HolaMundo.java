
import java.util.Scanner;


public class HolaMundo {
    public static void main(String[] args) {
        
        Scanner consola = new Scanner(System.in);
        System.out.println("Escribe tu nombre");
        var nombre = consola.nextLine();
        System.out.println("nombre = " + nombre);
        System.out.println("Escribe un titulo");
        var titulo = consola.nextLine();
        System.out.println("resultado = " + titulo + " "+nombre);
        
            
    }
    
    
}

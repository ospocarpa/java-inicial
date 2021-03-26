
import java.util.Scanner;


public class tiendaLibros {
    public static void main(String[] args) {
        
        var consola = new Scanner(System.in);
        
        System.out.println("Proporcione el nombre:");
        String nombre= consola.nextLine();
        
        System.out.println("Proporcione el id:");
        int id=Integer.parseInt(consola.nextLine());
        
        System.out.println("Proporciona el precio:");
        double precio=Double.parseDouble((consola.nextLine()));
       
        System.out.println("Proporciona el envio gratuito:");
        boolean envioGratuito=Boolean.parseBoolean((consola.nextLine()));
       
        System.out.println(nombre +" #"+ id );
        System.out.println("Precio: $"+precio);
        System.out.println("Envio Gratuito: "+envioGratuito);
    
    }
}

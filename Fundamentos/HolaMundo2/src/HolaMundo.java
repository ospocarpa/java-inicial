
import java.util.Scanner;


public class HolaMundo {
    public static void main(String[] args) {
        

//Debes imprimir la información en el siguiente formato:
//
//    Proporciona el titulo:
//    Proporciona el autor:
//    <titulo> fue escrito por <autor>

        String titulo;String autor;
        Scanner consola = new Scanner(System.in);
        System.out.println("Proporcione el titulo");
        titulo =consola.nextLine();
         System.out.println("Proporcione el autor");
        autor = consola.nextLine();
        System.out.println(titulo + " fue escrito por " +autor);

            
    }
    
    
}

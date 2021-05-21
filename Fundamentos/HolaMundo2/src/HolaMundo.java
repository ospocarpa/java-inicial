
import java.util.Scanner;


public class HolaMundo {

    public static void main(String[] args) {

      int numero;
      var numeroTexto = "valor desconocido";
      Scanner consola = new Scanner(System.in);
        System.out.println("Ingrese un numero");
      numero = Integer.parseInt(consola.nextLine());
      
      switch(numero) {
          case 1:
              numeroTexto="numero uno";
         
              break;
           case 2:
              numeroTexto="numero dos";
              break;
               case 3:
              numeroTexto="numero tres";
              break;
               case 4:
              numeroTexto="numero cuatro";
              break;
               default :
                   numeroTexto = "numero no coincide";
                   
      }
        System.out.println("numeroTexto = " + numeroTexto);
    
                 
    }
}

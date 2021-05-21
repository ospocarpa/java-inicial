
import java.util.Scanner;


public class HolaMundo {

    public static void main(String[] args) {
        
        System.out.println("Usando break");
        for(int i=0;i<6;i++) {
            if(i%2 == 0  ) {
                System.out.println("i = " + i);
                break;
            }
        }
        System.out.println("Usando continue");
        for(int i =0;i<6;i++) {
            if(i%2 != 0) {
                continue;
            }
            System.out.println("i = " + i);
        }
    
                 
    }
}

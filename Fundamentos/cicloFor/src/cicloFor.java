
public class cicloFor {
    public static void main(String[] args) {
        for(int contador=0;contador<3;contador++){
            System.out.println("contador = " + contador);
  
        }
        // uso de break 
        System.out.println("----pares------");
        //imprimir pares
        for(int contador=0;contador<3;contador++){
            if(contador %2==0) {
            System.out.println("contador = " + contador);
  
        }
        }
            //imprimir 1ªpar
              System.out.println("----1ªpar------");
              for(int contador=0;contador<3;contador++){
                  if(contador %2==0){
                      System.out.println("contador = " + contador);
                      break;
                  }
              }
              System.out.println("-----Pares(con continue)-----");
               for(int contador=0;contador<3;contador++){
                  if(contador %2 !=0){
                      
                     continue;
                  }
                  System.out.println("contador = " + contador);
              }
        }
    }


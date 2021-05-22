
package operaciones;


public class Aritmetica {
      int a, b;
      public void sumar() {
          int resultado = a+b;
          System.out.println("resultado = " + resultado);
      }
      public int sumarConRetorno() {
          return a+b;
      }
      
      public int sumarConArgumentos(int x ,int y) {
          a=x;
          b=y;
          return sumarConRetorno();
      }
      
      
      
}

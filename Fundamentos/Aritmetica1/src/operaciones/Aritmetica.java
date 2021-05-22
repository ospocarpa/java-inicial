
package operaciones;


public class Aritmetica {
      int a, b;
      public void sumar() {
          int resultado = this.a+this.b;
          System.out.println("resultado = " + resultado);
      }
      public int sumarConRetorno() {
          return this.a+this.b;
      }
      
      public int sumarConArgumentos(int a ,int b) {
          this.a=a;
          this.b=b;
          return sumarConRetorno();
      }
      //constructor
      public Aritmetica() {
          System.out.println("Ejecutando constructor");
}
      public Aritmetica(int a ,int b) {
          System.out.println("Ejecutando construcctor con argumentos");
          this.a = a;
          this.b = b;
          
      }
      
}


package pasoporvalor;


public class PasoPorValor {
    public static void main(String[] args) {
      var a =5;
      System.out.println("a = " + a);
      cambiarValor(a);
        System.out.println("a = " + a);
    }
    public static void cambiarValor(int arg) {
        arg=15;
        System.out.println("arg = " + arg);
    }
}

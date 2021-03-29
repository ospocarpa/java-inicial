
package operaciones;

public class PruebaAritmetica {
    public static void main(String[] args) {
        // variables locales
        var a=10;
        var b=2;
        miMetodo();
        
        
        Aritmetica aritmetica1= new Aritmetica();
        System.out.println("aritmetica1 a:"+aritmetica1.a);
          System.out.println("aritmetica1 b:"+aritmetica1.b);
          
        Aritmetica aritmetica2 = new Aritmetica(5, 8);
        System.out.println("aritmetica2 a:"+aritmetica2.a);
          System.out.println("aritmetica2 b:"+aritmetica2.b);
        
 
    }
    
    // los metodos estaticos solo pueden ser accedidos por 
    // otros metodos estaticos
    public static void miMetodo() {
        System.out.println("Ejecutando otro metodo");
        //la variable esta fuera del alcance donde fue definida
        // a=10;
    }
}

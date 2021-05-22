
package operaciones;


public class PruebaAritmetica {
    public static void main(String[] args) {
        Aritmetica aritmetica1 = new Aritmetica();
        aritmetica1.a=5;
        aritmetica1.b=12;
        aritmetica1.sumar();
        aritmetica1.a=10;
        int resultado = aritmetica1.sumarConRetorno();
        System.out.println("resultado = " + resultado);
        resultado =aritmetica1.sumarConArgumentos(8, 88);
        System.out.println("resultado = " + resultado);
    }
    
}

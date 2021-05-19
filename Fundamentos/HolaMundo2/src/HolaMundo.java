



public class HolaMundo {
    public static void main(String[] args) {
    
        int a =3,b=2;
        var resultado = a +b;
        System.out.println("resultado = " + resultado);
        resultado =a-b;
        System.out.println("resultado = " + resultado);
        resultado = a*b;
        System.out.println("resultado = " + resultado);
        var resultado2=(double)a /b;
        System.out.println("resultado2 = " + resultado2);
        resultado = a%b;
        System.out.println("resultado = " + resultado);
        if(a %2 == 0)
            System.out.println(a + " Es par");
        else
            System.out.println(a +" es impar");
    }
}

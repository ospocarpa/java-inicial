
public class HolaMundo {

    public static void main(String[] args) {

        var resultado = 5 > 4 ? "verdadero" : "falso";
        System.out.println("resultado = " + resultado);

        int numero = 4;
        resultado = (numero % 2 == 0) ?"Es par":"Es impar";
        System.out.println("resultado = " + resultado);
    }
}

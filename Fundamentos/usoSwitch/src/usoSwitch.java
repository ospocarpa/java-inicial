
public class usoSwitch {

    public static void main(String[] args) {
        var mes = 13;
        var estacion = "Estacion desconocida";
        switch (mes) {
            case 1: case 2 : case 12:
                estacion = "Verano";
                break;
            case 3: case 4 : case 5 :
                estacion = "Otonio";
                break;
            case 6: case 7 :case 8:
                estacion = "Invierno";
                break;
            case 9: case 10 : case 11:
                estacion= "Primavera";
                break;
            default:
                estacion = "Mes no vailido";

        }
        System.out.println("estacion = " + estacion);
    }
}

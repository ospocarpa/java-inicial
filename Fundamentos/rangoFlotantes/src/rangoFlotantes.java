
public class rangoFlotantes {

    public static void main(String[] args) {
        //tipo primitivo de tipo flotante :float,double
        float numeroFlotante = 10.0F;
        float otroFlotante = (float) 10.0;
        float unFlotante=3.402823E38F; //valor maximo a soportar
        float valorNoSoportado=(float)3.4028236E38D;
        System.out.println(numeroFlotante);
        System.out.println("otroFlotante = " + otroFlotante);
        System.out.println("unFlotante = " + unFlotante);
        System.out.println("valorNoSoportado = " + valorNoSoportado);
        System.out.println("rango minimo flotante: " + Float.MIN_VALUE);
        System.out.println("rango maximo flotante: " + Float.MAX_VALUE);
        System.out.println("____________________________");
        double numeroDouble = 1.7976931348623157E308;
        System.out.println("numeroDouble =       " + numeroDouble);
          System.out.println("rango minimo double: " + Double.MIN_VALUE);
        System.out.println("rango maximo double: " + Double.MAX_VALUE);
    }

}

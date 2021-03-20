
public class rangoEnteros {

    public static void main(String[] args) {
        byte tipoByte = 10;
        byte tipoByte2 = (byte) 130;  // que paso con este valor que se pasa del rango?

        System.out.println("rango minimo byte: " + Byte.MIN_VALUE);
        System.out.println("rango maximo byte: " + Byte.MAX_VALUE);
        System.out.println("tipoByte:          " + tipoByte);
        System.out.println("tipoByte2:         " + tipoByte2);
        System.out.println("____________________________");
        short numeroShort = (short)32768;
        System.out.println("numeroShort =       " + numeroShort);
        System.out.println("rango minimo short: " + Short.MIN_VALUE);
        System.out.println("rango maximo short: " + Short.MAX_VALUE);
        System.out.println("____________________________");
        int numeroInt =(int)2147483648L;// las literales son de tipo int 
        // para convertirla a tipo long se agrega una L al final 
        System.out.println("numeroInt =         " + numeroInt);
        System.out.println("rango minimo int:   " + Integer.MIN_VALUE);
        System.out.println("rango maximo int:   " + Integer.MAX_VALUE);
        System.out.println("____________________________");
        long numeroLong = 9223372036854775807L; // para convertir a 
        System.out.println("numeroLong =        " + numeroLong);
        System.out.println("rango minimo long:   " + Long.MIN_VALUE);
        System.out.println("rango maximo long:   " + Long.MAX_VALUE);
        
        
        
        
    }
}

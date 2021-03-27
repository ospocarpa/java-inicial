
package clases;

public class PruebaPersona {
    public static void main(String[] args) {
        Persona persona1 = new Persona();
        persona1.nombre = "Juan";
        persona1.apellido = "Perez";
        persona1.desplegarInformacion();
        
        Persona persona2 = new Persona();
        // despues del @ me indica en que posicion de la memoria esta el objeto
        // y eso se lo asigno a nuestra variable
        System.out.println("persona1 = " + persona1);
        System.out.println("persona2 = " + persona2);
        persona2.desplegarInformacion();
        persona2.nombre = "Luis";
        persona2.apellido= "Aragonez";
        persona2.desplegarInformacion();
    }
}

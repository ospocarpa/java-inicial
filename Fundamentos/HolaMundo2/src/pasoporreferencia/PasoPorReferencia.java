
package pasoporreferencia;

import clases.Persona;

public class PasoPorReferencia {
    public static void main(String[] args) {
        Persona persona1 = null;
        Persona persona2 =new Persona();
        
        //System.out.println("persona1 nombre = " + persona1.nombre);
        persona1= cambiarValor(persona1);
      //  persona1.datosPersona();  //me tira error porque la variable no hace referencia a ningun objeto Persona
        persona2 = cambiarValor(persona2);
        persona2.datosPersona();
        //System.out.println("persona1 nombre = " + persona1.nombre);
    }
    public static Persona cambiarValor(Persona persona) {
        if (persona == null) {
            System.out.println("Valor de persona invalido");
            return null;
        }
        else{
            persona.nombre="Karla";
            return persona;
        }
    }
}

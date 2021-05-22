
package palabrathis;

public class PalabraThis {
    public static void main(String[] args) {
        Persona persona1 = new Persona("Juan","Perez");
        System.out.println("persona1 = " + persona1);
        System.out.println(" persona1 nombre = " +  persona1.nombre);
        System.out.println(" persona1 apellido = " +  persona1.apellido);
    }
}
// En un archivo solo puedo tener una clase publica
   //esta clase y constructor solo puedo usar dentro del mismo package que fue
 //definido 
 class Persona {
     String nombre;
     String apellido;
     Persona(String nombre,String apellido)  {
         this.nombre = nombre;
         this.apellido = apellido;
     }
    
}

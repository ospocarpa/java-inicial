
package palabrathis;

public class PalabraThis {
    public static void main(String[] args) {
       Persona persona = new Persona("Juan","Perez");
        System.out.println("persona = " + persona);
        System.out.println("persona.nombre = " + persona.nombre);
        System.out.println("persona.apellido = " + persona.apellido);
    }
}
class Persona {
    String nombre;
    String apellido;
    
    Persona(String nombre,String apellido) {
        //super(); llamada al constructor de la clase Padre (object)
        this.nombre = nombre;
        this.apellido = apellido;
        System.out.println("objeto persona usando this: " + this);
        // Imprimir imprimir = new Imprimir(),
        new Imprimir().imprimir(this); // se le pasa una ref.de tipo persona
    }
}
class Imprimir {
    
    public Imprimir() {
        super();//el constructor de la clase object(padre) para 
                // reservar memoria . (se hace automatico no es necesario estas lineas)
    }
    
    public void imprimir(Persona persona) {
        System.out.println("persona desde imprimir: " + persona);
        System.out.println("impresion del objeto actual(this):" + this);
    }
}

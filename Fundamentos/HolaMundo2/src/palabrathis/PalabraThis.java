
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
//
 class Persona {
     String nombre; //estos atributos se conocen como default o package
     String apellido;
     Persona(String nombre,String apellido)  {
         //super() :llamada al constructor de la clase padre(Object)
         this.nombre = nombre;
         this.apellido = apellido;
         System.out.println("Objeto persona usando this:"+this);
         new Imprimir().imprimir(this); //Imprmir imprimir= new Imprimir()  ---> equivalente
     }
    
}
class Imprimir {
    // su constructor vacio llama al constructor de la clase object (con super() para reservar memoria
    // todo lo hace implicitamente
    /* 
      public Imprimir() {
        super();
    }
    */
    
    public void imprimir(Persona persona) {
        System.out.println("persona desde imprimir: "+persona);
        System.out.println("Impresion del objeto actual(this) "+ this);
    }
}

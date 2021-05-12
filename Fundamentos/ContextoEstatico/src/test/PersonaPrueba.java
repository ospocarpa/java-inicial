
package test;

import domain.Persona;


public class PersonaPrueba {
    
    private int contador;
    
    public static void main(String[] args) {
        Persona persona1 = new Persona("Juan");
        Persona persona2 = new Persona("Karla");
        imprimir(persona1);
        imprimir(persona2);
        //this.contador = 10; //error 
    }
    // public void imprimir(Persona persona) : error --metodos estaticos deben
    // ser llamados por metodos estaticos
    // this no puede ser referenciada en un contexto estatico
    // contexto estatico no puede acceder al contexto dinamico (al revez si vale)
    public static void imprimir(Persona persona) 
    {
        System.out.println("persona = " + persona);
    }
    //este es un metodo dinamico
    //si puede acceder a los metodos o atributos estaticos de nuestra clase
    public int getContador() {
        imprimir(new Persona("Carlos"));
        return this.contador;
    }
}

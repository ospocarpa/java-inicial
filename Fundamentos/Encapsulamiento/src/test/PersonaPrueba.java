
package test;

import dominio.Persona;
public class PersonaPrueba { //hola
    public static void main(String[] args) {
        Persona persona1 = new Persona("Juan",5000.00,false);
        System.out.println("persona1 nombre: "+persona1.getNombre());
        persona1.setNombre("Jose Maria");
        //persona.nombre = "jose maria" //ya no es valido nuestro atributo es privado
        System.out.println("persona1 nombre con cambio: " +persona1.getNombre());
        System.out.println("persona1 sueldo: " +persona1.getSueldo());
        System.out.println("persona1 eliminado: " +persona1.isEliminado());
        
    }
}

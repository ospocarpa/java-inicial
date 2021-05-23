
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
        System.out.println("--------------------------");
        Persona persona2= new Persona("Oscar Hinojosa",80000,false);
        System.out.println("persona2 nombre: "+persona2.getNombre());
        System.out.println("persona2 sueldo: "+persona2.getSueldo());
        System.out.println("persona2 eliminado: "+persona2.isEliminado());
        persona2.setNombre("NIcole martinez");
        persona2.setSueldo(50000);
        persona2.setEliminado(true);
        System.out.println("----");
         System.out.println("persona2 nombre con cambio: " +persona2.getNombre());
        System.out.println("persona2 sueldo con cambio: " +persona2.getSueldo());
        System.out.println("persona2 eliminado con cambio: " +persona2.isEliminado());
       
        
        
    }
}

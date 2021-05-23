
package test;

import dominio.Persona;
public class PersonaPrueba { //hola
    public static void main(String[] args) {
        Persona persona1 = new Persona("Juan",5000.00,false);
        System.out.println("persona1:" + persona1.toString());
        persona1.setNombre("Jose Maria");
        
        System.out.println("persona1: "+persona1.toString());
         
        System.out.println("--------------------------");
        Persona persona2= new Persona("Oscar Hinojosa",80000,false);
        System.out.println("persona2 = " + persona2.toString());
        persona2.setNombre("NIcole martinez");
        persona2.setSueldo(50000);
        persona2.setEliminado(true);
        System.out.println("----");
        System.out.println("persona2 = " + persona2.toString());
       
        
        
    }
}

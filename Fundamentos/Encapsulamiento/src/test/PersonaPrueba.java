
package test;

import dominio.Persona;
        
public class PersonaPrueba {
    public static void main(String[] args) {
        Persona persona1 = new Persona("Juan",5000.00,false);
         System.out.println("persona1 nombre  = " + persona1.getNombre());
        persona1.setNombre("Juan Carlos");
      
        //persona1.nombre ="juan carlos"; 
        // ya no se puede modificar directamente el atributo de nuestra clase
       // System.out.println("nombre= " + persona1.nombre  );
        System.out.println("persona1 nombre con cambio:" + persona1.getNombre() );
        System.out.println("persona1 sueldo  = " + persona1.getSueldo());
        System.out.println("persona1 eliminado  = " + persona1.isEliminado());
        System.out.println("-------------------------");
        Persona persona2 = new Persona("Oscar", 0.00,true);
        System.out.println("persona2 nombre= " + persona2.getNombre());
           System.out.println("persona2 sueldo= " + persona2.getSueldo());
              System.out.println("persona2 eliminado= " + persona2.isEliminado());
        System.out.println("MOdificando datos de persona2");
        persona2.setNombre("Juan Cristian");
        persona2.setSueldo(20000.00);
        persona2.setEliminado(false);
        System.out.println("persona2 nombre con cambio:" + persona2.getNombre() );
        System.out.println("persona2 sueldo con cambio  = " + persona2.getSueldo());
        System.out.println("persona2 eliminado con cambio  = " + persona2.isEliminado()); 
        
        
        
       
     }
}

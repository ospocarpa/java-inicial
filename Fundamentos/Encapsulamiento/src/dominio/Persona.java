
package dominio;


public class Persona {
    private String nombre;
    private double sueldo;
    private boolean eliminado;
    
    public Persona(String nombre,double sueldo,boolean eliminado) {
        this.nombre = nombre;
        this.sueldo = sueldo;
        this.eliminado = eliminado;     
    }
    //recupera info.de atributo de nombre
    public String getNombre() {
        return this.nombre;
    }
    //modifica informacion del atributo de nombre
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    public double getSueldo() {
        return this.sueldo;
    }
    public void setSueldo(double sueldo) {
        this.sueldo = sueldo;
    }
    
    
}

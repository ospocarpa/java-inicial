
package operaciones;


public class PruebaCaja {
    public static void main(String[] args) {
    
     Caja caja1 = new Caja();
     caja1.ancho=3;
     caja1.alto=2;
     caja1.profundo=6;
     caja1.calcularVolumen();
     
     Caja caja2=new Caja(3,2,6);
     caja2.calcularVolumen();
     
    }
    
}

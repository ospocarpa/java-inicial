
package operaciones;


public class Caja {
    int alto,ancho,profundo;
    public Caja () {
        System.out.println("Constructor vacio");
}
    public Caja(int ancho ,int alto,int profundo ) {
        this.ancho=ancho;
        this.alto=alto;
        this.profundo=profundo;
        System.out.println("Constructor con argumentos");
        
    }
    void calcularVolumen() {
        int volumen= ancho*alto*profundo;
        System.out.println("volumen= " + volumen  );
        
    }
}

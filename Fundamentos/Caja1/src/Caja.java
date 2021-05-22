
public class Caja {
    int ancho,alto,profundo;
    
    public Caja() {
        
    }
    public Caja(int alto,int ancho,int profundo){
        this.alto = alto;
        this.ancho=ancho;
        this.profundo = profundo;
    }
    public void calcularVolumen() {
        var volumen = this.alto*this.ancho*this.profundo;
        System.out.println("volumen = " + volumen);
    }
    public void mostrarValores() {
        System.out.println("Alto = " + this.alto+"\tAncho= "+this.ancho+"\tProfundo= "+this.profundo);
  
    }
}

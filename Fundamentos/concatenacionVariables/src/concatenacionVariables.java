
public class concatenacionVariables {

    public static void main(String[] args) {
        var usuario = "Juan";
        var titulo = "Ingeniero";
        var union = usuario + " " + titulo;
        System.out.println("union = " + union);

        var i = 3;
        var j = 4;
        System.out.println(i + j); // suma de numeros 
        System.out.println(i + j + usuario);// evaluacion izq a der,realiza suma
        System.out.println(usuario + i + j);//contexto cadema,todo es una cadena 
       //parentesis:modifican la prioridad en la evaluacion
        System.out.println(usuario + (i + j));

    }

}

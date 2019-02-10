/**
 * @author Jonathan
 */
public class ProblemaBElementos {
    static java.util.Scanner in;
    static String letras = "AEIOU";

    public static void casoDePrueba(){
        String line = in.next().toUpperCase();
        String consonante;
        char letra_anterior = 0;
        boolean orden = false;
        for (int i = 0; i < line.length() && !orden; i++) {
            consonante = line.substring(i, i+1);
            // filtra consonantes
            if(!letras.contains(consonante)){
               // comprueva la consonante anterior con la siguiente.
               if(!(letra_anterior <= line.charAt(i))) orden = true;
               letra_anterior = consonante.charAt(0);
            }
        }
        if (orden && line.length() >= 2) System.out.println("OK");
        else System.out.println("ERROR");
    }

    public static void main(String args[]){
        in = new java.util.Scanner(System.in);
        int numCasos = in.nextInt();
        for (int i = 0; i < numCasos; i++){
            casoDePrueba();
        }
    }
}

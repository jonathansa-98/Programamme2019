/**
 * @author Jonathan
 */
public class ProblemaBElementos {
    static java.util.Scanner in;
    static String letras = "AEIOU";
    static StringBuilder sb = new StringBuilder();

    public static void casoDePrueba(){
        String line = in.next();
        line = line.toUpperCase();
        String consonante;
        String aux;
        boolean orden = false;
        for (int i = 0; i < line.length(); i++) {
            consonante = line.substring(i, i+1);
            if(!letras.contains(consonante)){
               sb.append(consonante);
            }
        }
        for (int e = 0; e < sb.length()-1 & !orden; e++) {
            // si: sb.charAt(e) <= sb.charAt(e+1) ... 
            // "ERROR".     Ej: BC "ERROR"
            if(!(sb.charAt(e) <= sb.charAt(e+1))) orden = true;
        }
        if (orden && sb.length() >= 2) System.out.println("OK");
        else System.out.println("ERROR");
        sb.delete(0, sb.length());
    }

    public static void main(String args[]){
        in = new java.util.Scanner(System.in);
        int numCasos = in.nextInt();
        for (int i = 0; i < numCasos; i++){
            casoDePrueba();
        }
    }
}

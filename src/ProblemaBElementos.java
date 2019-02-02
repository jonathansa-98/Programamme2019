/**
 *
 * @author Jonathan
 */
public class ProblemaBElementos {
	static java.util.Scanner in;
        static String letras = "bBcCdDfFgGhHjJkKlLmMnNpPqQrRsStTvVwWxXyYzZ";
                
	public static void casoDePrueba(){
            String line;
            line = in.nextLine();
            int[] pos = new int[line.length()];
            String consonante;
            for (int i = 0; i < line.length(); i++) {
                consonante = line.substring(i, i+1);
                if(letras.contains(consonante)){
                    pos[i] = letras.indexOf(consonante);
                } else{
                    pos[i] = -1;
                }
                if(pos[i]!=-1){
                    System.out.println(pos[i]);
                }
                // pos[i] <= pos[i+1] ...
            }
            boolean orden = true;
            for (int e = 0; e < pos.length-1 & orden; e++) {
                if(pos[e]!=-1){
                    if(!(pos[e] <= pos[e+1])) orden = false;  
                }
            }
            if(orden) System.out.println("OK");
            else System.out.println("ERROR");
	}
	
	public static void main(String args[]){
            in = new java.util.Scanner(System.in);
            int numCasos;
            numCasos=in.nextInt();
            for (int i = 0; i <	numCasos; i++){
                casoDePrueba();
            }
	}
}

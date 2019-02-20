/**
 *
 * @author Jonathan
 */
public class ProblemaACalculadora {
    
    static java.util.Scanner in;

    public static String casoDePrueba(){
        int n1 = in.nextInt();
        String signo = in.next();
        int n2 = in.nextInt();
        switch(signo){
            case "/":
                return n2 == 0 ? "ERROR":n1/n2 + "";
            case "*":
                return n1*n2 + "";
            case "+":
                return n1+n2 + "";
            case "-":
                return n1-n2 + "";
        }
        return "no signo";
    }

    /*public static void main(String args[]){
        in = new java.util.Scanner(System.in);
        int numCasos = in.nextInt();
        for (int i = 0; i < numCasos; i++){
            System.out.println(casoDePrueba());
        }
    }*/
}
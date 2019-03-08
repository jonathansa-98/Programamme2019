package pgmm;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
/**
 *
 * @author Jonathan
 */
public class problemaB475Jonathan {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String texto1;
        String texto2 = "stanlee";
        int n, num1, num2, cont;
        n = Integer.parseInt(br.readLine());
        for(int i=0; i<n; i++){
            cont = 0;
            num1 = 0;
            texto1 = br.readLine();
            texto1 = texto1.toLowerCase().replace(" ", "");
            num2 = texto2.length();
            for(int j=0; j<texto1.length(); j++){
                if(texto1.charAt(j) == texto2.charAt(num1)){
                    num1++;
                    if(num1 == num2){
                        cont++;
                        num1=0;
                    }
                }
            }
            System.out.println(cont);
        }
    }
}


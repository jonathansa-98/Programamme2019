import java.util.Scanner;
/**
 *
 * @author Jonathan
 */
public class ProblemaCPrimos {
    
    public static boolean isPrime(int num) {
        if (num % 2 == 0) return false;
        for (int div = 3; div <= Math.sqrt(num); div+=2) {
            if (num % div == 0) return false;
        }
        return true;
    }
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        byte casos;
        casos = sc.nextByte();
        
        StringBuilder num_sb = new StringBuilder();
        int cont;
        int num;
        
        for(byte n = 0; n < casos; n++){
            cont = 0;
            num = sc.nextInt();
            for(int i = 2; i <= num; i++){
                if(isPrime(i)){
                    num_sb.append(i);
                    if(num_sb.charAt(0) == '1'){
                        cont++;
                    }
                    num_sb.delete(0, num_sb.length());
                }				
            }
            System.out.println(cont);
        }
    }
}
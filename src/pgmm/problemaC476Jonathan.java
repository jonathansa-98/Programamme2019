package pgmm;
import java.util.*;
/**
 *
 * @author Jonathan
 */
public class problemaC476Jonathan {
    public static boolean check(byte a, char simb, byte b) {
        if(simb == '<') return a < b;
        else if(simb == '>') return a > b;
        return a == b;
    }
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        byte nSuperH = Byte.parseByte(sc.nextLine());
        while(nSuperH != 0){
            String[] destreza = sc.nextLine().split(" ");
            String[] preferencia = sc.nextLine().split(" ");
            boolean[] parella = new boolean[nSuperH];
            boolean trobat = false;
            for(byte i = 0; i < nSuperH; i++){
                if(!parella[i]){
                    boolean fin = false;
                    for (byte j = (byte)(i+1); j < nSuperH && !fin; j++) {
                        if(!parella[j]){
                            if(check(Byte.parseByte(destreza[j]), preferencia[i].charAt(0), Byte.parseByte(""+preferencia[i].charAt(1))) && 
                               check(Byte.parseByte(destreza[i]), preferencia[j].charAt(0), Byte.parseByte(""+preferencia[j].charAt(1)))){
                                System.out.println((i+1)+" "+(j+1));
                                parella[i] = true;
                                parella[j] = true;
                                trobat = true;
                                fin = true;
                            }
                        }
                    }
                }
            }
            if(!trobat) System.out.println("NO HAY");
            System.out.println("---");
            nSuperH = Byte.parseByte(sc.nextLine());
        }
    }
}
import java.util.Arrays;
import java.util.Scanner;
/**
 * @author Jonathan
 */
public class ProblemaDVideojuegos {
    static Scanner in;

    public static String casoDePrueba(){
        byte nrooms = in.nextByte();
        byte con  = in.nextByte();
        byte[][] pasos = new byte[con][2];
        System.out.println("habitaciones:"+nrooms);
        System.out.println("conexiones:"+con);
        System.out.println("pasos:"+pasos.toString());
        for (byte i = 0; i < con; i++) {
            pasos[i][0] = (in.nextByte());
            pasos[i][1] = (in.nextByte());
            System.out.println(Arrays.toString(pasos[i]));
        }
        for (byte i = 0; i < nrooms; i++) {
            if(true){
                return "GAMEOVER";
            } else if (true) {
                return "PERDIDO";
            }
        }
        return "VICTORIA";
    }

    /*public static void main(String args[]){
        in = new Scanner(System.in);
        int numCasos = in.nextInt();
        for (int i = 0; i < numCasos; i++){
            System.out.println(casoDePrueba());
        }
    }*/
}

/*
3
2
1
1 2
2
3
1
1 2
2,3
5
2
1 2
3 2
2,3
*/
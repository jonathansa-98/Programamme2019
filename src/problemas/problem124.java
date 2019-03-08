package problemas;
import java.util.*;
/**
 * @author Jonathan
 * */
public class problem124 {
    public static int acarreos(String s1, String s2){
        int cont = 0; // cuenta de acarreos
        int acarreo = 0; // acarreo actual
        int i = 0; // posición por la izquierda
        boolean fin = false;
        while (!fin){
            // coger el siguiente dígito de cada número por la izquierda i castea a int. 
            // si he superado la longitud, el dígito en el que estoy es 0
            int i1 = i<s1.length() ? (int)s1.charAt(s1.length()-(i+1))-'0':0;
            int i2 = i<s2.length() ? (int)s2.charAt(s2.length()-(i+1))-'0':0;
            int suma = acarreo + i1 + i2;
            acarreo = suma >= 10 ? 1:0; // acarrea si la suma es > 10
            cont += acarreo;
            //pasar al siguiente por la izquierda
            i++; 
            // terminamos si no hay acarreos y pasamos la longitud de alguna de las dos cifras 
            fin = !(acarreo>0) && (i>=s1.length() || i>s2.length());
        }
        return cont;
    }
   
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        boolean fin = false;
        do{
            String s1 = in.next(); 
            String s2 = in.next();
            in.nextLine();
            fin = s1.equals("0") && s2.equals("0");
            if (!fin){
                System.out.println(acarreos(s2, s1));
            }
        } while (!fin);
    }
}
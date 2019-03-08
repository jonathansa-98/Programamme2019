import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

/**
 *
 * @author Jonathan
 */
public class ProblemaENaves {
    static Scanner in;
    static int min_o2;
    static int n_naves;
    
    private static class Nave implements Comparable<Nave>{
        private int o2;
        private int peso;
        
        public Nave(int o2, int peso){
            this.o2 = o2;
            this.peso = peso;
        }
        
        @Override
        public int compareTo(Nave nav) {
            if(o2 >= min_o2 && nav.o2 >= min_o2 || o2 < min_o2 && nav.o2 < min_o2){
                if(peso == nav.peso){
                    if(o2 < nav.o2) return 1;
                    else if(o2 > nav.o2) return -1;
                    return 0;
                } else if(peso > nav.peso){ 
                   return 1;
                }
                return -1;
            } else if(o2 < min_o2){ 
                return 1;
            }
            return -1;
        }

        @Override
        public String toString() {
            return this.o2+" "+this.peso;
        }
    }
    
    public static void casoDePrueba(byte x){
        min_o2 = in.nextInt();
        n_naves = in.nextInt();
        List<Nave> naves = new ArrayList<>();
        for (int i = 0; i < n_naves; i++) {
            naves.add(new Nave(in.nextInt(), in.nextInt()));
        }
        // ordenar naves
        Collections.sort(naves);
        // resultados
        System.out.println("Caso "+(++x)+":");
        for(Nave nave : naves) {
            System.out.println(nave);
        }
    }

    public static void main(String args[]){
        in = new Scanner(System.in);
        byte numCasos = in.nextByte();
        for(byte i = 0; i < numCasos; i++){
            casoDePrueba(i);
        }
    }
}
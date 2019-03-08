package pgmm;
import java.util.*;
/**
 *
 * @author Jonathan
 */
public class problemaD477Jonathan {
    private static class Arma implements Comparable<Arma>{
        public int dHum;
        public int dMon;
        public int pos;
        public Arma(int dHum, int dMon, int pos){
            this.dHum = dHum;
            this.dMon = dMon;
            this.pos = pos;
        }
        @Override
        public boolean equals(Object obj){
            if(obj == null)return false;
            if(obj == this)return true;
            if(obj instanceof Arma){
                Arma aux = (Arma) obj;
                return dHum == aux.dHum && dMon == aux.dMon;
            }
            return false;
        }
        @Override
        public int compareTo(Arma obj){
            if(dHum < obj.dHum) return -1;
            else if(dHum > obj.dHum) return 1;
            if(dMon > obj.dMon) return -1;
            else if(dMon < obj.dMon) return 1;
            return pos-this.pos;
        }
    }

    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        short vida = sc.nextShort();
        List<Arma> armas = new ArrayList<Arma>();
        StringBuilder resultat = new StringBuilder();
        while(vida != 0){
            resultat.setLength(0);
            armas.clear();
            short nArmas = sc.nextShort();
            for(short i = 0; i < nArmas; i++){
                armas.add(new Arma(sc.nextShort(), sc.nextShort(), i));
            }
            Collections.sort(armas);
            int i;
            for(i = 0; i < nArmas && vida > 0; i++){
                vida -= armas.get(i).dMon;
            }
            if(vida > 0)System.out.println("MUERTE ESCAPA");
            else{
                for(int j = 0; j < i; j++){
                    if(j==0) resultat.append(armas.get(j).pos+1);
                    else resultat.append(" "+(armas.get(j).pos+1));
                }
                System.out.println(resultat);
            }
            vida = sc.nextShort();
        }
    }
}
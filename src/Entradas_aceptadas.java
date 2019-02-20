/**
 * @author Jonathan
 */
public class Entradas_aceptadas {}

/*    static java.util.Scanner in; */

//Pruebas limitadas (for casos)
/*
class solution{
	static java.util.Scanner in;
	
	public static void casoDePrueba(){
		int n;
		n=in.nextInt();
		if((n%2)==0) System.out.println("PAR");
		else System.out.println("IMPAR");
	}
	
	public static void main(String args[]){
		in=new java.util.Scanner(System.in);
		int numCasos;
		numCasos=in.nextInt();
		for (int i = 0; i <	numCasos; i++){
			casoDePrueba();
		}
	}
}
*/

//Prueba acotado por casos especiales (entrada de un 0...)
/*
class solution2{
	static java.util.Scanner in;
	
	public static boolean casoDePrueba(){
		int n;
		n=in.nextInt();
		if(n==-1) return false;
		
		if((n%2)==0) System.out.println("PAR");
		else System.out.println("IMPAR");
		
		return true;
	}
	
	public static void main(String args[]){
		in=new java.util.Scanner(System.in);
		while (casoDePrueba());
	}
}
*/

//Prueba hasta que acaben de entregar casos el juez (acaba el fichero de pruebas...)
/*
class solution3{
	static java.util.Scanner in;
	
	public static boolean casoDePrueba(){
		int n;
		n=in.nextInt();
		if(!in.hasNext()) return false;
		
		n=in.nextInt();
		
		if((n%2)==0) System.out.println("PAR");
		else System.out.println("IMPAR");
		
		return true;
	}
	
	public static void main(String args[]){
		in=new java.util.Scanner(System.in);
		while (casoDePrueba());
	}
}
*/
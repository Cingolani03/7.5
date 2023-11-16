package org.generation.italy;

import java.util.Random;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*public static void main(String[] args) {
     HashSet<String> insiemeStudenti = new HashSet<>();
	 insiemeStudenti.add(("Mario"));
	 insiemeStudenti.add(("Pina"));
	 insiemeStudenti.add(("Gino"));*/
Scanner sc=new Scanner(System.in);
float[] elencoCarte={1f,2f,3f,4f,5f,6f,7f,0.5f,0.5f,0.5f,
		       1f,2f,3f,4f,5f,6f,7f,0.5f,0.5f,0.5f,
		       1f,2f,3f,4f,5f,6f,7f,0.5f,0.5f,0.5f,
		       1f,2f,3f,4f,5f,6f,7f,0.5f,0.5f,0.5f};

String risposta;
int i,carta=0,tot=0;
Random r=new Random();

do
{
for(i=0;i<1;i++) {
	carta=r.nextInt(elencoCarte.length);
System.out.println("la carta pescata è: " + elencoCarte[carta]);
}
if(carta>7.5) {
	System.out.println("Hai sballato");
}	
tot=tot+carta;
System.out.println("la tua somma è: " + tot);
System.out.println("vuoi pescare un'altra carta ?");
risposta=sc.nextLine();
}while(risposta.equals("si"));
System.out.println("stai");
System.out.println("la tua somma è: " + tot);
	}

}

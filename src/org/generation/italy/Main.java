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
String[]tipoCarte= {"asso di bastoni","2 di bastoni","3 di bastoni","4 di bastoni","5 di bastoni","6 di bastoni",
		            "7 di bastoni","fante di bastoni","cavallo di bastoni","re di bastoni",
		            "asso di spade","2 di spade","3 di spade","4 di spade","5 di spade","6 di spade",
		            "7 di spade","fante di spade","cavallo di spade","re di spade",
		            "asso di coppe","2 di coppe","3 di coppe","4 di coppe","5 di coppe","6 di coppe",
		            "7 di coppe","fante di coppe","cavallo di coppe","re di coppe",
		            "asso di denari","2 di denari","3 di denari","4 di denari","5 di denari","6 di denari",
		            "7 di denari","fante di denari","cavallo di denari","re di denari"};
	        
String risposta;
int i,carta=0;
float conta=0f,tot=0;
Random r=new Random();


do {
do
{
	for(i=0;i<40;i++) {
		
	}
carta=r.nextInt(elencoCarte.length);
System.out.println("la carta pescata è: " + tipoCarte[carta]);
for(i=0;i<40;i++) {	
}
conta=elencoCarte[carta];
tot=tot+conta;
System.out.println("la tua somma è: " + tot);
if(tot>7.5) {
	System.out.println("hai sballato");
break;}
	if(tot==7.5f) {
		System.out.println("bravo!");
		break;}
		if(tot<7.5)
System.out.println("vuoi pescare un'altra carta ?");
risposta=sc.nextLine();
}while(risposta.equals("si"));

System.out.println("vuoi giocare ancora ?");
risposta=sc.nextLine();
}while(risposta.equals("si"));
System.out.println("arrivederci");

sc.close();
	}

}

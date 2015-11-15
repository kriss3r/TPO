package dwa;

import java.util.ArrayList;
import java.util.Scanner;



public class interfejs {
	
	static Scanner skan = new Scanner(System.in);
	static int count;
	static ArrayList<Kot> Koty = new ArrayList();
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String imieKota ="";
		String imieOpiekuna="";
		System.out.println("Podaj imie kota");
		if (skan.hasNextLine()==true){
			imieKota = skan.nextLine();	
			count++;
			Koty.add(new Kot(imieKota));
			System.out.println(count);
			
			System.out.println("Podaj imie opiekuna");

			if(skan.hasNextLine()==true){
				imieOpiekuna = skan.nextLine();
				Koty.set(count-1, new Kot(imieKota,imieOpiekuna));
			//	System.out.println(count);
				System.out.println(Koty.get(count-1).toString());
				skan.close();
			}
		} else
			{
			System.out.println("Dupa");
		}
	
	Kot maly = new Kot("SzaroBury", "Rufus");
	maly.getCommunication(maly.getImieKota()+ " Lubi Placki");
	int[] cztery = new int[4];
	cztery[0] = 1;
	cztery[1] = 100;
	cztery[2] = cztery[1];
	cztery[3] = 50;
	
	
	
	
	int[] testowyRevert = new int[5];
	int ct =0;
	for(int i:testowyRevert){
		testowyRevert[i]=++ct;
		System.out.println(testowyRevert[i] +" testowy revert[i]");
	}
	
	for (int j:maly.reverse(testowyRevert)){
		System.out.println("Po revercie = " + j);
	}
	
	boolean czyPrawdziwe ;
	int k =0;
	for(int i:cztery){
		if(i==k){
			czyPrawdziwe = true;
		}else {
			czyPrawdziwe = false;
		}
		System.out.println(czyPrawdziwe+" wartosc i= "+i+" wartosc k ="+k);
		k=i;
	}
		System.out.println(maly.getTable(cztery));			
	}

	public static String returnCatName(){
		return skan.nextLine();
	}

}

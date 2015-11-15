package dwa;

import java.lang.reflect.Array;

public class Kot {
	protected String imieKota;
	protected String imieOpiekuna;
	
	
	public Kot(){
		this.imieKota="";
		this.imieOpiekuna="";
	}
	
	public Kot(String imieKota2) {
		// TODO Auto-generated constructor stub
		this.imieKota=imieKota2;
	}

	public Kot(String imieKota2, String imieOsoby2) {
		// TODO Auto-generated constructor stub
		
		if (imieKota2.isEmpty()){
			this.imieOpiekuna=imieOsoby2;
		} else {
			this.imieKota=imieKota2;
			this.imieOpiekuna=imieOsoby2;
		}
		
	}
	
	public static int[] reverse(int[] list) {
		  int[] result = new int[list.length];

		  for (int i = 0, j = result.length - 1; i < list.length; i++, j--) {
		    result[j] = list[i];
		  }
		  return result;
		}
	
	public static int[] revertArr(int[] nob){ // tworzymy kopie tablicy (nob)
		System.out.println(nob[1]+" NOB[0]");
		int[] revert = new int[nob.length]; //zmienna revert przechowuje dlugosc tablicy.
		System.out.println(revert.length +" rozmiar tablicy revert");
		int leng =nob.length-1; // zmienia leng przechowuje dlugosc tablicy
		System.out.println(leng + " wartosc zmiennej leng ");
		int temp =0;
		
		for (int i=0; i<revert.length-1; i++){
			temp = nob[leng];
			System.out.println(nob[0]+nob[1]+nob[2] +" nob[0] , nob[1], nob[2]..");
			System.out.println(temp +" temp");
			revert[i]=temp;
				--leng;
				System.out.println(revert[i]+" wynik revertu");
			}
		return revert;
	}
	
	
	
	
	

	
	
	public int getTable(int[] b){
		int sum =0;
		for(int i:b){
			if (i>100) {
				System.out.println("jeden z elementow tablicy jest wiekszy lub rowny 100");
				break;
			}
			System.out.println("i = "+i);
		sum+=i;
		
		}
		return sum;
	}
	

	public void setImieKota(String imieKota){
		this.imieKota=imieKota;
	}
	

	/**
	 * @param imieOpiekuna
	 */
	public void setImieOpiekuna(String imieOpiekuna){
		this.imieOpiekuna=imieOpiekuna;
	}
	

	public String getImieKota(){
		return this.imieKota;
	}
	

	public String getImieOpiekuna(){
		return this.imieOpiekuna;
	}
	
	public void getCommunication(String s){
		System.out.println("komunikat + =" +s);
	}
	
	
	public String toString(){
		return (getImieKota() +" "+ getImieOpiekuna() +Kot.class.getCanonicalName());
	}
	
	
	
	
	
	
}

package zadanie1;

public class GenerateInt {

	public int[][] generateIntArray(double[] x){ // metoda zwracająca tablicę wielowymiarową z wygenerowanymi intami.
		int[][] IntArray = new int[x.length][]; //deklaracja tablicy wielowymiarowej
		
		int temp,temp2; //deklaracja zmeinnych pomocniczych
		for(int i=0;i<x.length;i++){ // petla ktorej zadaniem jest zadeklarowanie ilosci intow
			temp=(int)x[i];
			IntArray[i]= new int[temp];
			
			for (int j=0;j<IntArray[i].length;j++){ //petla ktorej zadaniem jest przypisanie odpowiedniej ilosci zmiennych
				temp2 =(int) (Math.random()*10);
				IntArray[i][j]=temp2;
			//	System.out.println("wartosc tablicy wygenerowanej z doubli w indeksie"+i+" "+j+" jest rowna"+ IntArray[i][j]);
			}
			// IntArray[i][(int)x[i]]=.generateInt(x[i]);
		}
		return IntArray;
	}
	
	public int[] generateInt(double x){
		int[] generateInt = new int[(int)x];
		if(x>0){
			int temp;
			for(int i=0;i<x;i++){
			temp=(int) (Math.random()*10);
			generateInt[i]=temp;
			}
			return generateInt;
		} else
		{
			return generateInt;
		}
	}
	
	public boolean generateIntTest(int[] z){
		if(z.length>0){
			int temp;
			for(int x:z){
				System.out.println("wartosc wygenerowanego inta"+x);
			}
			return true;
		}else {
			return false;
		}
	}
	
	public boolean validateIntArray(int[][] z){
		
		if(z.length!=0){
		for(int i=0;i<z.length;i++){
			for(int j=0;j<z[i].length;j++){
			System.out.println("wartosc tablicy wygenerowanej z doubli w indeksie"+i+" jest rowna"+ z[i][j]);
		}
			
	}
		return true;
		}
		else {
			return false;
		}
	}
}

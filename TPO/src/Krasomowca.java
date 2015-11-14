
public class Krasomowca {

	public static void main(String[] args) {
			String[] listaSlow = {
				"architektura wielowarstowowa", "30000 mil", "co jest K*a", "interfejs internetowy", "przenikliwośc", "dynamicznie" 
			};
			String[] listaSlow2= {
				"pomnaża wartosc", "opracowana dla", "bazujaca na","poprawia atrakcyjnośc"
			};
			String[] listaSlow3 = {
					"procesu", "punktu wypisywania" , "paradygmatu" , "aksjomatu" , "lubie placki"
			};
			
			int[] DlugoscList = {
					listaSlow.length, listaSlow2.length,listaSlow3.length
			};
			
			// generacja zwrotow.
			
			int x = 5 ;
			while (x>1){
		
				int[] rnd = {
						(int)(Math.random())*DlugoscList[0], (int)(Math.random())*DlugoscList[1],(int)(Math.random())*DlugoscList[2]};
				String zdanie = listaSlow[rnd[0]]+" "+listaSlow2[rnd[1]]+" "+listaSlow3[rnd[2]];		
				System.out.println("to jest randomowe zdanie: = "+zdanie);
				x--;
				rnd[0]=0; rnd[1]=0; rnd[2]=0;
			}
			
			
			
			
			
			
			
	}

}

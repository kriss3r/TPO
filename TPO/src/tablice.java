import java.util.ArrayList;
import java.util.Scanner;

public class tablice {

	
	static Scanner sc = new Scanner(System.in);
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		ArrayList ar = new ArrayList();
	
		for (byte i=0;i<127;i++){
			ar.add("wartosc i ="+i+" ");
			System.out.println(ar.get(i).toString() + ar.size());
		}
		
		
		System.out.println(ar.get(0).toString() + ar.size());
		
		System.out.println("Podaj username");
		do {
		String ReadUserName = getUserInput();
		System.out.println(ReadUserName);
	}
		while (sc.hasNextLine()==true && sc.hasNextInt()==true);
		sc.close();
	}
	
	

	
	
	
	public static String getUserInput(){
		return sc.nextLine();
	}
	

}

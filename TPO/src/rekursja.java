import java.util.Scanner;

public class rekursja {
	// odwo³ywanie metody do samej siebie
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("podaj silnie");
		Scanner nx = new Scanner(System.in);
		long x = nx.nextLong();
		System.out.println(fact(x));
		
		
	}
	//silnia

	public static long fact(long n){
		if(n<=1){
			return n;
		}else {
			return n * fact(n-1);
		} // wywolanie metody w samej sobie, oszczednosc kodu i czasu
		
		
		
		
		
	}
	
	
}

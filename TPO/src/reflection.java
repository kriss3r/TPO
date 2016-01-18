import java.util.ArrayList;
import java.util.Scanner;

public class reflection {

	//publiTc getName
	
	
	public void getConstructors(String ClassName){
		
		try {
			System.out.println("Tu jeszcze dzia³a");
			Class cl = Class.forName(ClassName).getSuperclass();
			System.out.println("Tu juz nie");
			
			System.out.println(cl.getName());
			ArrayList Constructors = new ArrayList();	
			Constructors.add(cl.getConstructors());		
			for(int i=0;i<Constructors.size();i++){
				System.out.println(i+" "+Constructors.get(i));
			}
			
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		
	}
}	
		
		public void doAsk(){
			reflection ref = new reflection();
			System.out.println("Podaj pelna nazwe dostepnej klasy, w³asnej lub bibliotecznej");
			Scanner input = new Scanner(System.in);
			if(input.hasNextLine()){
				String x = input.nextLine().toString();
				ref.getConstructors(x);
			}
		}

		
		public void retry(){
			System.out.println("Nie znaleziono podanej klasy, czy chcesz spróbowaæ jeszcze raz ? T/N");
			Scanner input = new Scanner(System.in);
			if(input.hasNextLine()){
				String s =input.nextLine();
				if(s.equals("T")){
					doAsk();
				}else if(s.equals("N")){
					System.out.println("Zakonczenie programu");
				}
		}
		}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
				
		reflection ref = new reflection();
		ref.doAsk();
		}

		
	}


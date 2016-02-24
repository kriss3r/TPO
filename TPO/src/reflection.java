import java.lang.reflect.Constructor;
import java.lang.reflect.Parameter;
import java.util.ArrayList;
import java.util.Scanner;

public class reflection {

	public void getConstructors(String ClassName){
			Class temp;
			ArrayList Constructors = new ArrayList();
			try {
				temp = Class.forName(ClassName);
			System.out.println(temp.getName());
			
			for(Constructor<?> c:temp.getConstructors()){		
				ArrayList param = new ArrayList();
				param.add(0, c.getParameterTypes());
				
				/*if(c.getParameterCount()==0){
					Class<?>[] temp2 = c.getParameterTypes();
					for(Object x:temp2){
						
					}
						
				}*/
			
			}		
			for(int i=0;i<Constructors.size();i++){
				System.out.println(i+" "+Constructors.get(i).toString());
			}	
			
			
			
			
			
	} catch (ClassNotFoundException e) {
		// TODO Auto-generated catch block
		this.retry();
	}
	}		
			
	
		public void doAsk(){
			System.out.println("Podaj pelna nazwe dostepnej klasy, w³asnej lub bibliotecznej");
			Scanner input = new Scanner(System.in);
			if(input.hasNextLine()){
				String x = input.nextLine().toString();
				this.getConstructors(x);
			}
		}

		
		public void retry(){
			System.out.println("Nie znaleziono podanej klasy, czy chcesz spróbowaæ jeszcze raz ? T/N");
			Scanner input = new Scanner(System.in);
			if(input.hasNextLine()){
				String s =input.nextLine();
				if(s.equals("T")){
					doAsk();
				}else {
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


package zadanie1;

import java.lang.reflect.Constructor;
import java.lang.reflect.Parameter;
import java.lang.reflect.ParameterizedType;
import java.lang.reflect.TypeVariable;
import java.util.ArrayList;
import java.util.Scanner;

public class reflection {

	private static Class className;
	
	public static Class getClassRef(String ClassName){
		Class temp; // pusta referencja do obiektu Class
		try {
			temp = Class.forName(ClassName); // referencja do obiektu dane klasy
		return className=temp;
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			retry();
		}
		return null;		
	}
	public static void getConst(){
		
			Constructor[] Constructors = className.getDeclaredConstructors(); //Lista konstruktorów.			
			ArrayList Constructors2 = new ArrayList();
			boolean isCorrect;
			for(Constructor c:Constructors){	
				isCorrect = false;
				Class<?>[] pType  = c.getParameterTypes();	
				for (int i=0;i<pType.length;i++){
					System.out.println(pType[i].getCanonicalName());
					if(pType[i].getCanonicalName().contains("String")|| pType[i].getCanonicalName().contains("int")|| pType[i].getCanonicalName().contains("double"))
					{
					isCorrect = true;
					}else {
						isCorrect=false;
						break;
					}
				}
					if(isCorrect=true){
						Constructors2.add(c);
						System.out.println(c);
					}
					
					
				}
			int count=0;
				for(Object d:Constructors2){
					count++;
					System.out.println(count +" "+d.toString());
				}
					
					
					/*
					if(temp.getClass()..contains("int")!=true || temp.contains("double")!=true || temp.contains("String")!=true){
						Constructors.remove(i);
					} else {
						continue;
						// System.out.println(Constructors.get(i));
					}
				}*/
				
			/*	System.out.println("po czyszczeniu");
				
				for(Object g:Constructors){
					System.out.println(g.toString());
				}
				}*/
				/*if(c.getParameterCount()==0){
					Class<?>[] temp2 = c.getParameterTypes();
					for(Object c:temp2){
					}						
				}*/

		/*	for(int i=0;i<Constructors.size();i++){
				System.out.println(i+" "+Constructors.get(i).toString());
			}		*/	
	}
			
		public static void doAsk(){
			System.out.println("Podaj pelna nazwe dostepnej klasy, w³asnej lub bibliotecznej");
			Scanner input = new Scanner(System.in);
			if(input.hasNextLine()){
				String x = input.nextLine().toString();
				getClassRef(x);
				getConst();
			}
		}		
		public static void retry(){
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


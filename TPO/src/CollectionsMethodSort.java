import java.util.*;

public class CollectionsMethodSort {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String[] crap = {"apples","lemons","geese","bacon","youtube"};
		List<String> l1 = Arrays.asList(crap);
		
		// sortowanie alfabetycznie
		
		Collections.sort(l1);
		// it modifies the list.

			System.out.printf("%s\n", l1);		
			
			// sort in reverse order.
			Collections.sort(l1, Collections.reverseOrder());
			System.out.printf("%s\n", l1);		

			//methods reverse and copy.
			
			Character[] ray ={'p','w','n'};
			
			//cast
			List<Character> l = Arrays.asList(ray);
			
			System.out.println(l);
			output(l);
			
			// reverse and printout the list
			
			Collections.reverse(l);
			System.out.println("After reverse" + l);
			output(l);
			
			
			Character[] newRay = new Character[3];
			List<Character> listCopy = Arrays.asList(newRay);
			
			
			// copy contents of l to listCopy.
			
			Collections.copy(listCopy, l);
			
			System.out.println(listCopy);
			
			
			// fill collection with sth
			
			Collections.fill(listCopy, 'X');
			System.out.println(listCopy);
			
			// copy data from List to ArrayList
			
			String[] stuff ={"pilki","gumki","no¿yczki","reklamówki"};
			
			List<String> listal1 = Arrays.asList(stuff);
			
			ArrayList<String> listal2 = new ArrayList<String>();
			
			listal2.add("S1");
			listal2.add("S2");
			listal2.add("S3");
			
			Collections.addAll(listal2, stuff);
			System.out.println();
			
			for(String x:listal2){
				System.out.printf("%s ",x );
			}
			
			
			// Frequency method from Collections class allow to receive how many times object is saved within collection
			
			System.out.println(Collections.frequency(listal2, "S1"));
			
			// disjoin - it checks one list against another, and reveice true if they don't have any similar elements.
			
			boolean res = Collections.disjoint(listal2, listal1);
			System.out.println(res);
			
			// stack - ( data structure), ( like stack of dishes) ( new elements allways go at the top ( push), when we take them back it's ( pop)
			
			
	}

	private static void output(List<Character> l) {
		// TODO Auto-generated method stub
		System.out.println("Output method");
		
		for(Character thing:l){
			System.out.printf("%s ", thing);
		}
	}

}

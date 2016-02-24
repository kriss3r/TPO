import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;

public class kolekcje {
	// Collections Array which holds stuff ( references to other object), and it's dynamic. (Lists or Sets)
	
	
	// Set, it's like list but it can't contain duplicates
	
	
	
	// List - can contain duplicates, 
	
	
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String[] tbl = {"eggs","lasers","hats","pie"};
		
		List<String> lista = new ArrayList<String>();
		
		// add array items to list
		
		for(String x:tbl){
			lista.add(x);
		}
		
		String[] morethings = {"lasers","hats"};
		
		List<String> lista2 = new ArrayList<String>();
		
		
		for(String y:morethings){
			lista2.add(y);
		}
		
		
		for (int i=0;i<lista2.size();i++){
	//		System.out.printf("%s ", lista2.get(i));
		}

		editLists(lista, lista2);
		
		for(String v:lista){
			System.out.println(v);
		}
		
}
		// checking Collection and removing repeated Strings
	private static void editLists(Collection<String> lista, Collection<String> lista2) {
		// TODO Auto-generated method stub
		Iterator<String> it = lista.iterator();
		while(it.hasNext()){
			if(lista2.contains(it.next())){
				it.remove();
			}
		}
		
		}
	}
		

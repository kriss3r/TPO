import java.util.*;
public class linkedList {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// two string tables, with different elements, combined into one LinkedList.
		String[] tbl1 = {"apples","noobs","pwnge","bacon","goATS"};
		List<String> list1 = new LinkedList<String>();
		for(String a : tbl1){
			list1.add(a);
		}
		String[] tbl2 = {"beer","vodka","wine","whiskey","borboun"};
		List<String> list2 = new LinkedList<String>();
		for(String b:tbl2){
		list2.add(b);	
		}
		list1.addAll(list2);		
		list2 = null;
		printMe(list1);
		System.out.println("=====================");
		// removeStuff(list1,2,5);
		printMe(list1);	
		 //List<String> list3 = new LinkedList<String>();
		reverseMe(list1);
	//	printMe(list2);	
		System.out.println("==========================================================");
		printMe(reverseReturn(list1));
		
		
		
	}

	/*private static List<String> reverseMe(List<String> list1) {
		// TODO Auto-generated method stub
		//
		List<String> listT = new LinkedList<String>();
		for(int i=list1.size()-1;i>-1;i--){
			System.out.println(list1.get(i));
			listT.add(list1.get(i));
		}
		return listT;
		
	}
	*/
	private static void reverseMe(List<String> list1){
		ListIterator<String> bobby = list1.listIterator(list1.size());
		while(bobby.hasPrevious()){
			System.out.printf("%s ", bobby.previous());
		}
	}
	
	private static List<String> reverseReturn(List<String> l){
		ListIterator<String> bb=l.listIterator(l.size());
		LinkedList<String> l2 = new LinkedList<String>();
		while(bb.hasPrevious()){
			l2.add(bb.previous());
		}
		return l2;
		
	}
	
	
	
	private static void removeStuff(List<String> list1, int i, int j){
		list1.subList(i, j).clear();
	}
	
	/*private static void removeStuff(List<String> list1, int i, int j) {
		// TODO Auto-generated method stub	
		int range = j-i;
		
		for(int x=i;x<j;x++){
			while(range!=0){
			range--;
			list1.remove(x);
		}
		}
		
	}*/

	private static void printMe(List<String> list1) {
		// TODO Auto-generated method stub
		for(String x : list1){
			System.out.println(x);
		}
		
	}

}

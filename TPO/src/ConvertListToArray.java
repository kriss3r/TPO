import java.util.*;
public class ConvertListToArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String[] stuff = {"babies","watermelong","melons","fudge"};
		
		LinkedList<String> thelist = new LinkedList<String>(Arrays.asList(stuff));
		//fast and efficient way to convert from Array to List.
		
		
		thelist.add("pumpkin");
		thelist.addFirst("FirstThing");
		
		// we cannot add new value to beginning of a Array, that's the reason why to use Lists or LinkedList
		
		
		//convert back to an Array.
		
		String[] stuffte = thelist.toArray(new String[thelist.size()]);
		
		for(String x:stuffte){
			System.out.printf("%s ", x);
		}
		
		
	}

}

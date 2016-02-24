
public class stringiA {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
			
		
		
		String[] words = {"funk","chunk","furry","baconator"};
		
		//startsWith
		
		for(String x  :words){
			System.out.println(x.indexOf("hunk")+" zawiera hunk'a");
			if(x.startsWith("fu")){
				System.out.println(x +" starts with fu");
			}if(x.endsWith("nk")){
				System.out.println(x +" ends with uk");
			}
			if(x.indexOf("u")==-1){
				System.out.println(x+ " nie spelnia kryteriow ");
			}else {
				System.out.println(x+" spelnia kryteria");
			}
			
			}
		
		//concat
		
		System.out.println(words[0].concat(" "+words[1]));
			
		// replace
		
		System.out.println(words[0].replace('f','b').toUpperCase());
		System.out.println(words[0].toUpperCase());
		
		String b ="";
		b = b.concat("      "+words[0]+"         ").toString();
		System.out.println(b+"b");
		
		// trim ( removes all whitespaces, blank fields etc)
		
		System.out.println(b.trim());
	
		
			
		}

	}

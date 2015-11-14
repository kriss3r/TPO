
public class BottlesSong {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
				int iloscBut = 99;
				String slowo ="Bottles";
				
				while (iloscBut>0){
					if (iloscBut==1){
						slowo="Bottle"; // Lp
					}
					System.out.println(iloscBut +" "+ slowo+" of beer on the wall");
					System.out.println(iloscBut +" "+ slowo+" of beer");
					System.out.println("Take one down.");
					System.out.println("Pass it around.");
					iloscBut--;
					
					if(iloscBut>0){
						System.out.println(iloscBut+" "+ slowo+ " of beer on the wall");
					}else {
						System.out.println("No more bottles of beer on the wall");
					} // end else
				}//end while			
	}//end main
}//end class

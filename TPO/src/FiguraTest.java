
public class FiguraTest {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
			
		
		Figura[] zbior = {
				new Figura("Nowa",4,5,10), new Figura("Nowa2",6,7,8), new Prostokat("Prostokat3",4,5,6,true)
		};
		
		//Figura temp1 = new Figura("Nowa",4,5,10);
		//Figura temp2 = new Figura("Nowa2",6,7,8);
		//Figura temp3 = new Prostokat("Prostokat3",4,5,6,true);
		
		for(Figura x:zbior){
			System.out.println(x.toString());
		}
		
		
	}

}

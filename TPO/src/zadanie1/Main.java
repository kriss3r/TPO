package zadanie1;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		GenerateDouble nowy = new GenerateDouble();
		GenerateInt nowy2 = new GenerateInt();
		double[] testowa = nowy.generateDouble(5);
		System.out.println(nowy.generateDoubleTest(testowa));
		nowy2.generateIntArray(testowa);
		

	}

}

package generateAndOutput;

import java.util.Random;

public class doubleGen {
	public static double[] arr=null;
	public static double[] generate(int count) {
		arr=new double[count];
		//System.out.println("count " +count);
		//System.out.println("arr length: "+arr.length);
		int rangeMin = 10, rangeMax = 1000;
		double doubl;
		for (int i = 0; i < count; i++) {
			Random r = new Random();
			doubl = rangeMin + (rangeMax - rangeMin) * r.nextDouble();
			//System.out.println("dabel "+doubl);
			arr[i]=doubl;
		}
		return arr;
	}

}

package generateAndOutput;

import java.util.Random;

public class intGen {
	public static int randomValue;
	public static int generate() {
		//int randomValue = 0;
		int rangeMin = 1, rangeMax = 10;
		Random r = new Random();
		randomValue = (int) (rangeMin + (rangeMax - rangeMin) * r.nextDouble());		
		return randomValue;
	}
}

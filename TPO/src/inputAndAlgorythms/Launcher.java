package inputAndAlgorythms;

import java.io.IOException;

public class Launcher {

	public static void main(String[] args) throws IOException, InterruptedException {
		// TODO Auto-generated method stub
		loadFromBin.main(new String[] {"1"});
		Thread.sleep(500);
		loadFromBin.main(new String[] {"2"});
		Thread.sleep(500);
		loadFromBin.main(new String[] {"3"});
		Thread.sleep(500);
		loadFromBin.main(new String[] {"4"});
		Thread.sleep(500);
		loadFromBin.main(new String[] {"5"});
	}

}

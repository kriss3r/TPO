
public class ThreadTester {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Runnable[] runners = new Runnable[10];
		Thread[] threads = new Thread[10];
		
		// deklaracja 10 obiektow klasy ThreadMain implementujacych interfejs Runnable
		for(int i=0;i<10;i++){
			runners[i] = new ThreadMain(i);
		}
		// stworzenie 10 watkow.
		
		for(int i=0;i<10;i++){
		threads[i] = new Thread(runners[i]);
		}
		
		for (int i=0;i<10;i++){
			threads[i].start();
			threads[(int)Math.random()*10].destroy();
		}
		
		
		
	}

}

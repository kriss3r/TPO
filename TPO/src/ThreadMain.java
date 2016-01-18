
public class ThreadMain implements Runnable {
	private int id;
	public ThreadMain(int id) {
		// TODO Auto-generated method stub
		this.id=id;
	}
	
	@Override
	public void run() {
		// TODO Auto-generated method stub
		while(true){
			System.out.println("Thread number = "+id);
			try {
				//usypianie wątkuu na 500ms 
				Thread.sleep(500);
			} catch(InterruptedException e){
				e.printStackTrace();
			}
		}
	}

	

}

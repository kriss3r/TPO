
public class Prostokat extends Figura{
	
	/**
	 * @return the czyProsty
	 */
	public boolean getCzyProsty() {
		return czyProsty;
	}

	/**
	 * @param czyProsty the czyProsty to set
	 */
	public void setCzyProsty(boolean czyProsty) {
		this.czyProsty = czyProsty;
	}

	private boolean czyProsty = false;
	public Prostokat(){
		super();
	}
	
	public Prostokat(String x,int z, int y, int v, boolean czyProsty){
		super(x,z,y,v);
		this.czyProsty=czyProsty;
	}
	
	public String toString(){
		return super.toString()+" CzyProsty = "+czyProsty;
		
	}
}

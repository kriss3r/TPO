
public class Figura {

	String nazwa;
	int rozmiarX;
	int rozmiarY;
	int DimZ;
	public Figura(){
		this.nazwa="B";
		this.rozmiarX=0;
		this.rozmiarY=0;
		
	}
	public Figura(String nazwa, int rozmiarX, int rozmiarY){
		this.nazwa=nazwa;
		this.rozmiarX=rozmiarX;
		this.rozmiarY=rozmiarY;
	}
	
	public Figura(String nazwa, int rozmiarX, int rozmiarY, int DimZ){
		this.nazwa=nazwa;
		this.rozmiarX=rozmiarX;
		this.rozmiarY=rozmiarY;
		//super();
		this.DimZ=DimZ;
	}
	
	
	
	
	public String toString(){
		return "Nazwa = "+this.nazwa;
	}

}

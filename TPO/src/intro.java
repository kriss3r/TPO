
public class intro extends sec{

	protected String Mess;
	protected int count;
	
	public intro(){
		this.Mess="";
	}

	public intro(intro Intr){
		this.Mess=Intr.toString();
		this.count=1;
	}
	
	public boolean testIncrementation(){
		if (this.count>0){
			return true;
		} else {
			return false;
		}
		
	}
	
	
	public void increment(){
		this.count++;
		System.out.print(this.Mess);
	}
	
	@Override
	public int getCount(){
		return this.count;
	}
	@Override
	public String changeMess(String s){
		if (s.isEmpty()!=true){
			this.Mess =s.toString();
			increment();
			return this.Mess;
	
		}else {
			return this.Mess;
		}
	
}		
	
	public String toString(){
		return this.Mess;
	}

	
	public intro(String string) {
		// TODO Auto-generated constructor stub
	this.changeMess(string);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		intro One = new intro("SIEMA ");
		intro Two = new intro(One);
		System.out.print(One.getCount());
		One.changeMess(" Wal sie ");
		System.out.print(One.getCount());
		System.out.print(One.toString());

	}


}
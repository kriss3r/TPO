package zadanie1;

public class GenerateDouble {

	public double[] generateDouble(double x){
		double doubleArray[] = new double[(int)x];
	for (int i=0;i<x;i++){
		System.out.println("wartosc xa" +x);
		double temp;
		temp=((Math.random()*10)+1);
		doubleArray[i]=temp;
		System.out.println(temp);
	}
	return doubleArray;	
	}	
	
public boolean generateDoubleTest(double[] x){
	int iterator =0;
	
	if (x.length>0){
	for(double y:x){
		System.out.println("wartosc argumentu"+iterator+" ="+y);
	iterator++;
	}
	} else {
		return false;
	}
	return true;
}
	
	
}



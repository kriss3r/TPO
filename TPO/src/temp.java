import java.awt.Component;

import javax.swing.*;
public class temp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Hello World");
		//Component parentComponent = null;
		JOptionPane.showMessageDialog(null, "LOLO");
		
	
//		
//		for(int i=0;i<10;i++){
//			System.out.println("numb = "+i);
//			for(int j=0;j<1;j++){
//				System.out.println(" numb2 = "+i*5);
//				
//			}
//		}
		
		String[][] tempik;
		tempik = new String[5][10];
		
		String k ="ABCDEFGHIJ";
		String g ="01234";

		for (int i=0;i<tempik.length;i++){
			for (int y=0;y<tempik[i].length-1;y++){
				tempik[i][y]=String.valueOf(k.charAt(y));
				System.out.println(tempik[i][y].toString());
			}
		}
		
		
		
	}

}

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;


public class fileReader {
	static File plikCsv = new File("C:\\TEMP\\TEMP.csv");

	public static void listFiles(String directoryName) throws IOException{   // listowanie plików	
		File directory = new File(directoryName);	
		if(!directory.canRead()){
			directory.setReadable(true);
			directory.setWritable(true);
		}
		File[] temp = directory.listFiles();
		BufferedReader czytacz = null;
		BufferedWriter czytaczMain = null;
		for(File f:temp){
			System.out.println(f.getAbsolutePath());
			if(f.exists() && f.canRead()){
				czytacz = new BufferedReader(new FileReader(f));
				try {
					FileWriter txt = new FileWriter(plikCsv, true);
					czytaczMain = new BufferedWriter(txt);	
				} catch (IOException e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
				}
				try {
					Scanner x = new Scanner(f);
					while(x.hasNextLine()){	
						String name = f.getName();
						String[] tbl = name.split("\\.");
						czytaczMain.append((tbl[0]+","+x.nextLine()+"\n"));
						czytaczMain.flush();
					}
				} catch (IOException e) {
					e.printStackTrace();
				}
			}
		}
		czytaczMain.close();
	}

	public static void main(String[] args) throws FileNotFoundException {
		// TODO Auto-generated method stub
				
		Scanner temp = new Scanner(System.in);
		
		System.out.println("Podaj sciezke pliku ( format C:\\xxxcd");
		String pom = temp.nextLine();
		if(pom.isEmpty()!=true){
			try {
				listFiles(pom);
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			}else{
				System.out.println("Nie znaleziono katalogu");
			}
			
			
			
		}
		}


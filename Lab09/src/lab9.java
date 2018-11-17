import java.io.*;
import java.util.*;



public class lab9 {
	public static void main(String[] args) throws FileNotFoundException{
		// TODO Auto-generated method stub
		
		Scanner filer = null;
		FileInputStream numreader = new FileInputStream("input.txt");
		FileOutputStream numwriter = new FileOutputStream("output.txt");
		PrintWriter writer = new PrintWriter(numwriter);
		filer = new Scanner(numreader);

		//System.out.print(text);
		int asci;
		String inputData = "";
		char letter;
		String finalString = "";
		
		
		while (filer.hasNext()){
			inputData = filer.next();
			asci = Integer.parseInt(inputData, 2);
			letter = (char)asci;
			finalString += letter;
			
		}
		writer.print(finalString);
		writer.close();
		
		filer.close();
	
	}
	
}

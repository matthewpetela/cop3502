/*
 * Matthew Petela
 * Lab 10
 * November 29, 2017
 * 
 */

public class Lab10 {

	/**
	 * @param args
	 */
	public static void recursivePrinter(int levels){
			boolean okay = false;
		if (levels > 0 && okay == false){
			System.out.println("Going down! " + levels);
			recursivePrinter(levels - 1);
		}
		if (levels!= 0 ){
			System.out.println("Coming back up! " + (levels));
		}
			
		
		}
	
	public static void reversePrint(String str){
		int length = str.length();
		if ((length) > 0) {
			length--;
			char lastChar = str.charAt(length);
			String newString = str.substring(0, length);
			System.out.print(lastChar);
			reversePrint(newString);
		}
	}
	
	public static int factorial(int num){
		if (num == 1){
			return 1;
		}
		else{
			return num * factorial(num - 1);
		}
		
		
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		recursivePrinter(3);
		reversePrint("Alphabet");
		System.out.println();
		System.out.println(factorial(8));

	}

}

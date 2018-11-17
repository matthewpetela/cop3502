/*
Matthew Petela
UFID: 8321-1202
Section Number: 6909
9/20/17
*/
import java.util.Scanner;
import java.lang.Math;

public class Main {
	public static void main(String args[]){

		//declare variables
		int milesPerGallon = 0;
		double tankCapacity = 0, tankPercentage =0;
		int estimatedRange = 0;
		double rawRange = 0;
		int range = 0;
		
		//Scanner
		Scanner scanner = new Scanner(System.in);
		
		//do while for mpg
		//while (milesPerGallon <= 0){
		System.out.print("Enter your car’s MPG rating (miles/gallon) as a positive integer: ");
		milesPerGallon = scanner.nextInt();
		
			if (milesPerGallon <=0){
				System.out.println("ERROR: ONLY POSITIVE INTEGERS ARE ACCEPTED FOR MPG!!!");
				return;
		}//}
	
		//do while for tank capacity
		//while (tankCapacity <= 0){
			System.out.print("Enter your car’s tank capacity (gallons) as a positive decimal number: ");
			tankCapacity = scanner.nextDouble();
			
				if (tankCapacity <=0){
					System.out.println("ERROR: ONLY POSITIVE INTEGERS ARE ACCEPTED FOR TANK CAPACITY!!!");
					return;
			}//}
		
		//do while for gas tank percentage
		//while (tankPercentage <= 0){
			System.out.print("Enter the percentage of the gas tank that is currently filled (from 0-100%): ");
			tankPercentage = scanner.nextDouble();
			
				if (tankPercentage <=0 || tankPercentage > 100 ){
					System.out.println("ERROR: PERCENTAGE MUST BE A DECIMAL NUMBER IN THE RANGE OF 0-100 (INCLUSIVE)!!!");
					return;
			}//}
		
		//formula
		rawRange = milesPerGallon * tankCapacity * (tankPercentage * 0.01);
		range = (int)rawRange;
		
		if (range <= 25){
		System.out.println("Attention! Your current range is running low: " + range + " miles left!!!");
		}
		else{
			System.out.println("Keep driving! Your current range is: " + range + " miles!");
		}
	}
}
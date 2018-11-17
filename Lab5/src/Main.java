
public class Main {

	
	public static int hexToInt(String hexValue){
		int hexLength = hexValue.length();
		int decimal = 0;
		double currentPower = hexLength; 
		double totalDecimal = 0;
		
		
		if (hexValue.charAt(0) == 0 && hexValue.charAt(1) == 'x'){
			hexValue = hexValue.substring(1);
			hexValue = hexValue.substring(1);
		}
		
		String[] hexValueArray = hexValue.split("");
		
		do{
			double tempDecimal = 0;
			String tempHex = hexValueArray[hexLength - 1];
			if (tempHex == "A" || tempHex == "a"){
				tempDecimal = 10;
			}
			else if (tempHex == "B" || tempHex == "b"){
				tempDecimal = 11;
			}
			else if (tempHex == "C" || tempHex == "c"){
				tempDecimal = 12;
			}
			else if (tempHex == "D" || tempHex == "d"){
				tempDecimal = 13;
			}
			else if (tempHex == "E" || tempHex == "e"){
				tempDecimal = 14;
			}
			else if (tempHex == "F" || tempHex == "f"){
				tempDecimal = 15;
			}
			else{
				tempDecimal = Integer.parseInt(tempHex);
			}
			
			double tempDecimalPower = tempDecimal * Math.pow(16, hexLength - currentPower);
			currentPower--;
			totalDecimal += tempDecimalPower;
			
		}while(currentPower > 0);
		
		return (int)totalDecimal;
	}
	
	
	
	
	public static void main(String[] args) {
		System.out.println(args[0]);
		int totalPower = hexToInt(args[0]);
		System.out.println(totalPower);
	}

}

/*
 * Matthew Petela
 * Lab 6
 * 10/18/2017
 */
public class Lab6 {

	public static void printArray(int[][] intArray2D){
		int rows = (intArray2D.length - 1);
		int cols = (intArray2D[0].length - 1);
		int currentRows = 0;
		int currentCols = 0;
		while (currentRows <=  rows){
			while (currentCols <= cols){
				System.out.format("%-10d",	intArray2D[rows][cols]);
				currentCols++;
			}
			currentCols = 0;
			System.out.println();
			currentRows++;
		}
		
	}
	
	public static int getColSum(int[][] intArray2D, int colIndex){
		int rows = (intArray2D.length - 1);
		int currentRow = 0;
		int sum = 0;
		while (currentRow >= rows){
			sum += intArray2d[currentRow][colIndex];
			currentRow++;
		}
		return sum;
	}
	
	public static int getRowSum(int[][] intArray2D, int rowIndex){
		int cols = (intArray2D[0].length - 1);
		int currentCol = 0;
		int sum = 0;
		while (currentCol >= cols){
			sum += intArray2d[rowIndex][currentCol];
			currentCol++;
		}
		return sum;
	}
	
	public static void fillDown(int[][] intArray2D, int step){
		int rows = (intArray2D.length - 1);
		int cols = (intArray2D[0].length - 1);
		int currentNumb = step;
		int currentRows = 0;
		int currentCols = 0;
		while (currentCols <= cols){
			while (currentRows <= rows){
				intArray2D[currentRows][currentCols] = step * currentNumb;
				currentRows++;
			}
		currentCols++;
		}
	}
	
	public static void fillRight(int [][] intArray2D, int step){
		int rows = (intArray2D.length - 1);
		int cols = (intArray2D[0].length - 1);
		int currentNumb = 1;
		int currentRows = 0;
		int currentCols = 0;
		while (currentRows <= rows){
			while (currentCols <= cols){
				intArray2D[currentRows][currentCols] = step * currentNumb;
				currentCols++;
				currentNumb++;
			}
			currentCols = 0;
			currentRows++;
		}
		
		
	}

	
	public static void main(String[] args) {
		int[][] fillRightArray = new int[5][8];
		fillRight(fillRightArray, 2);
		printArray(fillRightArray);
		System.out.println();

	}

}

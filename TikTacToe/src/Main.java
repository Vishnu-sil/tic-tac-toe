import java.util.Scanner;

public class Main {
	
	public static char[][] gameBoard={{' ','|',' ','|',' '},
								{'-','|','-','|','-'},
			{' ','|',' ','|',' '},
			{'-','|','-','|','-'},
			{' ','|',' ','|',' '}};;
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc=new Scanner(System.in);
	
		printGameBoard(gameBoard);
		System.out.println("Enter the value 1-9:");
		

	}

	private static void printGameBoard(char[][] gameBoard) {
		// TODO Auto-generated method stub
		for(int i=0;i<gameBoard.length;i++) {
			for(int j=0;j<gameBoard.length;j++) {
				System.out.print(gameBoard[i][j]);
			}
			System.out.println();
		}
		
	}

}

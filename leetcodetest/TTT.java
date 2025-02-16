package leetcodetest;

import java.util.Scanner;

public class TTT {

	public static void main(String args[]) {
		Scanner scan = new Scanner(System.in);
		
		
		while(true) {
			System.out.print("Would you like to start Tic-Tac-Toe? type yes to start or no to exit the program: ");
			
			
			String start = scan.nextLine();
						
			if(start.equalsIgnoreCase("yes") ) {
				gameStart();
			}else if(start.equalsIgnoreCase("no")) {
				System.exit(0);
			}else {
				System.out.println("That is not a valid input");
				continue;
			}
		}
	}
	
	public static void gameStart() {
		String board[][] = {{" "," "," "}, {" "," "," "}, {" "," "," "}};
		
		int turn = 0;
		boolean isDone = false;
		
		printB(board);
		
		while(true) {
			board = getMove(board, turn);
			if(turn == 8) {
				System.out.println("The game has tied"); 
				break;
			}else if(turn >= 4) {
				if(hasWon(board, turn)) {
					if(turn%2 == 0) {
						System.out.println(" player 1 has won the game!");
						break;
					}else {
						System.out.println(" player 2 has won the game");
						break;
					}
				}
			}
			
			turn++;
		}
		
	}
	
	public static void printB(String[][] board) {
		//Used to print the board
		for(int i = 0; i < board.length ; i++) {
			//Print each row
			System.out.println(board[i][0] + " | " + board[i][1] + " | " + board[i][2]);
			//Print each divider between rows
			if(i != board.length -1) {
				System.out.println("----------");
			}
		}
	}
	
	public static String[][] getMove(String[][] board, int turn) {
		Scanner scan = new Scanner(System.in);
		int row = 0;
		int col = 0;
		
		while(true) {
			//Get input for column (x pos)
			System.out.println("Enter which column you would like to select: ");
			try {
				col = Integer.parseInt(scan.nextLine());
				if(col < 1 || col > 3) {
					System.out.println("invalid input please try again");
					continue;
				}
			}catch(NumberFormatException e) {
				System.out.println("Invalid input please try again");
				continue;
			}
			
			//Get input for row (y pos
			System.out.println("Enter which row you would like to select: ");
			try {
				row = Integer.parseInt(scan.nextLine());
				if(row < 1 || row > 3) {
					System.out.println("invalid input please try again");
					continue;
				}
			}catch(NumberFormatException e) {
				System.out.println("Invalid input please try again");
				continue;
			}
			
			//If the position is empty
			if(board[row-1][col-1].equals(" ")) {
				//Based off which player is currently selecting
				if(turn%2 != 0) {
					//Update the board
					board[row-1][col-1] = "O";
					//Print the board
					printB(board);
					//Check if any player has won
					
				}else {
					//Update the board
					board[row-1][col-1] = "X";
					//Print the board
					printB(board);
					//Check if any player has won
					
				}
			}else {
				//Otherwise a position that has already been selected has once again been selected, let the player pick a different position
				row = 0;
				col = 0;
				System.out.println("Position has already been played, please pick a new one");
				continue;
			}
			
			break;
		}
		
		return board;
	}
	
	public static boolean hasWon(String[][] board, int turn) {
		
		for(int i = 0 ; i < board.length ; i++) {
			//Check columns
			if(board[0][i].equals(board[1][i]) && board[1][i].equals(board[2][i]) && !board[0][i].equals(" ")) {
				System.out.print("The game has been completed through col: " + (i+1) + ",");
				return true;
			}else if(board[i][0].equals(board[i][1]) && board[i][1].equals(board[i][2]) && !board[i][0].equals(" ")) {
				//Check rows
				System.out.print("The game has been completed through row: " + (i+1) + ",");
				return true;
			}
			
		}
		
		if(board[0][0].equals(board[1][1]) && board[1][1].equals(board[2][2])) {
			//Check top left to bottom right diagonal
			System.out.print("The game has been completed through top left to bottom right diagonal,");
			return true;
		}else if(board[0][2].equals(board[1][1]) && board[1][1].equals(board[2][0])) {
			//Check top right to bottom left diagonal
			System.out.print("The game has been completed top right to bottom left diagonal,");
			return true;
		}
		
		return false;
	}
			
	
}

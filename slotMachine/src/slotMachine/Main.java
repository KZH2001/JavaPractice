package slotMachine;
import java.util.Scanner;
import java.util.Random;

public class Main {

	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);
		showMessage("Welcome to Slot Game");
		int balance = 1000;
		int betAmt;
		int payout = 0;
		String playAgain;
		String[] row;
		
		while(balance > 0) {
		System.out.printf("Current Your Balance is $%d ", balance);
		System.out.println();
		System.out.print("Place Your Bet Amount : ");
		betAmt = scanner.nextInt();
		scanner.nextLine();
		if (betAmt > balance) {
			System.out.println("Insufficient Balance");
		}
		else if (betAmt <= 0) {
			System.out.println("Bet must be greater than 0");
		}else {
			balance -= betAmt;
		}
		System.out.println("Spinnig...");
		row = spinRow();
		printRow(row);
		payout = getPayout(row,betAmt);
		
		if (payout > 0) {
			System.out.println("You won $" + payout);
			balance += payout;
		}else {
			System.out.println("Sorry you lost this round");
		}
		System.out.print("Do you want to play again? (Y/N): ");
		playAgain = scanner.nextLine().toUpperCase();
		
		if(!playAgain.equals("Y")) {
			break;
		}
		}
		
		
		
		
		scanner.close();	
		
	}
	
	public static void showMessage(String message) {
		System.out.println("----------------------");
		System.out.println(message);
		System.out.println("----------------------");

		}
	
	static String[] spinRow() {
		String[] symbols = {"🍑","🍟","🥐","🍒","🍄"};
			String[] row = new String[3];
		Random random = new Random();

		
		for (int i = 0;i < 3;i++) {
			row[i] = symbols[random.nextInt(symbols.length)];
		}
		
		return row;

	}
	
	static void printRow(String[] row) {
		System.out.println(" " + String.join(" | ", row));
			
	}
	
	static int getPayout(String[] row,int bet) {
		
		if(row[0].equals(row[1]) && row[1].equals(row[2])) {
			return switch(row[0]) {
			case "🍑" -> bet * 3;
			case "🍟" -> bet * 4;
			case "🥐" -> bet * 5;
			case "🍄" -> bet * 10;
			case "🍒" -> bet * 20;
			default -> 0;

			};
		}else if(row[0].equals(row[1])){
			return switch(row[0]) {
			case "🍑" -> bet * 2;
			case "🍟" -> bet * 3;
			case "🥐" -> bet * 4;
			case "🍄" -> bet * 5;
			case "🍒" -> bet * 10;
			default -> 0;
		};
		}else if(row[1].equals(row[2])){
			return switch(row[1]) {
			case "🍑" -> bet * 2;
			case "🍟" -> bet * 3;
			case "🥐" -> bet * 4;
			case "🍄" -> bet * 5;
			case "🍒" -> bet * 10;
			default -> 0;
		};
		}
		
		 
		return 0;
	}
	
}

package makechange;

import java.util.Scanner;

public class CashRegister {

	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		System.out.print("Enter the price of the item: $");
		double price = scanner.nextDouble();

		System.out.print("Enter the amount tendered: $");
		double amountTendered = scanner.nextDouble();

		double change = amountTendered - price;

		int priceInCents = (int) (price * 100);
		int amountTenderedInCents = (int) (amountTendered * 100);
		int changeInCents = amountTenderedInCents - priceInCents;

		if (amountTendered < price) {
			System.out.println("\nInsufficient amount.\n");
			System.out.println("Would you like to try again? \n(1)YES \t(2)EXIT\n");
			int insufficientChoice = scanner.nextInt();
			if (insufficientChoice == 1) {
				wholeOp();
			}

			else if (insufficientChoice == 2) {
				System.out.println("Goodbye!");
			}
		}

		if (change == 0) {
			System.out.println("\nAmount is paid in full.\n");
			choiceRingUp();
		}

		if (change > 0) {
			System.out.printf("\nYour change is $%.2f", change);
			System.out.println("\n\nCurrency needed for change:");
			currencyList(changeInCents);
			choiceRingUp();
		}

		scanner.close(); // SCANNER CLOSE IN MAIN
	} // END OF MAIN

			
		
	

	public static void wholeOp() {
		
		Scanner scanner = new Scanner(System.in);
		System.out.print("Enter the price of the item: $");
		double price = scanner.nextDouble();
		System.out.print("Enter the amount tendered: $");
		double amountTendered = scanner.nextDouble();
		
		double change = amountTendered - price;

		
		int priceInCents = (int) (price * 100);
		int amountTenderedInCents = (int) (amountTendered * 100);
		int changeInCents = amountTenderedInCents - priceInCents;

		
		if (amountTendered < price) {
			System.out.println("\nInsufficient amount.\n");
			System.out.println("Would you like to try again? \n(1)YES \t(2)EXIT\n");
			int insufficientChoice = scanner.nextInt();
			if (insufficientChoice == 1) {
				wholeOp();
			}

			else if (insufficientChoice == 2) {
				System.out.println("Goodbye!");
			}
		}

		if (change == 0) {
			System.out.println("\nAmount is paid in full.\n");
			choiceRingUp();
		}

		if (change > 0) {
			System.out.printf("\nYour change is $%.2f", change);
			System.out.println("\n\nCurrency needed for change:");
			currencyList(changeInCents);
			choiceRingUp();
		}

	} // END OF WHOLE OPS
	public static void currencyList (int changeInCents) {
		
		int twenties = changeInCents / 2000;
		changeInCents %= 2000;

		int tens = changeInCents / 1000;
		changeInCents %= 1000;

		int fives = changeInCents / 500;
		changeInCents %= 500;

		int ones = changeInCents / 100;
		changeInCents %= 100;

		int quarters = changeInCents / 25;
		changeInCents %= 25;

		int dimes = changeInCents / 10;
		changeInCents %= 10;

		int nickels = changeInCents / 5;
		changeInCents %= 5;

		int pennies = changeInCents;

		// list the bills and coins needed for change
		if (twenties > 0) {
			System.out.println("Twenty Dollar Bill: " + twenties);
		}
		if (tens > 0) {
			System.out.println("Ten Dollar Bill: " + tens);
		}
		if (fives > 0) {
			System.out.println("Five Dollar Bill:  " + fives);
		}
		if (ones > 0) {
			System.out.println("One Dollar Bill: " + ones);
		}

		if (quarters > 0) {
			System.out.println("Quarters: " + quarters);
		}
		if (dimes > 0) {
			System.out.println("Dimes: " + dimes);
		}
		if (nickels > 0) {
			System.out.println("Nickels: " + nickels);
		}
		if (pennies > 0) {
			System.out.println("Pennies: " + pennies);
		}
	} // end of change in cents method
	
	
	public static void choiceRingUp() {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Is there another item to ring up?\n(1)YES \t(2)EXIT");
		int choice = scanner.nextInt();
		if (choice == 1) {
			wholeOp();
		}

		else if (choice == 2) {
			System.out.println("Have a great day!\n*** BE THE CHANGE THAT YOU WANT TO SEE *** ");
		}
	}
	
	} //END CLASS
	
	



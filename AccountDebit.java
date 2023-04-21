/*
 * This java program take amount to be debit from atm and report it
 */
package oops;

import java.util.*;

/**
 * 
 * @author Kaif
 *
 */

public class Account {

	/*
	 * To define method to debit amount from balance and report it with remaining
	 * balance
	 */
	public static void toDebit(int balance, int amount) {
		if (balance < amount) {
			System.out.println("Debit amount exceeded account balance.");
		} else {
			System.out.println("The amount " + amount + " is debited remaining balance is " + (balance - amount));
		}
	}

	/**
	 * This is our main function of program and starting point of program.
	 * 
	 * @param args
	 */

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		System.out.println("Enter Account balance");
		int accountBalance = sc.nextInt();

		System.out.println("Enter amount to be debit");
		int amountDebit = sc.nextInt();

		/*
		 * To call method to debit amount
		 */

		toDebit(accountBalance, amountDebit);
	}
}

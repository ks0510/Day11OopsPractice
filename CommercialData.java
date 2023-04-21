/*
 * This java program maintain the buy and sell of stock account
 */
package oops;

import java.util.*;

/**
 * 
 * @author Kaif
 *
 */

class StockInfo {

}

public class StockAccount {

	/*
	 * To print the value of stock account
	 */

	public static double valueof(int totalAccount) {
		return totalAccount;
	}

	/*
	 * To buy stocks add it to account
	 */

	public static void buy(int amount, String symbol, int totalAccount) {
		totalAccount += amount;
		System.out.println(amount + "worth stocks of " + symbol + " is added to account");
	}

	/*
	 * To sell stocks and subtract the value of shares from account
	 */

	public static void sell(int amount, String symbol, int totalAccount) {
		totalAccount -= amount;
		System.out.println(amount + "worth stocks of " + symbol + " is sold");
	}

	/*
	 * To print stocks in account
	 */

	public static void printReport(String symbol, int valuestock) {

		System.out.println("Current stocks " + symbol + "value is " + valuestock);

	}

	/**
	 * This is main function of our program
	 * 
	 * @param args
	 */

	public static void main(String[] args) {

		ArrayList<StockInfo> stockAccount = new ArrayList<StockInfo>();

		Scanner sc = new Scanner(System.in);

		System.out.println("Enter current stock account value");

		int totalStockValue = sc.nextInt();

		System.out.println("Enter stocks amount to buy stocks");

		int stockAmount = sc.nextInt();

		System.out.println("Enter stock symbol to buy stocks");

		String stockSymbol = sc.next();

		/*
		 * To call out add stocks function
		 */

		buy(stockAmount, stockSymbol, totalStockValue);

		System.out.println("Enter stocks amount to buy stocks");

		int stockAmount2 = sc.nextInt();

		System.out.println("Enter stock symbol to buy stocks");

		String stockSymbol2 = sc.next();

		/*
		 * To call out sell stocks functon
		 */
		sell(stockAmount2, stockSymbol2, totalStockValue);
	}
}

/*
 * This java program take stock price,name and number of stocks and calculate the stock value
 */

package oops;

import java.util.*;

/**
 * 
 * @author Kaif
 *
 */

/*
 * This is Stock Portfolio class to maintain parameters of stocks
 */

class StockPortfolio {
	private String name;
	private int quantity;
	private int price;

	public void StockPortfolio(String name, int quantity, int price) {
		this.name = name;
		this.quantity = quantity;
		this.price = price;
	}

	public String getName() {
		return name;
	}

	public int getQuantity() {
		return quantity;
	}

	public int getPrice() {
		return price;
	}
}

/*
 * This is our main class of program Stockmanagement to move for further process
 */
public class StockAccountManagement {

	/*
	 * To define method which calculate stocks value by taking quantity and price of
	 * stock
	 */

	public static int toCalculateStock(String name, int number, int price) {

		return number * price;
	}

	/**
	 * This our main method of program and starting point of program
	 * 
	 * @param args
	 */

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		System.out.println("Enter the number of stocks");

		int numberofStocks = sc.nextInt();

		int totalAmount = 0;

		/*
		 * To iterate loop with respect to number of stocks
		 */

		for (int i = 1; i <= numberofStocks; i++) {

			/*
			 * To take charcteristics of stocks
			 */

			System.out.println("Enter the name of stock");

			String name = sc.next();

			System.out.println("Enter the quantity of stock");
			int quantity = sc.nextInt();

			System.out.println("Enter the price of stock");
			int priceofstock = sc.nextInt();

			/*
			 * To create Stock portfolio object of using class StockPortfolio
			 */

			StockPortfolio stock = new StockPortfolio();

			stock.StockPortfolio(name, quantity, priceofstock);

			/*
			 * To calculate value of stocks using toCalculateStock method
			 */

			System.out.println("The value of stock " + stock.getName() + " is "
					+ toCalculateStock(stock.getName(), stock.getQuantity(), stock.getPrice()));

			totalAmount += toCalculateStock(stock.getName(), stock.getQuantity(), stock.getPrice());
		}
		System.out.println("The total amount of portfolio is " + totalAmount);
	}
}

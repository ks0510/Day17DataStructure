package datastructureprogram;

/*
 * This java program manage the cash counter of bank
 */
import java.util.*;

/**
 * 
 * @author Kaif
 *
 */

public class BankingCashCounter {
	
	/*
	 * To intialize bank balance 
	 */

	private static int balance = 10000;

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		
		/*
		 * To declare queue
		 */
		Queue queue = new LinkedList<>();
		
		Scanner scanner = new Scanner(System.in);
		
		/*
		 * To give banking operations to customer
		 */
		while (true) {
			System.out.println("Welcome to the Banking Cash Counter!");
			System.out.println("1. Add a person to the queue");
			System.out.println("2. Serve the next person in the queue");
			System.out.println("3. Check the cash balance");
			System.out.println("4. Exit");

			int choice = scanner.nextInt();

			switch (choice) {
			
			/*
			 * To add customer detail in queue
			 */
			case 1:
				System.out.println("Enter person name:");
				String name = scanner.next();
				System.out.println("Enter transaction type (D/W):");
				String type = scanner.next();
				System.out.println("Enter amount:");
				int amount = scanner.nextInt();
				queue.offer(new Person(name, type, amount));
				break;
			/*
			 * To deque and perform banking actions 
			 */
			case 2:
				if (!queue.isEmpty()) {
					Person person = (Person) queue.poll();
					if (person.type.equals("D")) {
						deposit(person.amount);
						System.out.println(person.name + " deposited RS" + person.amount);
					} else if (person.type.equals("W")) {
						if (withdraw(person.amount)) {
							System.out.println(person.name + " withdrew Rs" + person.amount);
						} else {
							System.out.println(person.name + " cannot withdraw Rs" + person.amount);
						}
					}
				} else {
					System.out.println("Queue is empty!");
				}
				break;

			case 3:
				System.out.println("Cash balance is Rs" + balance);
				break;

			case 4:
				System.exit(0);
				break;

			default:
				System.out.println("Invalid choice!");
				break;
			}
		}
	}
	/*
	 * To add money in balance
	 */
	private static void deposit(int amount) {
		balance += amount;
	}
	
	/*
	 * To withdraw cash from bank
	 */

	private static boolean withdraw(int amount) {
		if (amount <= balance) {
			balance -= amount;
			return true;
		} else {
			return false;
		}
	}
	
	/*
	 * Person class for information
	 */

	private static class Person {
		private final String name;
		private final String type;
		private final int amount;

		private Person(String name, String type, int amount) {
			this.name = name;
			this.type = type;
			this.amount = amount;
		}
	}
}

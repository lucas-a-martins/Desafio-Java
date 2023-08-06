package recursive_fibonnaci;

import java.util.Scanner;

public class fibonnaciPosition {

	public static int findValue(int n) {
		if (n == 0) {
			return 0;
		} else if (n == 1) {
			return 1;
		} else {
			return findValue(n - 1) + findValue(n - 2);
		}
	}
	
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int n;
		
		do {
			System.out.print("Enter an integer number greater than or equal to 0: ");
			while(!scanner.hasNextInt()) {
				System.out.print("Invalid input. Enter an integer number greater than or equal to 0: ");
				scanner.next();
			}
			n = scanner.nextInt();
		} while (n < 0);
		
		long value = findValue(n);
		System.out.printf("Value of this position in Fibonnaci sequence: %d\n", value);
		
		scanner.close();

	}

}

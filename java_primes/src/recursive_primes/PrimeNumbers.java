package prime_recursive;

import java.util.Scanner;

public class PrimeNumbers {
	
	public static void findMultiples(boolean primes[], int num, int n) {
		for (int i = 2 * num; i <= n; i += num) {
			primes[i] = true;
		}
	}
	
	public static void recursivePrimes(boolean primes[], int n, int i) {
		if ( i * i > n) {
			printPrimes(primes, n);
			return;
		}
		
		findMultiples(primes, i, n);
		recursivePrimes(primes, n, i + 1);
	}
	
	public static void printPrimes(boolean primes[], int n) {
		System.out.printf("Prime numbers up to %d:\n", n);
		
		for (int i = 2; i <= n; i++) {
			if (primes[i] == false) {
				System.out.printf("%d ", i);
			}
		}
		
		System.out.print("\n");
	}
	
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int n;
		
		do {
			System.out.print("Enter an integer number greater than 1: ");
			while(!scanner.hasNextInt()) {
				System.out.print("Invalid input. Enter an integer number greater than 1: ");
				scanner.next();
			}
			n = scanner.nextInt();
		} while (n <= 1);
		
		boolean[] primes = new boolean[n+1];
		
		recursivePrimes(primes, n, 2);
		
		scanner.close();

	}

}

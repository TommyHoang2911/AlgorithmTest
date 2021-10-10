package Util;

import java.util.Scanner;

public class bai8 {
	private final Scanner scanner = new Scanner(System.in);

	public void doBai8() {
		System.out.println("Nhập phần tử n : ");
		int n = scanner.nextInt();

		printNums(n);
	}

	private void printRec(String number, int extraOnes, int remainingPlaces) {
		// if number generated
		if (0 == remainingPlaces) {
			System.out.print(number + " , ");
			return;
		}

		// Append 1 at the current number and
		// reduce the remaining places by one
		printRec(number + "1", extraOnes + 1, remainingPlaces - 1);

		// If more ones than zeros, append 0 to the
		// current number and reduce the remaining
		// places by one
		if (0 < extraOnes)
			printRec(number + "0", extraOnes - 1, remainingPlaces - 1);
	}

	private void printNums(int n) {
		String str = "";
		printRec(str, 0, n);
	}
}

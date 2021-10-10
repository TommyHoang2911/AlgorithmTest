package Util;

import java.util.Scanner;

public class bai9 {

	private final Scanner scanner = new Scanner(System.in);

	public void doBai9() {
		System.out.println("Nhập phần tử n : ");
		int n = scanner.nextInt();

		for (int i = 2; i <= n; i++) {
			printSequences(n, i);
		}
	}

	private void printArray(int arr[], int size) {
		for (int i = 0; i < size; i++)
			System.out.print(arr[i] + " ");
		System.out.println();
		return;
	}

	private void printSequencesRecur(int arr[], int n, int k, int index) {
		int i;
		if (k == 0) {
			printArray(arr, index);
		}
		if (k > 0) {
			for (i = 1; i <= n; ++i) {
				arr[index] = i;
				printSequencesRecur(arr, n, k - 1, index + 1);
			}
		}
	}

	private void printSequences(int n, int k) {
		int arr[] = new int[k];
		printSequencesRecur(arr, n, k, 0);

		return;
	}
}

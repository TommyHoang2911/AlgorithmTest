package Util;

import java.util.Scanner;

public class bai5 {
	private final Scanner scanner = new Scanner(System.in);

	public void doBai5() {
		System.out.println("Nhập số lượng phần tử n : ");
		int n = scanner.nextInt();

		System.out.println("Tong day so la 1+...+1/n : " + loopOneDiveN(n));
	}

	private float loopOneDiveN(int n) {
		if (n == 0) {
			return 0L;
		} else {
			return ((float) 1 / n) + loopOneDiveN(n - 1);
		}
	}
}

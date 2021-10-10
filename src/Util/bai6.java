package Util;

import java.util.Scanner;

public class bai6 {
	private final Scanner scanner = new Scanner(System.in);

	public void doBai6() {
		System.out.println("Nhập số lượng phần tử n : ");
		int n = scanner.nextInt();

		System.out.println("Tong day so la 1+...+1/n! : " + loopOneDiveN(n));
	}

	private float loopOneDiveN(int n) {
		if (n == 0) {
			return 0L;
		} else {
			return ((float) 1 / tinhGiaiThua(n)) + loopOneDiveN(n - 1);
		}
	}
	
	private long tinhGiaiThua(int n) {
		long giai_thua = 1;
        if (n == 0 || n == 1) {
            return giai_thua;
        } else {
            for (int i = 2; i <= n; i++) {
                giai_thua *= i;
            }
            return giai_thua;
        }
	}
}

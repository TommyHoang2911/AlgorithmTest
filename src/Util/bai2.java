package Util;

import java.util.Scanner;

public class bai2 {
	private final Scanner scanner = new Scanner(System.in);

	public void doBai2() {
		System.out.print("Nhập số nguyên dương a = ");
        int a = scanner.nextInt();
        
        System.out.println("Fibonacci thu a : "+ fibonacci(a));
	}
	
	private int fibonacci(int n) {
		if (n < 0) {
            return -1;
        } else if (n == 0 || n == 1) {
            return n;
        } else {
            return fibonacci(n - 1) + fibonacci(n - 2);
        }
    }
	
}

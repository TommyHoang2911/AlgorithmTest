package Util;

import java.util.Scanner;

public class bai7 {
	private final Scanner scanner = new Scanner(System.in);
	
	public void doBai7() {
		System.out.println("Nhập phần tử n : ");
		int n = scanner.nextInt();
		
		System.out.println("Double factorial"
	            + " is " + doublefactorial(n));
	}
	
	private long doublefactorial(long n)
    {
        if (n == 0 || n==1)
            return 1;
             
        return n * doublefactorial(n - 2);
    }
}

package Util;

import java.util.Scanner;

public class bai1 {
	private final Scanner scanner = new Scanner(System.in);
	
	public void doBai1() {
		
		System.out.print("Nhập số nguyên dương a = ");
        int a = scanner.nextInt();
        System.out.print("Nhập số nguyên dương b = ");
        int b = scanner.nextInt();
 
        System.out.println("USCLN của " + a + " và " + b
                + " là: " + USCLN(a, b));
    }
	
	private int USCLN(int a, int b) {
        if (b == 0) return a;
        return USCLN(b, a % b);
    }
}

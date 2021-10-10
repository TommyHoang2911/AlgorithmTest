package Util;

import java.util.Scanner;

public class bai11 {
	private final Scanner scanner = new Scanner(System.in);

	public void doBai11() {
		System.out.println("Nhập phần tử n : ");
		int n = scanner.nextInt();
		
		find(n);
		
	}
	
	private int find(int n) {
		for(int i = n ; i>=1; i--) {
			if(isPrimeNumber(i)) {
				if(n%i == 0) {
					System.out.print(i + " ");
					return find(n/i);
				}	
			}
		}
		return 1;
	}
	
	private boolean isPrimeNumber(int n) {
        // so nguyen n < 2 khong phai la so nguyen to
        if (n < 2) {
            return false;
        }
        // check so nguyen to khi n >= 2
        int squareRoot = (int) Math.sqrt(n);
        for (int i = 2; i <= squareRoot; i++) {
            if (n % i == 0) {
                return false;
            }
        }
        return true;
    }

}

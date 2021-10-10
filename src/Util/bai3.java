package Util;

import java.util.Scanner;

public class bai3 {
	
	private final Scanner scanner = new Scanner(System.in);
	
	public void doBai3() {
		System.out.println("Nhập số đĩa ban đầu : ");
		int n = scanner.nextInt();
		
        towerOfHanoi(n,'A','C', 'B');
	}
	
	private void towerOfHanoi(int n, char from_rod, char to_rod, char helper_rod)
    {
        if (n == 1)
        {
            System.out.println("Lấy đĩa 1 từ cột " +  from_rod + " sang cột " + to_rod);
            return;
        }
        towerOfHanoi(n-1, from_rod, helper_rod, to_rod);
        System.out.println("Lấy đĩa " + n + " từ cột " +  from_rod + " sang cột " + to_rod);
        towerOfHanoi(n-1, helper_rod, to_rod, from_rod);
    }
}

package Util;

import java.util.Scanner;

public class bai10 {
	
	private final Scanner scanner = new Scanner(System.in);

	public void doBai10() {
		System.out.println("Nhập phần tử n : ");
		int n = scanner.nextInt();

		find(n);
	}
	
	private int find(int decimal_number)
    {
        if (decimal_number == 0)
            return 0;
             
        else
         
        return (decimal_number % 2 + 10 *
                find(decimal_number / 2));
    }
}

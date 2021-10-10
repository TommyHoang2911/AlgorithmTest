package Util;

import java.util.Scanner;

public class bai4 {

	private final Scanner scanner = new Scanner(System.in);
	
	public void doBai4() {
		System.out.println("Nhập số lượng phần tử n : ");
		int n = scanner.nextInt();
		int[] array = new int[n];
		
		if(n >= 0) {
			for(int i =0; i <= n; i++ ) {
				System.out.println("Nhap a["+i+"] :");
				array[i] = scanner.nextInt();
			}
			System.out.println("Nhap phần tử cần tìm : ");
			int search = scanner.nextInt();
			
			binarySearch(array, array[0],array[n], search);
		}else {
			System.out.println("Number input Invalid !");
		}
		
	}
	
	private int binarySearch(int arr[], int l, int r, int search)
    {
        if (r >= l) {
            int mid = l + (r - l) / 2;
  
            if (arr[mid] == search)
                return mid;
       
            if (arr[mid] > search)
                return binarySearch(arr, l, mid - 1, search);
            
            return binarySearch(arr, mid + 1, r, search);
        }
 
        return -1;
    }
}

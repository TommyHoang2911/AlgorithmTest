package main;

import java.util.Scanner;

import Util.bai10;
import Util.bai11;
import Util.bai5;
import Util.bai8;
import Util.bai9;

public class Main {

	private static Scanner scanner = new Scanner(System.in);
	
	public static void main(String[] args) {
		String choose = null;
		boolean exit = false;

		showMenu();
		while (true) {
			choose = scanner.nextLine();
			switch (choose) {
			case "1":
				
				break;
			case "2":
				break;
			case "3":
				
				break;
			case "4":
				
				break;
			case "5":
				bai5 bai5 = new bai5();
				bai5.doBai5();
				break;
			case "6":
				
				break;
			case "7":
				
				break;
			case "8":
				bai8 bai8 = new bai8();
				bai8.doBai8();
				break;
			case "9":
				bai9 bai9 = new bai9();
				bai9.doBai9();
				break;
			case "10":
				bai10 bai10 = new bai10();
				bai10.doBai10();
				break;
			case "11":
				bai11 bai11 = new bai11();
				bai11.doBai11();
				break;
			case "12":
//				bai12 bai12 = new bai12();
//				bai12.doBai12();
				break;
			case "0":
				System.out.println("exited!");
				exit = true;
				break;
			default:
				System.out.println("invalid! please choose action in below menu:");
				break;
			}
			if (exit) {
				break;
			}
			showMenu();
		}
	}
	public static void showMenu() {
		System.out.println("-----------menu------------");
		System.out.println("1. Add student.");
		System.out.println("2. Add Teacher.");
		System.out.println("3. Teacher's salary.");
		System.out.println("4. AvgMark for Student.");
		System.out.println("5. Bài 5.");
		System.out.println("6. Show teacher.");
		System.out.println("7. Sort average Student.");
		System.out.println("8. Bài 8.");
		System.out.println("9. Bài 9.");
		System.out.println("10. Edit Teacher Info.");
		System.out.println("11. Delete Student Info.");
		System.out.println("12. Delete Teacher Info.");
		System.out.println("0. exit.");
		System.out.println("---------------------------");
		System.out.print("Please choose: ");
	}
}

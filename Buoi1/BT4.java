package Buoi1;

import java.util.Scanner;

public class BT4 {
	public int Nhap() {
		Scanner sc = new Scanner(System.in);
		String S=" ";
		int n = 0;
		do {
			System.out.print("Nhap 1 so nguyen: ");
			S = sc.nextLine();
			try {n = Integer.parseInt(S);}
				catch (Exception e) {
					n = Integer.MAX_VALUE;
					System.out.println("Ban nhap sai dinh dang, vui long nhap lai.");
				}
			}
		 while(n == Integer.MAX_VALUE);
		return n;
	}
	public static void main(String[] args) {
		BT4 bt4 = new BT4();
		int a = bt4.Nhap();
		int b = bt4.Nhap();
		System.out.println(a+" + "+b+" = "+(a+b));
	}
}
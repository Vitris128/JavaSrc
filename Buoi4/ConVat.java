package Buoi4;

import java.util.Scanner;

public abstract class ConVat {
	String giong, mau;
	float cannang;
	public abstract void Keu();
	Scanner sc = new Scanner(System.in);
	public ConVat() {
		giong = new String();
		mau = new String();
		cannang = 0.0f;
	}
	public ConVat(ConVat c) {
		giong = new String(c.giong);
		mau = new String(c.mau);
		cannang = c.cannang;
	}
	public void in() {
		System.out.println("["+giong+", "+mau+", "+cannang+"]");
	}
	public String toString() {
		return "["+giong+", "+mau+", "+cannang+"]";
	}
	public void nhap() {
		System.out.print("Nhap giong: ");
		giong = sc.nextLine();
		System.out.print("Nhap mau: ");
		mau = sc.nextLine();
		System.out.print("Can nang: ");
		cannang = sc.nextFloat();
	}
}

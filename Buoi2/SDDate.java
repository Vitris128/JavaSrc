package Buoi2;

import java.util.Scanner;

public class SDDate {
	public static void main(String[] args) {
		Date n = new Date();
		System.out.print("Ngay: ");
		n.in();
		n.nhap();
		System.out.print("Ngay vua nhap: ");
		n.in();
		System.out.print("Ngay hom sau la: ");
		Date m = new Date(n);
		m.ngayHomSau();
		m.in();
		System.out.print("Nhap so ngay thu n sau ngay hien tai: ");
		Scanner  sc = new Scanner(System.in);
		int k = sc.nextInt();
		n.congNgay(k);
		n.in();
	}
}

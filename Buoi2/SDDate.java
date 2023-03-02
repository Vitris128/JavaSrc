package Buoi2;

import java.util.Scanner;

public class SDDate {
	public static void main(String[] args) {
		Date n = new Date();
		System.out.print("Ngay: ");
		n.hienThi();
		n.nhapNgay();
		System.out.print("Ngay vua nhap: ");
		n.hienThi();
		System.out.print("Ngay hom sau la: ");
		Date m = new Date();
		m = n.ngayHomSau();
		m.hienThi();
		System.out.print("Nhap so ngay thu n sau ngay hien tai: ");
		Scanner  sc = new Scanner(System.in);
		int k = sc.nextInt();
		n = n.congNgay(k);
		n.hienThi();
	}
}

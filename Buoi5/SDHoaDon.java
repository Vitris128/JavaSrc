package Buoi5;

import java.util.Scanner;

public class SDHoaDon {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Nhap so luong hoa don: ");
		int n;
		n = sc.nextInt();
		HoaDon dsHD[] = new HoaDon[n];
		System.out.println("---Nhap thong tin cac hoa don---");
		for(int i=0;i<n;i++) {
			dsHD[i] = new HoaDon();
			dsHD[i].nhap();
		}
		System.out.println("\n---------------*************---------------\n");
		System.out.println("---Thong tin khach hang---");
		for(int i=0;i<n;i++) {
			dsHD[i].layKhachHang().in();
		}
		System.out.println("\n---------------*************---------------\n");
		System.out.println("\n-----Tong gia tien cua tung hoa don-----\n");
		for(int i=0;i<n;i++) {
			System.out.println("Tong gia tien cua hoa don "+(i+1)+": "+dsHD[i].tong());
		}
		
	}
}

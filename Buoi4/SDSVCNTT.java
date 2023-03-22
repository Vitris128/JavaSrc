package Buoi4;

import java.util.Scanner;

public class SDSVCNTT {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Nhap so luong sinh vien: ");
		int n = sc.nextInt();
		SinhVienCNTT ds[] = new SinhVienCNTT[n];
		for(int i=0;i<n;i++) {
			ds[i] = new SinhVienCNTT();
			System.out.println("Nhap thong tin sinh vien thu "+(i+1)+": ");
			ds[i].nhap();
			ds[i].nhapDiem();
		}
		String email = new String();
		System.out.println("Nhap dia chi email cua sinh vien can tim: ");
		email = sc.next();
		for(int i=0;i<n;i++) {
			if(ds[i].layEmail().equals(email) ) {
				System.out.println("Tai khoan ELCIT cua sinh vien tren: "+ds[i].layTK());
				System.out.println("Ket qua hoc tap cua sinh vien tren: ");
				ds[i].in();
				ds[i].inDiem();
				System.out.println("Diem trung binh: "+ds[i].diemTB());
				break;
			}
		}
		
	}
}

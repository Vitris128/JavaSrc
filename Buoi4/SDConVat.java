package Buoi4;

import java.util.Scanner;

public class SDConVat {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Nhap so luong con vat: ");
		int n = sc.nextInt();
		ConVat ds[] = new ConVat[n];
		int c;
		for(int i=0;i<n;i++) {
			do {
				System.out.println("Nhap con vat thu "+(i+1)+" [(0) la Bo, (1) la Heo, (2) la De]:");
				c = sc.nextInt();
				if(c==0) ds[i] = new Bo();
				else if(c==1) ds[i] = new Heo();
				else if(c==2) ds[i] = new De();
				else {
					System.out.println("Gia tri khong hop le, vui long nhap lai!");
				}
			}
			while(c<0 || c>2);
			ds[i].nhap();
		}
		System.out.println("Danh sach vat nuoi vua nhap: ");
		for(ConVat cv : ds) {
			System.out.println(cv);
			cv.Keu();
			System.out.println();
		}
	sc.close();	
	}
}

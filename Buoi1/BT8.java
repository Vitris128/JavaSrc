package Buoi1;

import java.util.Arrays;
import java.util.Scanner;

public class BT8 {
	int ds[];
	public int kiemtraNhap() {
		Scanner sc = new Scanner(System.in);
		String s =" ";
		int n = 0;
		do {
			s = sc.nextLine();
			try { n = Integer.parseInt(s); }
				catch (Exception e) {
					n =Integer.MAX_VALUE;
					System.out.println("Ban nhap sai kieu du lieu! Vui long nhap lai: ");
				}
				
		} while(n == Integer.MAX_VALUE);
		return n;
	}
	
	public void nhap() {
		Scanner sc = new Scanner(System.in);
		System.out.print("Nhap so phan tu: ");
		int n = kiemtraNhap();
		ds = new int[n];
		for(int i=0;i<n;i++) {
			System.out.print("Nhap phan tu thu "+(i+1)+": ");
			ds[i] = kiemtraNhap();
		}
	}
	public void in() {
		for(int i=0;i<ds.length;i++) {
			System.out.print(ds[i]+" ");
		}
		System.out.println();
	}
	public int dem(int x) { 
		int c = 0;
		for(int e: ds) {
			if(x == e) c++;
		}
		return c;
	}
	public void sapXep() {
		for(int i=0;i<ds.length-1;i++) 
			for(int j=i+1;j<ds.length;j++)
				if(ds[j]>ds[j]) {
					int temp = ds[j];
					ds[j] = ds[j+1];
					ds[j+1] = temp;
				}
	}
	public void them(int x) {
		ds =Arrays.copyOf(ds, ds.length+1);
		ds[ds.length-1] = x;
	}
	public void xoa(int x) {
		int i;
		for(i=0;i<ds.length;i++)
			if(ds[i] == x) break;
		if(i< ds.length) {
			for(int j=i;j<ds.length-1;j++)
				ds[j] = ds[j+1];
			ds = Arrays.copyOf(ds, ds.length-1);
		} else System.out.println("Khong tim thay "+x);
	}
	
	public static void main(String[] args) {
		BT8 bt8 = new BT8();
		bt8.nhap();
		System.out.print("Danh sach vua nhap la: ");
		bt8.in();
		Scanner sc = new Scanner(System.in);
		System.out.print("Nhap phan tu x: ");
		int x = bt8.kiemtraNhap();
		System.out.println("So phan tu "+x+": "+ bt8.dem(x));
		System.out.print("Danh sach sau khi sap xep la: ");
		bt8.sapXep();
		bt8.in();
		bt8.them(256);
		bt8.them(128);
		bt8.them(399);
		bt8.in();
		bt8.xoa(1);
		bt8.xoa(5);
		bt8.in();
	}
}
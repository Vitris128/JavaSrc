package Buoi2;

import java.util.Scanner;

public class SDPhanSo {
	public static void main(String[] args) {
		PhanSo a = new PhanSo(3, 7);
		PhanSo b = new PhanSo(4, 9);
		System.out.print("Phan so a: ");
		a.hienThi();
		System.out.print("Phan so b: ");
		b.hienThi();
		PhanSo x = new PhanSo();
		PhanSo y = new PhanSo();
		System.out.println("Nhap phan so x: ");
		x.nhapPS();
		System.out.println("Nhap phan so y: ");
		y.nhapPS();
		x.hienThi();
		y.hienThi();
		PhanSo c = new PhanSo();
		c = x.giaTriNghichDao();
		System.out.print("Gia tri nghich dao cua phan so x: ");
		c.hienThi();
		Scanner sc = new Scanner(System.in);
		System.out.print("Nhap gia tri n cong vao phan so x: ");
		int n = sc.nextInt();
		x = x.congPhanSo(n);
		x.hienThi();
		System.out.print("Nhap so luong phan tu cua mang: ");
		n = sc.nextInt();
		PhanSo arr[];
		arr = new PhanSo[n];
		for(int i=0;i<n;i++) {
			arr[i] = new PhanSo();
		}
		PhanSo tongPS = new PhanSo();
		PhanSo maxPS = new PhanSo();
		for(int i=0;i<n;i++) {
			arr[i].nhapPS();
			if(arr[i].lonHon(maxPS)) maxPS = arr[i];
			tongPS = tongPS.congPhanSo(arr[i]);
		}
		System.out.println("Danh sach phan so vua nhap: ");
		for(int i=0;i<n;i++) {
			arr[i].hienThi();
		}
		System.out.print("Tong cua n phan so tren: ");
		tongPS.hienThi();
		System.out.print("Phan so lon nhat la: ");
		maxPS.hienThi();
		for(int i=0;i<n-1;i++) 
			for(int j=0;j<n-i-1;j++) {
				if(arr[j].lonHon(arr[j+1])) {
					PhanSo temp = new PhanSo(arr[j].giaTriTu(), arr[j].giaTriMau());	
					arr[j] = arr[j+1];
					arr[j+1] = temp;
					}
			}
		System.out.println("Danh sach sau khi sap xep: ");
		for(int i=0;i<n;i++) {
			arr[i].hienThi();
		}
	}
}

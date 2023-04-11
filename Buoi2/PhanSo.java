package Buoi2;

import java.util.Scanner;

public class PhanSo {
	private int tu,mau;
	public PhanSo() {
		tu = 0;
		mau = 1;
	}
	public PhanSo(int tu, int mau) {
		this.tu = tu;
		this.mau = mau;
	}
	public void nhapPS() {
		Scanner sc = new Scanner(System.in);
		System.out.print("Nhap tu so: ");
		tu = sc.nextInt();
		System.out.print("Nhap mau so: ");
		mau = sc.nextInt();
		if(mau ==0) {
			System.out.println("Phan vo vua nhap khong hop le! Vui long nhap lai.");
			do {
				System.out.print("Nhap mau so: ");
				mau =sc.nextInt();
			} while(mau ==0);
			
		}
		if(mau<0)
			tu = -tu;
	}
	public void hienThi() {
		if(tu == 0)  {
			System.out.println(0);
			return;
		}
		if(mau == 1) {
			System.out.println(tu);
			return;
		}
		if(tu == mau) {
			System.out.println(1);
			return;
		}
		System.out.println(tu+"/"+mau);
	}
	public int giaTriTu() {
		return tu;
	}
	public int giaTriMau() {
		return mau;
	}
	public void nghichDao() {
		int temp = tu;
		tu = mau;
		mau = temp;
	}
	public PhanSo giaTriNghichDao() {
		PhanSo n = new PhanSo(tu, mau);
		n.tu = mau;
		n.mau = tu;
		return n;
	}
	public float giaTriThuc() {
		return (float)tu/(float)mau;
	}
	public boolean lonHon(PhanSo a) {
		return giaTriThuc()> a.giaTriThuc() ? true : false;
	}
	public PhanSo congPhanSo(PhanSo a) {
		PhanSo b = new PhanSo(tu, mau);
		b.tu = b.tu*a.mau + b.mau*a.tu;
		b.mau = b.mau*a.mau;
		return b;
	}
	
	public PhanSo congPhanSo(int n) {
		PhanSo b = new PhanSo(tu, mau);
		b.tu= b.tu + b.mau*n;
		return b;
	}
	
	public PhanSo truPhanSo(PhanSo a) {
		PhanSo b = new PhanSo(tu, mau);
		b.tu = b.tu*a.mau - b.mau*a.tu;
		b.mau = b.mau*a.mau;
		return b;
	}
	public PhanSo truPhanSo(int n) {
		PhanSo b = new PhanSo(tu, mau);
		b.tu = b.tu - b.mau*n;
		return b;
	}
	
	public PhanSo nhanPhanSo(PhanSo a) {
		PhanSo b = new PhanSo(tu, mau);
		b.tu*=a.tu;
		b.mau*=a.mau;
		return b;
	}
	public PhanSo nhanPhanSo(int n) {
		PhanSo b = new PhanSo(tu, mau);
		b.tu = b.tu*n;
		return b;
	}
	public PhanSo chiaPhanSo(PhanSo a) {
		PhanSo b = new PhanSo(tu, mau);
		b.tu*=a.mau;
		b.mau*=a.tu;
		return b;
	}
	public PhanSo chiaPhanSo(int n) {
		PhanSo b = new PhanSo(tu, mau);
		b.mau = b.mau/n;
		return b;
	}
	
	
}

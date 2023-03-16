package Buoi4;

import java.util.Scanner;

import Buoi2.Diem;

public class DiemMau extends Diem {
	private String mau;
	public DiemMau() {
		super();
		mau = new String();
	}
	public DiemMau(int x, int y, String mau) {
		super(x,y);
		this.mau = new String(mau);
	}
	public DiemMau(DiemMau dm) {
		super(dm);
		mau = new String(dm.mau);
	}
	public void in() {
		super.hienThi();
		System.out.println(", mau: "+mau);
	}
	public String toString() {
		return super.toString()+", mau: "+mau;
	}
	public void in(String s) {
		System.out.println(s);
		in();
	}
	public void nhap() {
		super.nhapDiem();
		Scanner sc = new Scanner(System.in);
		System.out.println("Nhap mau: ");
		mau = sc.nextLine();
	}
	public void ganMau(String mau) {
		this.mau = new String(mau);
	}
	public String layMau() {
		return mau;
	}
	public int layX() {
		return super.giaTriX();
	}
	public int layY() {
		return super.giaTriY();
	}
}

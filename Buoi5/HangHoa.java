package Buoi5;

import java.util.Scanner;

public class HangHoa {
	private String mso, ten, nsxuat;
	
	public HangHoa() {
		this.mso = new String();
		this.ten = new String();
		this.nsxuat = new String();
	}
	public HangHoa(HangHoa h) {
		this.mso = new String(h.mso);
		this.ten = new String(h.ten);
		this.nsxuat = new String(h.nsxuat);
	}
	public void nhap() {
		Scanner sc = new Scanner(System.in);
		System.out.println("Nhap ma so hang hoa: ");
		mso = sc.nextLine();
		System.out.println("Nhap ten hang hoa: ");
		ten = sc.nextLine();
		System.out.println("Nhap nha san xuat hang hoa: ");
		nsxuat = sc.nextLine();
	}
	public void in() {
		System.out.println("--Thong tin hang hoa--");
		System.out.println("Maso: "+mso+", ten: "+ten+", nha san xuat: "+nsxuat);
	}
	public String toString() {
		return "--Thong tin hang hoa--\n"+"Maso: "+mso+", ten: "+ten+", nha san xuat: "+nsxuat;
	}
}

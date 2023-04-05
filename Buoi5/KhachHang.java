package Buoi5;

import java.util.Scanner;

public class KhachHang {
	private String mso,hten;
	private boolean gtinh;
	
	public KhachHang() {
		this.mso = new String();
		this.hten = new String();
		this.gtinh = true;
	}
	public KhachHang(KhachHang k) {
		this.mso = new String(k.mso);
		this.hten = new String(k.hten);
		this.gtinh = k.gtinh;
	}
	public void nhap() {
		Scanner sc = new Scanner(System.in);
		System.out.println("Nhap ma so khach hang: ");
		mso = sc.nextLine();
		System.out.println("Nhap ho va ten khach hang: ");
		hten = sc.nextLine();
		System.out.println("Nhap gioi tinh(true: nam, false: nu): ");
		gtinh = sc.nextBoolean();
	}
	public void in() {
		if(gtinh == true)
			System.out.println("Ma so khach hang: "+mso+", ho va ten: "+hten+", gioi tinh: nam");
		else 
			System.out.println("Ma so khach hang: "+mso+", ho va ten: "+hten+", gioi tinh: nu");
	}
	public String toString() {
		if(gtinh == true)
			return "Ma so khach hang: "+mso+", ho va ten: "+hten+", gioi tinh: nam";
		else 
			return "Ma so khach hang: "+mso+", ho va ten: "+hten+", gioi tinh: nu";
	}
	public float layTiLeGiam() {
		return 0.0f;
	}
}

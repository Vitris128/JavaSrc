package Buoi2;

import java.util.Scanner;

import Buoi3.SinhVien;

public class SinhVienCNTT extends SinhVien {
	Scanner sc = new Scanner(System.in);
	String taikhoan, matkhau, email;
	public SinhVienCNTT() {
		super();
		taikhoan = new String();
		matkhau = new String();
		email = new String();
	}
	public SinhVienCNTT(SinhVienCNTT sv) {
		super(sv);
		taikhoan = new String(sv.taikhoan);
		matkhau = new String(sv.matkhau);
		email = new String(sv.email);
	}
	public SinhVienCNTT(SinhVien s, String taikhoan, String matkhau, String email) {
		super(s);
		this.taikhoan = new String(taikhoan);
		this.matkhau = new String(matkhau);
		this.email = new String(email);
	}
	public void nhap() {
		super.nhap();
		System.out.println("Nhap tai khoan: ");
		taikhoan = sc.nextLine();
		System.out.println("Nhap mat khau: ");
		matkhau = sc.nextLine();
		System.out.println("Nhap email: ");
		email = sc.nextLine();
	}
	public void in() {
		super.in();
		System.out.println("Tai khoan: "+taikhoan+", mat khau: "+matkhau+"\nemail: "+email);
	}
	public String toString() {
		return super.toString()+"Tai khoan: "+taikhoan+", mat khau: "+matkhau+"\nemail: "+email;
	}
	public void doiMK(String newpass) {
		this.matkhau = new String(newpass);
	}
	public String layEmail() {
		return email;
	}
	public String layTK() {
		return taikhoan;
	}
	public String layMK() {
		return matkhau;
	}
}

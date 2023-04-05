package Buoi5;

import java.util.Scanner;

public class KhachHangVIP extends KhachHang{
	private float tilegiam;
	
	public KhachHangVIP() {
		super();
		tilegiam = 0.0f;
	}
	public KhachHangVIP(KhachHangVIP kp) {
		super(kp);
		this.tilegiam = kp.tilegiam;
	}
	public void nhap() {
		super.nhap();
		Scanner sc = new Scanner(System.in);
		System.out.println("Nhap ti le giam: ");
		tilegiam =  sc.nextFloat();
	}
	public void in() {
		super.in();
		System.out.println(". Ti le giam: "+tilegiam);
	}
	public String toString() {
		return super.toString()+". Ti le giam: "+tilegiam;
	}
	public float layTiLeGiam() {
		return tilegiam;
	}
}

package Buoi2;

import java.util.Scanner;

public class Diem {
	private int x,y;
	public Diem() {
		x=0;
		y=0;
	}
	public Diem(int x, int y) {
		this.x = x;
		this.y = y;
	}
	public Diem(Diem b) {
		x = b.x;
		y = b.y;
	}
	public void gan(int x, int y) {
		this.x = x;
		this.y = y;
	}
	public void hienThi() {
		System.out.println("("+x+","+y+")");
	}
	public String toString() {
		return "("+x+","+y+")";
	}
	public void nhapDiem() {
		Scanner sc = new Scanner(System.in);
		System.out.println("Nhap x = ");
		x = sc.nextInt();
		System.out.println("Nhap y = ");
		y = sc.nextInt();
	}
	public void doiDiem(int dx, int dy) {
		x+=dx;
		y+=dy;
	}
	public int giaTriX() {
		return x;
	}
	public int giaTriY() {
		return y;
	}
	public float khoangCach() {
		return (float)Math.sqrt(x*x+y*y);
	}
	public float khoangCach(Diem b) {
		return (float)Math.sqrt(Math.pow(x-b.x,2)+Math.pow(y-b.y, 2));
	}
	
}

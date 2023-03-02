package Buoi1;
import java.util.Scanner;

public class BT5 {
	public double Nhap() {
		Scanner sc = new Scanner(System.in);
		String s = "";
		double n = 0;
		do {
			s = sc.nextLine();
			if(s == "") return 0;
			try {
				n = Double.parseDouble(s);
			} 
			catch (Exception e) {
				n = Double.MIN_EXPONENT;
				System.out.print("Ban da nhap sai kieu du lieu, vui long nhap lai.");
			}
		} while(n == Double.MIN_EXPONENT);
		return n;
	}
	public void Bac1(double a, double b) {
		System.out.print("He so a = 0 => PT bac 1. Nghiem cua phuong trinh la:\n"
				+ "X = "+(-b/a));
		
	}
public void Bac2(double a, double b, double c) {
		double delta = b*b - 4*a*c;
		if(delta < 0) { 
			System.out.print("Delta < 0 => PT vo nghiem.\n"); 
			return;
		}
		if(delta == 0) {
			System.out.print("Delta = 0 => PT co nghiem duy nhat.\nX = "+(-b/2*a));
			return;
		}
		double x1 = (-b + Math.sqrt(delta))/2*a;	
		double x2 = (-b - Math.sqrt(delta))/2*a;	
		System.out.print("Phuong trinh co 2 nghiem phan biet.\nX1 = "+x1+"\tX2 = "+x2);
	}
	
	public static void main(String args[]) {
		BT5 bt5 = new BT5();
		double a = 0, b = 0, c = 0;
		System.out.print("Phuong trinh bac 2 co dang: ax^2 + bx + c = 0\n");
		System.out.print("Nhap he so a: ");
		a = bt5.Nhap();
		System.out.print("Nhap he so b: ");
		b = bt5.Nhap();
		System.out.print("Nhap he so c: ");
		c = bt5.Nhap();
		if(a == 0) {
			System.out.print("Phuong trinh: "+b+"x"+" + "+c+" = 0\n");
			bt5.Bac1(b, c);
		}
		else  {
			System.out.print("Phuong trinh: "+a+"x^2"+" + "+b+"x"+" + "+c+" = 0\n");
			bt5.Bac2(a, b, c);
		}
	}
}
package Buoi5;

import java.util.Scanner;

public class HoaDon {
	private String mso, tde;
	private Date d;
	private KhachHang k;
	private Chitiet c[];

	public HoaDon() {
		mso = new String();
		tde = new String();
		d = new Date();
		k = new KhachHang();
		c = new Chitiet[50];
	}
	public HoaDon(HoaDon h) {
		mso = new String(h.mso);
		tde = new String(h.tde);
		d = new Date(h.d);
		k = new KhachHang(h.k);
		c = new Chitiet[50];
		
		for(int i=0;i<c.length;i++) {
			if(c[i] == null) break;
			c[i] = new Chitiet(h.c[i]);
		}
	}
	public void nhap() {
		Scanner sc = new Scanner(System.in);
		System.out.println("Nhap ma so hoa don: ");
		mso = sc.nextLine();
		System.out.println("Nhap tieu de hoa don: ");
		tde = sc.nextLine();
		System.out.println("Nhap ngay lap hoa don: ");
		d.nhap();
		System.out.println("Nhap khach hang (0) hoac (1) neu la khach hang VIP: ");
		int n = sc.nextInt();
		if(n==1) k = new KhachHangVIP();
		k.nhap();
		System.out.println("Nhap so chi tiet: ");
		n = sc.nextInt();
		for(int i=0;i<n;i++) {
			System.out.println("Nhap chi tiet thu "+(i+1)+": ");
			c[i] = new Chitiet();
			c[i].nhap();
		}
		
	}
	public void in() {
		System.out.println("["+mso+", "+tde+", "+d+", "+k);
		for(int i=0;i<c.length;i++)
			if(c[i]== null) break;
			else System.out.println(","+c[i]);
		System.out.println("]");
	}
	public String toString() {
		String s = new String("["+mso+", "+tde+", "+d+", "+k);
		for(int i=0;i<c.length;i++)
			if(c[i]== null) break;
			else s.concat(","+c[i]);
		s.concat("]");
		return s;
	}
	public long tong() {
		long t=0;
		for(int i=0;i<c.length;i++) {
			if(c[i] == null) break;
			t+=c[i].ttien();
		}
		return (long)(t*(1.1-k.layTiLeGiam()));
	}
	public KhachHang layKhachHang() {
		return k;
	}
}

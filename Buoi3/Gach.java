package Buoi3;

import java.util.Scanner;

public class Gach {
	private String maso;
	private String mau;
	private int soluong, dai, rong;
	private long gia;

	public Gach() {
		maso = new String();
		mau = new String();
		soluong = 0;
		dai = 0;
		rong = 0;
		gia = 0;
	}

	public Gach(String maso, String mau, int soluong, int dai, int rong, long gia) {
		this.maso = new String(maso);
		this.mau = new String(mau);
		this.soluong = soluong;
		this.dai = dai;
		this.rong = rong;
		this.gia = gia;
	}

	public Gach(Gach b) {
		this.maso = new String(b.maso);
		this.mau = new String(b.maso);
		this.soluong = b.soluong;
		this.dai = b.dai;
		this.rong = b.rong;
		this.gia = b.gia;
	}

	public void nhap() {
		Scanner sc = new Scanner(System.in);
		System.out.print("Nhap ma so gach: ");
		maso = sc.nextLine();
		System.out.print("Nhap mau gach: ");
		mau = sc.nextLine();
		sc.nextLine();
		System.out.print("Nhap so luong gach: ");
		soluong = sc.nextInt();
		System.out.print("Nhap chieu dai gach: ");
		dai = sc.nextInt();
		System.out.print("Nhap chieu rong gach: ");
		rong = sc.nextInt();
		System.out.print("Nhap gia tien hop gach: ");
		gia = sc.nextLong();
	}

	public void in() {
		System.out.println("Ma so gach: " + maso + ". Mau gach: " + mau);
		System.out.println("So luong: " + soluong + ". Kich thuoc: " + dai + "x" + rong);
		System.out.println("Gia tien: " + gia);
	}
	public String toString() {
		return "Ma so gach: " + maso + ". Mau gach: " + mau+"\nSo luong: " + soluong + ". Kich thuoc: " + dai + "x" + rong+"\nGia tien: " + gia;
	}

	public void inMSG() {
		System.out.println(maso);
	}

	public double giaHopGach() {
		return gia;
	}

	public double giaBanLe() {
		return gia / soluong * 1.2;
	}

	public int maxArea() {
		return dai * rong * soluong;
	}

	public int soLuongHop(int D, int N) {
		int n1 = D / dai;
		int n2 = N / rong;
		if (n1 * dai != D)
			n1 += 1;
		if (n2 * rong != N)
			n2 += 1;
		return (int) Math.ceil(n1 * n2 / (float) soluong);
	}
}

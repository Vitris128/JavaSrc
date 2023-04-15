package baithi;

import java.util.Scanner;

public class QuocGia {
	private String msqg;
	private String tenqg;
	private String tenthudo;
	private float GDP;

	public QuocGia() {
		this.msqg = new String();
		this.tenqg = new String();
		this.tenthudo = new String();
		GDP = 0.0f;
	}

	public QuocGia(QuocGia QG) {
		this.msqg = new String(QG.msqg);
		this.tenqg = new String(QG.tenqg);
		this.tenthudo = new String(QG.tenthudo);
		GDP = QG.GDP;
	}
	public void nhap() {
		Scanner sc = new Scanner(System.in);
		System.out.println("Nhap ma so quoc gia: ");
		msqg = sc.nextLine();
		System.out.println("Nhap ten quoc gia: ");
		tenqg = sc.nextLine();
		System.out.println("Nhap ten thu do: ");
		tenthudo = sc.nextLine();
		System.out.println("Nhap GDP: ");
		GDP = sc.nextFloat();
		
	}
	public void in() {
		System.out.println("Ma so quoc gia: "+msqg+". Ten quoc gia: "+tenqg+". Ten thu do: "+tenthudo+". GDP: "+GDP);
	}
	public String toString() {
		return "Ma so quoc gia: "+msqg+". Ten quoc gia: "+tenqg+". Ten thu do: "+tenthudo+". GDP: "+GDP;
	}
	
	public float layGDP() {
		return GDP;
	}
	public char layChauLuc() {
		return ' ';
	}
	public String tenQuocGia() {
		return tenqg;
	}
	public static void main(String[] args) {
		QuocGia qg1 = new QuocGia();
		qg1.nhap();
		qg1.in();
		QuocGia qg2 = new QuocGia(qg1);
		qg2.in();
	}

}

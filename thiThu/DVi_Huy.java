import java.util.Scanner;

public class DVi {

	private String msdv;
	private String tendv;
	private int giuong;
	private boolean dchien;
	
	
	
	public DVi() {
		super();
		this.msdv = new String();
		this.tendv = new String();
		this.giuong = 0;
		this.dchien = true;
	}
	
	public DVi(DVi dv) {
		this.msdv = new String(dv.msdv);
		this.tendv = new String(dv.tendv);
		this.giuong = dv.giuong;
		this.dchien = dv.dchien;
	}

	public void nhap() {
		Scanner sc = new Scanner(System.in);
		System.out.println("Nhap ma so don vi: ");
		msdv = sc.nextLine();
		System.out.println("Nhap ten don vi: ");
		tendv = sc.nextLine();
		System.out.println("Nhap so giuong benh: ");
		giuong = sc.nextInt();
		System.out.println("Nhap trang thai benh vien da chien, Co(1) hay Khong(0)");
		int c = sc.nextInt();
		dchien = (c!=0);
	}
	
	@Override
	public String toString() {
		return "Ma so don vi: " + msdv + "\n"
				+ "Ten don vi: " + tendv + "\n"
				+ "So giuong benh: " + giuong + "\n"
				+ "Trang thai benh vien da chien: " + (dchien ? "Co" : "Khong");
	}

	public void xuat() {
		System.out.println(this);
	}
	
	public String getMsdv() {
		return msdv;
	}

	public String getTendv() {
		return tendv;
	}

	public static void main(String[] args) {
		DVi dv1 = new DVi();
		System.out.println("Nhap thong tin cho don vi 1: ");
		dv1.nhap();
		System.out.println("Thong tin cua don vi 1 la: ");
		dv1.xuat();
		DVi dv2 = new DVi(dv1);
		System.out.println("Thong tin cua don vi 2, sao chep tu don vi 1 la: ");
		dv2.xuat();
	}

}

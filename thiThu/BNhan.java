import java.util.HashMap;
import java.util.Scanner;

public class BNhan {
	private DVi dv;
	private String ten;
	private String ngay;
	private float cnang;

	public BNhan() {
		dv = new DVi();
		ten = new String();
		ngay = new String();
		cnang = 0.0f;
	}

	public BNhan(BNhan BN) {
		dv = new DVi(BN.dv);
		ten = new String(BN.ten);
		ngay = new String(BN.ngay);
		cnang = BN.cnang;
	}

	public void nhap() {
		System.out.println("---*** Nhap thong tin ben nhan ***---");
		this.dv.nhap();
		Scanner sc = new Scanner(System.in);
		System.out.println("Nhap ten ben nhan: ");
		this.ten = sc.nextLine();
		System.out.println("Nhap ngay nhap vien(dd/mm/yyyy): ");
		this.ngay = sc.nextLine();
		System.out.println("Nhap can nang cua benh nhan: ");
		this.cnang = sc.nextFloat();
	}

	public void xuat() {
		dv.in();
		System.out.println("Ten ben nhan: " + ten + ". Ngay nhap vien: " + ngay + ". Can nang: " + cnang);

	}

	public String toString() {
		return dv + "Ten ben nhan: " + ten + ". Ngay nhap vien: " + ngay + ". Can nang: " + cnang;
	}

	public String layMDV() {
		return dv.layMDV();
	}

	public DVi layDVI() {
		return dv;
	}

	public String layTen() {
		return ten;
	}

	public String layTG() {
		return ngay;
	}

	public int layNgay() {
		return Integer.parseInt(ngay.substring(0, ngay.indexOf("/")));
	}

	public int layThang() {
		return Integer.parseInt(ngay.substring(ngay.indexOf("/") + 1, ngay.lastIndexOf("/")));
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Nhap so luong benh nhan: ");
		int m = sc.nextInt();
		BNhan bn[] = new BNhan[m];
		for (int i = 0; i < m; i++) {
			bn[i] = new BNhan();
			bn[i].nhap();
		}
		for (BNhan BN : bn) {
			BN.xuat();
		}
		for (BNhan BN : bn) {
			if (BN.layTen().equals("Tran Anh Hao") && BN.layTG().equals("21/11/2021")) {
				System.out.println("\nMa don vi dieu tri cua benh nhan Tran Anh Hao ngay 21/11/2021: " + BN.layMDV()+"\n");
			}
		}
		HashMap<DVi, Integer> DVI = new HashMap<DVi, Integer>();
		System.out.println("\nCac don vi co benh nhan nhap vien trong vong 40 ngay tinh den 21/11/2021: \n");
		for (BNhan BN : bn) {
			if (BN.layThang() == 11 && BN.layNgay() <= 21) {
				DVI.put(BN.layDVI(), DVI.getOrDefault(BN.layDVI(), 0) + 1);
			}
			if (BN.layThang() == 10 && BN.layNgay() >= 12) {
				DVI.put(BN.layDVI(), DVI.getOrDefault(BN.layDVI(), 0) + 1);
			}
		}
		for(DVi dv : DVI.keySet()) {
			System.out.println(dv.layTenDV());
		}
	}
}

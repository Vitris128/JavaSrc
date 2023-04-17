import java.util.HashMap;
import java.util.Scanner;

public class CongTac {

	private NhanVien nv;
	private String dvi;
	private int tnien;
	private boolean bche;
	
	public CongTac() {
		nv = new NhanVien();
		dvi = new String();
		tnien = 0;
		bche = false;
	}
	
	public CongTac(CongTac ct) {
		this.nv = new NhanVien(ct.nv);
		this.dvi = new String(ct.dvi);
		this.tnien = ct.tnien;
		this.bche = ct.bche;
	}
	
	public void nhap() {
		Scanner sc = new Scanner(System.in);
		nv.nhap();
		System.out.println("Nhap don vi cong tac: ");
		dvi = sc.nextLine();
		System.out.println("Nhap tham nien cong tac tai don vi: ");
		tnien = sc.nextInt();
		System.out.println("Nhap thong tin bien che, co bien che(1), hay khong bien che(0)");
		int c = sc.nextInt();
		bche = (c!=0);
	}
	
	@Override
	public String toString() {
		return nv + "\n"
				+ "Don vi cong tac: " +dvi + "\n"
				+ "Tham nien cong tac tai don vi: " + tnien + "\n"
				+ "Bien che: " + (bche ? "Co" : "Khong");
	}
	
	public void in() {
		System.out.println(this);
	}
	
	
	public NhanVien getNv() {
		return nv;
	}
	
	public boolean checkBChe() {
		return bche;
	}

	public static void main(String[] args) {
		System.out.println("Nhap so luong nhan vien trong danh sach: ");
		Scanner sc = new Scanner(System.in);
		int m = sc.nextInt();
		
		CongTac ds[] = new CongTac[m];
		
		for(int i = 0; i < m; i++) {
			System.out.println("Nhap thong tin cho nhan vien thu " + (i+1) + ":");
			ds[i] = new CongTac();
			ds[i].nhap();
		}
		
		System.out.println("/nDach sach nhan vien cong tac la: ");
		
		for(CongTac ct : ds) {
			System.out.println(ct);
		}
		
		System.out.println("Ho ten nhan vien co ma so la \"12346\" la: ");
		
		for(CongTac ct : ds) {
			if(ct.getNv().getMsnv().equals("12346")) {
				System.out.println(ct.getNv().getHten());
			}
		}
		
		System.out.println("So nhan vien trong bien che theo chuc vu la: ");
		
		HashMap<String, Integer> sluongNVien = new HashMap<String, Integer>();
		
		for(CongTac ct : ds) {
			if(ct.checkBChe()) {
				String chucVu = ct.getNv().getCvu();
				int count = sluongNVien.getOrDefault(chucVu, 0);
				sluongNVien.put(chucVu, count + 1);
			}
		}
		
		for(String chucVu : sluongNVien.keySet()) {
			System.out.println(chucVu + ": " + sluongNVien.get(chucVu));
		}

	}

}

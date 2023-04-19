import java.util.Scanner;

public class NhanVien {
	private String msnv;
	private String hten;
	private String cvu;
	private int tnien;
	
	public NhanVien() {
		msnv = new String();
		hten = new String();
		cvu = new String();
		tnien = 0;
	}
	
	public NhanVien(String msnv, String hten, String cvu, int tnien) {
		this.msnv = new String(msnv);
		this.hten = new String(hten);
		this.cvu = new String(cvu);
		this.tnien = tnien;
	}
	
	public NhanVien(NhanVien nv) {
		this.msnv = new String(nv.msnv);
		this.hten = new String(nv.hten);
		this.cvu = new String(nv.cvu);
		this.tnien = nv.tnien;
	}
	
	
	public void nhap() {
		Scanner sc = new Scanner(System.in);
		System.out.println("Nhap ma so nhan vien: ");
		msnv = sc.nextLine();
		System.out.println("Nhap ho va ten nhan vien: ");
		hten = sc.nextLine();
		System.out.println("Nhap chuc vu cua nhan vien: ");
		cvu = sc.nextLine();
		System.out.println("Nhap tham nien cong tac: ");
		tnien = sc.nextInt();
	}
	
	@Override
	public String toString() {
		return "Ma so nhan vien: " + msnv + "\n"
				+ "Ho va ten: " + hten + "\n"
				+ "Chuc vu: " + cvu + "\n"
				+ "Tham nien cong tac: " + tnien;
	}
	
	public void in() {
		System.out.println(this);
	}
	
	
	
	public String getMsnv() {
		return msnv;
	}

	public String getHten() {
		return hten;
	}

	public String getCvu() {
		return cvu;
	}

	public static void main(String[] args) {
		NhanVien nv1 = new NhanVien();
		System.out.println("Hay nhap thong tin cho nhan vien 1: ");
		nv1.nhap();
		System.out.println("\nThong tin cua nhan vien 1 la: ");
		nv1.in();
		System.out.println("Thong tin cua nhan vien 2 la: ");
		NhanVien nv2 = new NhanVien("12345", "Tran Tue Chau", "", 30);
		nv2.in();
		
	}
}

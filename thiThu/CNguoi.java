import java.util.Scanner;

public class CNguoi {

	private String id;
	private String hten;
	private String ngay;
	private char phai;
	
	public CNguoi() {
		id = new String();
		hten = new String();
		ngay = new String();
		phai = 'M';
	}
	
	public CNguoi(CNguoi cn) {
		id = new String(cn.id);
		hten = new String(cn.hten);
		ngay = new String(cn.ngay);
		phai = cn.phai;
	}
	
	public void nhap() {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Nhap so passport hoac CCCD: ");
		id = sc.nextLine();
		System.out.println("Nhap ho va ten: ");
		hten = sc.nextLine();
		System.out.println("Nhap ngay sinh(dd-mm-yyyy): ");
		ngay = sc.nextLine();
		System.out.println("Nhap gioi tinh: Nam(M) hay Nu(F)");
		phai = sc.nextLine().toUpperCase().charAt(0);
	}
	
	@Override
	public String toString() {
		return "ID: " + id + "\n"
				+ "Ho va ten: " + hten + "\n"
				+ "Ngay sinh: " + ngay + "\n"
				+ "Gioi tinh: " + phai;
	}
	
	public void in() {
		System.out.println(this);
	}
	
	public String getHten() {
		return hten;
	}
	
	public int getTuoi() {
		String []parts = ngay.split("-", 3);
		int year = Integer.parseInt(parts[2]);
		return 2023 - year + 1;
	}
	
	public static void main(String[] args) {
		CNguoi c1 = new CNguoi();
		System.out.println("Nhap thong tin cho nguoi thu nhat: ");
		c1.nhap();
		System.out.println("Thong tin cua nguoi thu nhat la: ");
		c1.in();
		CNguoi c2 = new CNguoi(c1);
		System.out.println("Thong tin cua nguoi thu hai, duoc sau chep tu nguoi thu nhat la: ");
		c2.in();
		

	}

	public long tinhLuong() {
		return 0L;
	}

}

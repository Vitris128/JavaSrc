// mssv:b2111938, Name: NHNN, DETHI 1 , MAY 22
import java.util.Scanner;

public class GDich {

	private int mgd;
	private String hten;
	private String ngay;
	private boolean tthai;

	public GDich() {
		this.mgd = 0;
		this.hten = new String();
		this.ngay = new String();
		this.tthai = true;
	}

	public GDich(GDich g) {
		this.mgd = g.mgd;
		this.hten = new String(g.hten);
		this.ngay = new String(g.ngay);
		this.tthai = g.tthai;
	}

	public void nhap() {
		Scanner sc = new Scanner(System.in);
		System.out.println("Nhap ma giao dich: ");
		mgd = sc.nextInt();
		System.out.println("Nhap ho ten: ");
		sc.nextLine();
		hten = sc.nextLine();
		System.out.println("Nhap ngay: ");
		ngay = sc.nextLine();
		System.out.println("Nhap trang thai: ");
		tthai = sc.nextBoolean();
	}

	public void in() {
		System.out.println(
				"ma giao dich: " + mgd + ", ho ten: " + hten + ", ngay: " + ngay + ", trang thai giao dich: " + tthai);
	}

	public String toString() {
		return "ma giao dich: " + mgd + ", ho ten: " + hten + ", ngay: " + ngay + ", trang thai giao dich: " + tthai;
	}

	public static void main(String[] args) {
		GDich gd1 = new GDich();
		System.out.println("Nhap thong tin giao dich: ");
		gd1.nhap();
		gd1.in();
		GDich gd2 = new GDich(gd1);
		System.out.println("ukhfis: ");
		gd2.in();

	}

	public int layMGD() {
		return mgd;
	}

	public float giaTriGD() {
		return 0.0f;
	}

}

import java.util.Scanner;

public class NongSan {

	private char mso;
	private String ten;
	private int dgia;
	private int sluong;
	
	public NongSan() {
		mso = 'a';
		ten = new String();
		dgia = 0;
		sluong = 0;
	}
	
	public NongSan(NongSan ns) {
		mso = ns.mso;
		ten = new String(ns.ten);
		dgia = ns.dgia;
		sluong = ns.sluong;
	}
	
	public void nhap() {
		Scanner sc = new Scanner(System.in);
		System.out.println("Nhap ma so nong san: ");
		mso = sc.nextLine().charAt(0);
		System.out.println("Nhap ten nong san: ");
		ten = sc.nextLine();
		System.out.println("Nhap don gia nong san: ");
		dgia = sc.nextInt();
		System.out.println("Nhap so luong nong san: ");
		sluong = sc.nextInt();
	}
	
	@Override
	public String toString() {
		return "Ma so nong san: " + mso + "\n"
				+ "Ten: " + ten + "\n"
				+ "Don gia: " + dgia + "\n"
				+ "So luong: " + sluong;
	}
	
	public void in() {
		System.out.println(this);
	}
	
	public char getMso() {
		return mso;
	}

	public int getDgia() {
		return dgia;
	}

	public int getSluong() {
		return sluong;
	}
	
	public float getThue() {	
		return 0.0f;
	}
	
	public static void main(String[] args) {
		NongSan ns1 = new NongSan();
		System.out.println("Nhap thong tin cho nong san thu nhat: ");
		ns1.nhap();
		System.out.println("Thong tin cua nong san thu nhat: ");
		ns1.in();
		
		NongSan ns2 = new NongSan(ns1);
		System.out.println("Thong tin cua nong san thu hai, sao chep tu nong san thu nhat: ");
		ns2.in();

	}

}

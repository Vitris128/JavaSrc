import java.util.Scanner;

public class NongSanNK extends NongSan {

	private String dvi;
	private String dchi;
	private String ngay;
	private float thue;
	
	public NongSanNK() {
		super();
		dvi = new String();
		dchi = new String();
		ngay = new String();
		thue = 0.0f;
	}

	public NongSanNK(NongSanNK ns) {
		super(ns);
		dvi = new String(ns.dchi);
		dchi = new String(ns.dchi);
		ngay = new String(ns.ngay);
		thue = ns.thue;
	}
	
	public void nhap() {
		super.nhap();
		Scanner sc = new Scanner(System.in);
		System.out.println("Nhap ten don vi nhap khau: ");
		dvi = sc.nextLine();
		System.out.println("Nhap dia chi cua don vi: ");
		dchi = sc.nextLine();
		System.out.println("Nhap ngay nhap khau(dd-mm-yyyy): ");
		ngay = sc.nextLine();
		System.out.println("Nhap thue nhap khau: ");
		thue = sc.nextFloat();
	}

	@Override
	public String toString() {
		return super.toString() + "\n"
				+ "Don vi nhap khau: " + dvi + "\n"
				+ "Dia chi: " + dchi + "\n"
				+ "Ngay nhap khau: " + ngay + "\n"
				+ "Thue: " + thue;
	}
	
	public void in() {
		System.out.println(this);
	}
	
	public float getThue() {
		return thue;
	}

	public boolean checkDate() {
		String[] dateParts = ngay.split("-", 3);
		int day = Integer.parseInt(dateParts[0]);
		int month = Integer.parseInt(dateParts[1]);
		int year = Integer.parseInt(dateParts[2]);
		
		if(year < 2010) {
			return false;
		}
		
		return true;
	}
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Nhap so luong nong san trong danh sach: ");
		int n = sc.nextInt();
		
		NongSan[] ds = new NongSan[n];

		for(int i = 0; i < n; ++i) {
			System.out.println("Nhap nong san thu " + (i+1) + ", Nong San(0) hay Nong San Nhap Khau(1): ");
			ds[i] = new NongSan();
			int c = sc.nextInt();
			if(c == 1) {
				ds[i] = new NongSanNK();
			}
			
			ds[i].nhap();
		}
		
		System.out.println("\nThong tin cac nong san trong danh sach la:\n");
		
		for(NongSan ns : ds) {
			ns.in();
			System.out.println("");
		}
		
		System.out.println("Ma so cua nhung Nong San Nhap Khau co gia nho hon 1 trieu la");
		
		for(NongSan ns : ds) {
			if(ns instanceof NongSanNK && ns.getDgia() * ns.getSluong() * (1 + ns.getThue()) < 1000000) {
				System.out.println(ns.getMso());
			}
		}
		
		System.out.println("\nThong tin nhung nong san duoc nhap khau tu 01/2010 la: ");
		
		for(NongSan ns : ds) {
			if(ns instanceof NongSanNK && ((NongSanNK) ns).checkDate()) {
				ns.in();
			}
		}
		
	}

}

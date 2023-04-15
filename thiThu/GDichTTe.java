import java.util.Scanner;
//// mssv:b2111938, Name: NHNN, DETHI 1 , MAY 22
public class GDichTTe extends GDich {
	private float dgia;
	private int sluong;
	private char loai;
	private float tgia;
	
	public GDichTTe() {
		super();
		dgia = 0.0f;
		sluong = 0;
		loai = ' ';
		tgia = 0.0f;
	}
	public GDichTTe(GDichTTe t) {
		super(t);
		this.dgia = t.dgia;
		this.sluong = t.sluong;
		this.loai = t.loai;
		this.tgia = t.tgia;
	}

	public void nhap() {
		super.nhap();
		Scanner sc = new Scanner(System.in);
		System.out.println("Nhap don gia: ");
		this.dgia = sc.nextFloat();
		System.out.println("Nhap so luong: ");
		this.sluong = sc.nextInt();
		System.out.println("Nhap loai: ");
		this.loai = sc.next().charAt(0);
		System.out.println("Nhap ti gia: ");
		this.tgia = sc.nextFloat();
	}

	public void in() {
		super.in();
		
	}

	public float laydGia() {
		return dgia;
	}

	public float giaTriGD() {
		return dgia * sluong * tgia;
	}

	public static void main(String[] args) {
		System.out.println("Nhap so luong phan tu cua danh sach");
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		GDich ds[] = new GDich[n];
		for (int i = 0; i < n; i++) {
			System.out.println("Nhap 0 neu la GDich, 1 neu la GDichTTe");
			int c;
			ds[i] = new GDich();
			c = sc.nextInt();
			if (c == 0) {				
				ds[i].nhap();
			} else if (c == 1) {
				ds[i] = new GDichTTe();
				ds[i].nhap();
			}
		}
		System.out.println("Danh sach cac giao dich: ");
		for (int i = 0; i < n; i++) {
			ds[i].in();
		}
		System.out.println("\nDanh sach cac ma giao dich co gia tri > 100.000 VND: ");
		for (int i = 0; i < n; i++) {
			if (ds[i] instanceof GDichTTe) {
				if (ds[i].giaTriGD() >= 100000)
					System.out.println("Ma giao dich: "+ds[i].layMGD() + "\n");
			}
		}
		System.out.println("Thong ke tien cua cac giao dich theo nam-thang: ");

	}

}

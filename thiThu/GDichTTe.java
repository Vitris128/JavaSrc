import java.util.Scanner;

// mssv:b2111938, Name: NHNN, DETHI 1 , MAY 22
public class GDichTTe extends GDich {
	private float dgia;
	private int sluong;
	private char loai;
	private float tgia;

	public void nhap() {

	}

	public void in() {

	}
	public float laydGia() {
		return dgia;
	}

	public static void main(String[] args) {
		System.out.println("Nhap so luong phan tu cua danh sach");
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		GDich ds[] = new GDich[n];
		for (int i = 0; i < n; i++) {
			System.out.println("Nhap 0 neu la GDich, 1 neu la GDichTTe");
			int c = sc.nextInt();
			if (c == 0) {
				ds[i] = new GDich();
				ds[i].nhap();
			} else if (c == 1) {
				ds[i] = new GDichTTe();
				ds[i].nhap();
			}
		}
		for (int i = 0; i < n; i++) {
			ds[i].in();
		}
		
	}

}

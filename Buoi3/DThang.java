package Buoi3;
import Buoi2.Diem;
public class DThang {
	private Diem d1,d2;
	public DThang() {
		d1 = new Diem();
		d2 = new Diem();
	}
	public DThang(Diem a, Diem b) {
		d1 = new Diem(a);
		d2 = new Diem(b);
	}
	public DThang(DThang b) {
		d1 = new Diem(b.d1);
		d2 = new Diem(b.d2);
	}
	public void nhap() {
		System.out.println("Nhap toa do d1: ");
		d1.nhapDiem();
		System.out.println("Nhap toa do d2: ");
		d2.nhapDiem();
	}
	public void in() {
		System.out.println("["+d1+","+d2+"]");
	}
	public String toString() {
		return "["+d1+","+d2+"]";
	}
	public float doDai() {
		return d1.khoangCach(d2);
	}
	public void tinhtien(int dx, int dy) {
		d1.doiDiem(dx, dy);
		d2.doiDiem(dx, dy);
	}
	public double degree() {
		double alpha = (float)(d2.giaTriY()-d1.giaTriY())/(d2.giaTriX()-d1.giaTriX());
//		return alpha;
		return Math.toDegrees(Math.atan(alpha));
		}
}

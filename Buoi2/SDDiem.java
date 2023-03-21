package Buoi2;

public class SDDiem {
	public static void main(String[] args) {
		Diem a = new Diem(3,4);
		System.out.println("Diem A: ");
		a.in();
		Diem b = new Diem();
		System.out.println("Diem B: ");
		b.nhap();
		b.in();
//		System.out.println("Tịnh tiến B 1 khoảng (6,9): ");
//		b.doiDiem(6,9);
//		b.hienThi();
		Diem c = new Diem();
		c.tinhtien(-b.giaTriX(),-b.giaTriY());
		System.out.println("Điem c doi xung voi B qua O: ");
		c.in();
		System.out.println("Khoang cach BO ="+b.khoangCach());
		System.out.println("Khoang cach AB = "+a.khoangCach(b));
		
	}
}

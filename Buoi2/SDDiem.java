package Buoi2;

public class SDDiem {
	public static void main(String[] args) {
		Diem a = new Diem(3,4);
		System.out.println("Diem A: ");
		a.hienThi();
		Diem b = new Diem();
		System.out.println("Diem B: ");
		b.nhapDiem();
		b.hienThi();
//		System.out.println("Tịnh tiến B 1 khoảng (6,9): ");
//		b.doiDiem(6,9);
//		b.hienThi();
		Diem c = new Diem();
		c.doiDiem(-b.giaTriX(),-b.giaTriY());
		System.out.println("Điem c doi xung voi B qua O: ");
		c.hienThi();
		System.out.println("Khoang cach BO ="+b.khoangCach());
		System.out.println("Khoang cach AB = "+a.khoangCach(b));
		
	}
}

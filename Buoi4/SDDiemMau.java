package Buoi4;

import Buoi2.Diem;

public class SDDiemMau {
	public static void main(String[] args) {
		DiemMau a = new DiemMau(5,10,"Trang");
		DiemMau b = new DiemMau();
		b.nhap();
		b.doiDiem(10, 8);
		b.in();
		b.ganMau("Vang");
		b.in();
	}
}

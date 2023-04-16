import java.util.Scanner;

import javax.print.attribute.standard.MediaSize.NA;

public class DCo {

	private String ten;
	private float dtich;
	private String ngay;
	
	public DCo() {
		ten = new String();
		dtich = 0.0f;
		ngay = new String();
	}
	
	public DCo(DCo dc) {
		ten = new String(dc.ten);
		dtich = dc.dtich;
		ngay = new String(dc.ngay);
	}
	
	public void nhap() {
		Scanner sc = new Scanner(System.in);
		System.out.println("Nhap ten cho dong co: ");
		ten = sc.nextLine();
		System.out.println("Nhap dung tich cua dong co: ");
		dtich = sc.nextFloat(); sc.nextLine();
		System.out.println("Hay nhap ngay-thang-nam(dd-mm-yyyy) san xuat dong co: ");
		ngay = sc.nextLine();
	}
	
	@Override
	public String toString() {
		return "Ten dong co: " + ten + "\n"
				+ "Dung tich: " + dtich + "\n"
				+ "Ngay san xuat: " + ngay;
	}
	
	public void in() {
		System.out.println(this);
	}
	
	public String getNgay() {
		return ngay;
	}
	
	public String getTen() {
		return ten;
	}
	
	public static void main(String[] args) {
		DCo d1 = new DCo();
		System.out.println("Nhap thong tin cho dong co d1: ");
		d1.nhap();
		System.out.println("Thong tin cua dong co d1: ");
		d1.in();
		DCo d2 = new DCo(d1);
		System.out.println("\nThong tin cua dong co d2, sao chep tu d1: " );
		d2.in();
		
	}

}

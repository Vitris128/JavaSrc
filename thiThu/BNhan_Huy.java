import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Scanner;

import javax.swing.text.DateFormatter;

public class BNhan {

	private DVi dvi;
	private String ten;
	private String ngay;
	private float cnang;
	
	public BNhan() {
		dvi = new DVi();
		ten = new String();
		ngay = new String();
		cnang = 0.0f;
	}
	
	public BNhan(BNhan bn) {
		dvi = new DVi(bn.dvi);
		ten = new String(bn.ten);
		ngay = new String(bn.ngay);
		cnang = bn.cnang;
	}
	
	public void nhap() {
		Scanner sc = new Scanner(System.in);
		System.out.println("Nhap thong tin don vi cua benh nhan: ");
		dvi.nhap();
		System.out.println("Nhap ho ten cua benh nhan: ");
		ten = sc.nextLine();
		System.out.println("Nhap ngay nhap vien cua benh nhan(dd-mm-yyyy): ");
		ngay = sc.nextLine();
		System.out.println("Nhap can nang cua benh nhan: ");
		cnang = sc.nextFloat();
	}
	
	@Override
	public String toString() {
		return dvi + "\n"
				+ "Ho ten benh nhan: " + ten + "\n"
				+ "Ngay nhap vien: " + ngay + "\n"
				+ "Can nang: " + cnang;
	}
	
	public void xuat() {
		System.out.println(this);
	}
	
	public DVi getDvi() {
		return dvi;
	}

	public String getTen() {
		return ten;
	}
	
	public String getNgay() {
		return ngay;
	}

	public boolean checkDate() {
		DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd-MM-yyyy");
		String end = "21-11-2021";
		LocalDate endDate = LocalDate.parse(end, formatter);
		LocalDate startDate = endDate.minusDays(40);
		LocalDate dateToCompare = LocalDate.parse(ngay, formatter);
		return (dateToCompare.isAfter(startDate) && dateToCompare.isBefore(endDate)) || dateToCompare.isEqual(startDate) || dateToCompare.isEqual(endDate);
	}
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Nhap so luong benh nhan trong danh sach: ");
		int m = sc.nextInt();
		
		BNhan bn[] = new BNhan[m];
		
		for(int i = 0; i < m; ++i) {
			System.out.println("Nhap thong tin cho benh nhan thu " + (i+1) + ": ");
			bn[i] = new BNhan();
			bn[i].nhap();
		}
		
		System.out.println("\nThong tin cua cac benh nhan trong danh sach la: ");
		
		int i = 1;
		for(BNhan b : bn) {
			System.out.println("Thong tin cua benh nhan thu " + (i) + " la: ");
			b.xuat();
			System.out.println("");
		}

		
		System.out.println("Ma don vi cua benh nhan \"Tran Anh Hao\" nhap vien ngay 21/11/2021 la: ");
		for(BNhan b : bn) {
			if(b.getTen().equals("Tran Anh Hao") && b.getNgay().equals("21-11-2021")) {
				System.out.println(b.getDvi().getMsdv());
			}
		}
		
		System.out.println("Ten cac don vi co so benh nhan nhap vien nhieu nhat trong vong 40 ngay tinh den 21/11/2021 la: ");
		
		HashMap<String, Integer> dviCount = new HashMap();
		
		for(BNhan b : bn) {
			if(b.checkDate()) {
				String tenDvi = b.getDvi().getTendv();
				int count = dviCount.getOrDefault(tenDvi, 0);
				dviCount.put(tenDvi, count + 1);
			}
		}
		
		int max = Integer.MIN_VALUE;
		
		for(String tenDvi : dviCount.keySet()) {
			if(dviCount.get(tenDvi) > max) {
				max = dviCount.get(tenDvi);
			}
		}
		
		for(String tenDvi : dviCount.keySet()) {
			if(dviCount.get(tenDvi) == max) {
				System.out.println(tenDvi);
			}
		}
			
	}

}

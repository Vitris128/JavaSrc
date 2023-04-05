package Buoi5;
import java.util.Scanner;

public class Chitiet {
	private HangHoa h;
	private int soluong;
	private long dgia;
	
	public Chitiet() {
		this.h = new HangHoa();
		this.soluong = 0;
		this.dgia = 0;
	}
	public Chitiet(Chitiet c) {
		this.h = new HangHoa(c.h);
		this.soluong = c.soluong;
		this.dgia = c.dgia;
	}
	
	public long ttien() {
		return dgia*soluong;
	}
	public void nhap() {
		Scanner sc = new Scanner(System.in);
		System.out.println("Nhap thong tin hang hoa: ");
		h.nhap();
		System.out.println("Nhap so luong:");
		soluong = sc.nextInt();
		System.out.println("Nhap don gia:");
		dgia = sc.nextLong();
	}
	public void in() {
		System.out.println(h+" so luong: "+soluong+", don gia: "+dgia+", thanh tien: "+ttien());
	}
	public String toString() {
		return h+" so luong: "+soluong+", don gia: "+dgia+", thanh tien: "+ttien();
	}
}

package Buoi1;
import java.util.Scanner;

public class BT7 {
	public String TachTen(String s) {
		int lastSpace = s.lastIndexOf(" ");
		String ten = s.substring(lastSpace);
		return ten;
	}
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Nhap ho va ten: ");
		String name = sc.nextLine();
		BT7 bt7 = new BT7();
		String ten = bt7.TachTen(name);
		System.out.print("Ten: "+ten);
		sc.close();
	}
}
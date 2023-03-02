package Buoi3;
import java.util.Scanner;
import Buoi2.Diem;

public class SDDThang {
	public static void main(String[] args) {
		Diem a = new Diem(6,8);
		Diem b = new Diem(20,15);
		DThang ab = new DThang(a,b);
		System.out.print("DThang ab: ");
		ab.in();
		System.out.println("Tinh tien dthang ab: ");
		ab.tinhtien(3,7);
		ab.in();
		System.out.printf("Chieu dai ab: %.2f\n",ab.doDai());
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Nhap so phan tu: ");
		int n =  sc.nextInt();
		DThang ds[];
		ds = new DThang[n];
		for(int i=0;i<n;i++) {
			ds[i] = new DThang();
			System.out.println("Nhap dthang thu:"+(i+1)+": ");
			ds[i].nhap();
		}
		for(DThang d : ds) {
			System.out.println(d);
		}
		
	}
}

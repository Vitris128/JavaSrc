package Buoi5;
import java.util.Scanner;

public class Date {
	private int ngay,thang,nam;
	private String s;
	public Date() {
		this.ngay = 1;
		this.thang = 1;
		this.nam = 2023;
	}
	public Date(int ngay, int thang, int nam) {
		this.ngay = ngay;
		this.thang = thang;
		this.nam = nam;
	}
	public Date(Date dat) {
		ngay = dat.ngay;
		thang = dat.thang;
		nam = dat.nam;
	}
	public void in() {
		if(ngay<10) {
			System.out.print("0"+ngay+"/");
		}else {
			System.out.print(ngay+"/");
		}
		if(thang<10) {
			System.out.println("0"+thang+"/"+nam);
		} else {
			System.out.println(thang+"/"+nam);
		}
			
	}
	public String toString() {
		s = new String();
		if(ngay<10) {
			s+="0"+ngay+"/";
		}else {
			s+=ngay+"/";
		}
		if(thang<10) {
			s+="0"+thang+"/"+nam;
		} else {
			s+=thang+"/"+nam;
		}
		return s;
	}
	public void nhap() {
		Scanner sc = new Scanner(System.in);
		do {
			System.out.print("Nhap ngay: ");
			ngay = sc.nextInt();
			System.out.print("Nhap thang: ");
			thang = sc.nextInt();
			System.out.print("Nhap nam: ");
			nam = sc.nextInt();
		} while(!hopLe());
	}
	public boolean hopLe() {
		int max[] = {0,31,28,31,30,31,30,31,31,30,31,30,31};
		if((nam%4 == 0 && nam%100 != 0)||(nam%400==0)) {
			max[2] = 29;
		}
		boolean h = false;
		if(nam>0 && thang > 0 && thang <13 && ngay>0 && ngay<=max[thang])
			h = true;
		return h;
	}
	
}

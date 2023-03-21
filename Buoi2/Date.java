package Buoi2;

import java.util.Scanner;

public class Date {
	private int d,m,y;
	private String s;
	public Date() {
		d = 1;
		m = 1;
		y = 2023;
	}
	public Date(int d, int m, int y) {
		this.d = d;
		this.m = m;
		this.y = y;
	}
	public Date(Date dat) {
		d = dat.d;
		m = dat.m;
		y = dat.y;
	}
	public void in() {
		if(d<10) {
			System.out.print("0"+d+"/");
		}else {
			System.out.print(d+"/");
		}
		if(m<10) {
			System.out.println("0"+m+"/"+y);
		} else {
			System.out.println(m+"/"+y);
		}
			
	}
	public String toString() {
		s = new String();
		if(d<10) {
			s+="0"+d+"/";
		}else {
			s+=d+"/";
		}
		if(m<10) {
			s+="0"+m+"/"+y;
		} else {
			s+=m+"/"+y;
		}
		return s;
	}
	public void nhap() {
		Scanner sc = new Scanner(System.in);
		do {
			System.out.print("Nhap ngay: ");
			d = sc.nextInt();
			System.out.print("Nhap thang: ");
			m = sc.nextInt();
			System.out.print("Nhap nam: ");
			y = sc.nextInt();
		} while(!hopLe());
	}
	public boolean hopLe() {
		int max[] = {0,31,28,31,30,31,30,31,31,30,31,30,31};
		if((y%4 == 0 && y%100 != 0)||(y%400==0)) {
			max[2] = 29;
		}
		boolean h = false;
		if(y>0 && m > 0 && m <13 && d>0 && d<=max[m])
			h = true;
		return h;
	}
	
	public Date congNgay() {
		Date n = new Date(d,m,y);
		n.d++;
		if(!n.hopLe()) {
			n.d = 1;
			n.m++;
			if(!n.hopLe()) {
				n.m = 1;
				n.y++;
			}
		}
		return n;
	}
	public Date ngayHomSau() {
		Date n = new Date(d,m,y);
		return n.congNgay();
	}
	
	public Date congNgay(int k) {
		Date n = new Date(d,m,y);
		for(int i=0;i<k;i++) 
			n = n.congNgay();
		return n;
	}	
}

package Buoi3;

import java.util.Scanner;

class SDSinhVien {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		SinhVien a = new SinhVien();
		System.out.println("------------ Nhap thong tin sinh vien ------------");
		a.nhap();
		a.nhapDiem();
		System.out.println("Them mon LTDT co diem la A.");
		a.dangKyHP("LTDT", "A");
		a.in();
		a.inDiem();
		System.out.println("\nDiem TB: "+a.diemTB());
		System.out.println("\n------------*********------------");
		System.out.print("---Nhap so luong sinh vien: "); 
		int n = sc.nextInt();
		SinhVien[] dsSV = new SinhVien[n];
		for(int i=0;i<n;i++) {
			dsSV[i] = new SinhVien();
					System.out.println("---Nhap thong tin sinh vien thu "+(i+1)+": ");
			dsSV[i].nhap();
			dsSV[i].nhapDiem();
		}
		System.out.println("------------*********------------");
		System.out.println("Danh sach vua nhap la: ");
		for(int i = 0;i<n;i++) {
			System.out.println("---Thong tin sinh vien thu "+(i+1)+":\n\t"+
		dsSV[i]+"\tDiem TB: "+dsSV[i].diemTB());
		}
		System.out.println("------------*********------------");
		System.out.println("---Danh sach sinh vien bi canh bao hoc vu: ");
		for(SinhVien sv : dsSV) {
			if(sv.diemTB()<=1)
				System.out.println("\t"+sv.tenSV()+" : "+sv.MSSV());
		}
		System.out.println("------------*********------------");
		float max = dsSV[0].diemTB();
		for(int i=0;i<n;i++) {
			if(dsSV[i].diemTB()> max) {
				 max = dsSV[i].diemTB();
			}
		}
		System.out.println("---Sinh vien diem cao nhat: \n\t");
		for(SinhVien svTot : dsSV) {
			if(svTot.diemTB() == max)
				System.out.println(svTot.toString()+svTot.diemTB());
		}
		
		for(int i=0;i<n;i++) {
			for(int j = i+1;j<n;j++) {
				if(dsSV[i].tenSV().compareTo(dsSV[j].tenSV())>0) {
					SinhVien temp = dsSV[i];
					dsSV[i] = dsSV[j];
					dsSV[j] = temp;
				}
			}
			
		}
		System.out.println("---Danh sach sinh vien xep theo ten: ");
		for(SinhVien sv : dsSV) {
			System.out.print("\t"+sv);
		}
		sc.close();
	}
}

package Buoi3;

import java.util.Scanner;

import Buoi2.Date;

public class SinhVien {
	private String MSSV;
	private String hoVaTen;
	private Date ngaySinh;
	private int soHP;
	private String[] dsHP;
	private String[] diemHP;
	private final int soHPMax = 50;
	Scanner sc = new Scanner(System.in);

	public SinhVien() {
		MSSV = new String();
		hoVaTen = new String();
		ngaySinh = new Date();
		soHP = 0;
		dsHP = new String[soHPMax];
		diemHP = new String[soHPMax];
	}

	public SinhVien(String MSSV, String hoVaTen, Date ngaySinh, int soHP, String dsHP[], String diemHP[]) {
		this.MSSV = new String(MSSV);
		this.hoVaTen = new String(hoVaTen);
		this.ngaySinh = new Date(ngaySinh);
		this.soHP = soHP;
		this.dsHP = new String[soHPMax];
		this.diemHP = new String[soHPMax];
		for (int i = 0; i < soHP; i++) {
			this.dsHP[i] = dsHP[i];
			this.diemHP[i] = diemHP[i];
		}
	}

	public SinhVien(SinhVien b) {
		MSSV = new String(b.MSSV);
		hoVaTen = new String(b.hoVaTen);
		ngaySinh = new Date(b.ngaySinh);
		soHP = b.soHP;
		dsHP = new String[soHPMax];
		diemHP = new String[soHPMax];
	}

	public void nhap() {
		System.out.print("Nhap ho va ten: ");
		hoVaTen = sc.nextLine();
		System.out.print("Nhap MSSV: ");
		MSSV = sc.nextLine();
		System.out.println("---Nhap ngay thang nam sinh---");
		ngaySinh.nhapNgay();

	}

	public void nhapDiem() {
		System.out.print("Nhap so Hoc Phan: ");
		soHP = sc.nextInt();
		sc.nextLine();
		for (int i = 0; i < soHP; i++) {
			System.out.print("Nhap ten HP thu " + (i + 1) + ": ");
			dsHP[i] = sc.nextLine();
			System.out.print("Nhap diem HP thu " + (i + 1) + ": ");
			diemHP[i] = sc.nextLine();
		}
	}

	public void in() {
		System.out.println("Ho va ten: " + hoVaTen);
		System.out.print("MSSV: " + MSSV + ". ");
		System.out.println("Ngay sinh: " + ngaySinh);
	}

	public void inDiem() {
		System.out.print("Ten HP: \t");
		for (int i = 0; i < soHP; i++) {
			System.out.print(dsHP[i] + "\t");
		}
		System.out.print("\n");
		System.out.print("Diem HP: \t");
		for (int i = 0; i < soHP; i++) {
			System.out.print(diemHP[i] + "\t");
		}
	}

	public String toString() {
		return "Ho va ten: " + hoVaTen + ". MSSV: " + MSSV + ". Ngay sinh: " + ngaySinh + ".\n";
	}

	public float diemTB() {
		float diemTB = 0.0f;
		for (int i = 0; i < soHP; i++) {
			if (diemHP[i].equals("A"))
				diemTB += 4;
			else if (diemHP[i].equals("B+"))
				diemTB += 3.5;
			else if (diemHP[i].equals("B"))
				diemTB += 3;
			else if (diemHP[i].equals("C+"))
				diemTB += 2.5;
			else if (diemHP[i].equals("C"))
				diemTB += 2;
			else if (diemHP[i].equals("D+"))
				diemTB += 1.5;
			else if (diemHP[i].equals("D"))
				diemTB += 1;
		}
		return diemTB / soHP;
	}

	public String MSSV() {
		return MSSV;
	}

	public String hoVaTen() {
		return hoVaTen;
	}

	public String tenSV() {
		return hoVaTen.substring(hoVaTen.lastIndexOf(" ") + 1);
	}

	public int soHP() {
		return soHP;
	}

	public void dangKyHP(String hP, String diem) {
		dsHP[soHP] = new String(hP);
		diemHP[soHP] = new String(diem);
		soHP++;
	}

	public void xoaHP(String hocPhan) {
		int i;
		for (i = 0; i < soHP; i++) {
			if (dsHP[i].equals(hocPhan))
				break;
		}
		for (int j = i; j < soHP - 1; j++) {
			dsHP[j] = dsHP[j + 1];
			diemHP[j] = diemHP[j + 1];
		}
	}
}

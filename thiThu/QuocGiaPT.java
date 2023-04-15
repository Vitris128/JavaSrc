package baithi;

import java.util.Scanner;

public class QuocGiaPT extends QuocGia {
	float ttho;
	char chluc;
	float dtich;

	public QuocGiaPT() {
		super();
		ttho = 0.0f;
		chluc = ' ';
		dtich = 0.0f;
	}

	public QuocGiaPT(QuocGiaPT PT) {
		super(PT);
		this.ttho = PT.ttho;
		this.chluc = PT.chluc;
		this.dtich = PT.dtich;
	}
	public char layChauLuc() {
		return chluc;
	}

	public void nhap() {
		super.nhap();
		Scanner sc = new Scanner(System.in);
		System.out.println("Nhap tuoi tho: ");
		ttho = sc.nextFloat();
		System.out.println("Nhap chau luc cua quoc gia: ");
		chluc = sc.next().charAt(0);
		System.out.println("Nhap dien tich cua quoc gia: ");
		dtich = sc.nextFloat();
	}

	public void in() {
		super.in();

	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n;
		System.out.println("Nhap so luong quoc gia: ");
		n = sc.nextInt();
		QuocGia ds[] = new QuocGia[n];
		for (int i = 0; i < n; i++) {
			System.out.print("Nhap 0 neu la quoc gia, 1 neu la quoc gia phat trien: ");
			int c = sc.nextInt();
			ds[i] = new QuocGia();
			if (c == 0) {
				ds[i].nhap();
			} else if (c == 1) {
				ds[i] = new QuocGiaPT();
				ds[i].nhap();
			}
		}
		for (int i = 0; i < n; i++) {
			ds[i].in();
		}
		System.out.println("Danh sach quoc gia co GDP > 500 o chau Phi: ");
		for (int i = 0; i < n; i++) {
			if(ds[i] instanceof QuocGiaPT) {
				if(ds[i].layGDP() >500 && ds[i].layChauLuc()=='P') {
					System.out.println("Ten: "+ds[i].tenQuocGia());
				}
			}
		}
		System.out.println("GDP trung binh o cac chau luc: ");
		float GDPA = 0.0f; int A = 0;
		float GDPW = 0.0f; int W = 0;
		float GDPM = 0.0f; int M = 0;
		float GDPU = 0.0f; int U = 0;
		float GDPP = 0.0f; int P = 0;
		for(int i=0;i<n;i++) {
			if(ds[i].layChauLuc() == 'A') {
				GDPA+=ds[i].layGDP();
				A++;
			} else if(ds[i].layChauLuc() == 'W') {
				W++;
				GDPW+=ds[i].layGDP();
			} else if(ds[i].layChauLuc() == 'M') {
				M++;
				GDPM+=ds[i].layGDP();
			} else if(ds[i].layChauLuc() == 'U') {
				U++;
				GDPU+=ds[i].layGDP();
			} else if(ds[i].layChauLuc() == 'P') {
				P++;
				GDPP+=ds[i].layGDP();
			}
		}
		if(GDPA!=0.0) {
			System.out.println("GDP trung binh o chau A: "+GDPA/A);
		}
		if(GDPW!=0.0) {
			System.out.println("GDP trung binh o chau Au: "+GDPW/W);
		}
		if(GDPM!=0.0) {
			System.out.println("GDP trung binh o chau My: "+GDPM/M);
		}
		if(GDPU!=0.0) {
			System.out.println("GDP trung binh o chau Uc: "+GDPU/U);
		}
		if(GDPP!=0.0) {
			System.out.println("GDP trung binh o chau Phi: "+GDPP/P);
		}
	}
}

import java.util.Scanner;

public class DVi {

	private String mdv;
	private String tendv;
	private int giuong;
	private boolean dchien;

	public DVi() {
		this.mdv = new String();
		this.tendv = new String();
		this.giuong = 0;
		this.dchien = true;
	}

	public DVi(DVi DV) {
		this.mdv = new String(DV.mdv);
		this.tendv = new String(DV.tendv);
		this.giuong = DV.giuong;
		this.dchien = DV.dchien;
	}

	public void nhap() {
		System.out.println("---***--Nhap thong tin don vi---***--");
		Scanner sc = new Scanner(System.in);
		System.out.println("Nhap ma don vi: ");
		this.mdv = sc.nextLine();
		System.out.println("Nhap ten don vi: ");
		this.tendv = sc.nextLine();
		System.out.println("Nhap so giuong: ");
		this.giuong = sc.nextInt();
		System.out.println("Nhap true neu la benh vien da chien, false neu khong phai: ");
		this.dchien = sc.nextBoolean();
	}

	public void in() {
		System.out.println("---***--Thong tin don vi---***--");
		System.out.print("Ma don vi: "+mdv+". Ten don vi: "+tendv+". So giuong: "+giuong+". ");
		if(dchien) System.out.println("La benh vien da chien.");
		else System.out.println("Khong phai benh vien da chien.");
	}
	public String toString() {
		if(dchien) return "---***--Thong tin don vi---***--\n"+"Ma don vi: "+mdv+". Ten don vi: "+tendv+". So giuong: "+giuong+". "+ "La benh vien da chien.";
		else return "---***--Thong tin don vi---***--\n"+"Ma don vi: "+mdv+". Ten don vi: "+tendv+". So giuong: "+giuong+". "+ "Khong phai benh vien da chien.";
	}
	public String layMDV() {
		return mdv;
	}
	public String layTenDV() {
		return tendv;
	}

	public static void main(String[] args) {
		DVi dv1 = new DVi();
		dv1.nhap();
		dv1.in();
		
		DVi dv2 = new DVi(dv1);
		dv2.in();
	}

}

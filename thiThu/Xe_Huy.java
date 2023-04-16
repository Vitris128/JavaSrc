import java.util.HashMap;
import java.util.Scanner;

public class Xe {

	private DCo d;
	
	private String so;
	private String ten;
	private long gia;
	private char tthai;
	
	
	public Xe() {
		d = new DCo();
		so = new String();
		ten = new String();
		gia = 0L;
		tthai = 'K';
	}
	
	public Xe(Xe x) {
		d = new DCo(x.d);
		so = new String(x.so);
		ten = new String(x.ten);
		gia = x.gia;
		tthai = x.tthai;
	}
	
	public void nhap() {
		Scanner sc = new Scanner(System.in);
		System.out.println("Hay nhap thong tin dong co cua xe: ");
		d.nhap();
		System.out.println("Hay nhap thong tin cua xe: ");
		System.out.println("Nhap bien so xe: ");
		so = sc.nextLine();
		System.out.println("Nhap ten cua chu xe: ");
		ten = sc.nextLine();
		System.out.println("Nhap gia tien cua xe: ");
		gia = sc.nextLong(); sc.nextLine();
		System.out.println("Nhap trang thai cho phep luu hanh, Co(C) hay Khong(K): ");
		tthai = sc.nextLine().toUpperCase().charAt(0);
	}
	
	@Override
	public String toString() {
		return d + "\n"
				+ "Bien so xe: " + so + "\n"
				+ "Chu xe: " + ten + "\n"
				+ "Gia: " + gia + "\n"
				+ "Trang thai luu hanh: " + ((tthai == 'C') ? "Cho phep" : "Khong cho phep");
	}
	
	public void in() {
		System.out.println(this);
	}
	
	public long phiTruocBa() {
		return (long)(0.1 * gia);
	}
	
	public char getTrangThai() {
		return tthai;
	}
	
	public long getGiaTri() {
		return gia;
	}
	
	public DCo getDCo() {
		return d;
	}
	
	public boolean compareMonthAndYear() {
		String date = d.getNgay();
		
		int month = Integer.parseInt(date.substring(date.indexOf("-") + 1, date.lastIndexOf("-")));
		int year = Integer.parseInt(date.substring(date.lastIndexOf("-") + 1));
		
		if(year > 2000) {
			return false;
		}
		
		if(year == 2000 && month >= 10) {
			return false;
		}
		
		return true;
	}
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Hay nhap so luong xe trong danh sach: ");
		int m = sc.nextInt();
		Xe ds[] = new Xe[m];
		
		for(int i = 0; i < m; ++i) {
			System.out.println("Hay nhap thong tin cho xe thu " + (i + 1) + " :");
			ds[i] = new Xe();
			ds[i].nhap();
		}
		
		int index = 0;
		for(Xe x : ds) {
			System.out.println("Thong tin cua xe thu " + (index+1) + " cung voi phi truoc ba la: ");
			System.out.println(x + "\nPhi truoc ba: " + x.phiTruocBa() + "\n");
		}
		
		System.out.println("Thong tin cua cac xe bi thu hoi, hoac co gia tri duoi 10 000 000 la: ");
		
		for(Xe x : ds) {
			if(x.getTrangThai() == 'K' || x.getGiaTri() < 10000000) {
				System.out.println(x + "\n");
			}
		}
		
		System.out.println("\nTong phi truoc ba cua tung loai dong co truoc 10-2000 la: ");
		
		HashMap<String, Long> tongPhiTruocBa = new HashMap<>();
		
		for(Xe x : ds) {
			if(x.compareMonthAndYear()) {
				String tenDCo = x.getDCo().getTen();
				long value = tongPhiTruocBa.getOrDefault(tenDCo, 0L);
				tongPhiTruocBa.put(tenDCo, value + x.phiTruocBa());
			}
		}
		
		for(String tenDco : tongPhiTruocBa.keySet()) {
			System.out.println(tenDco + ": " + tongPhiTruocBa.get(tenDco));
		}
		
		
		
		
	

	}

}

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Scanner;

public class CThu extends CNguoi {

	private int so;
	private String vtri;
	private long bthang;
	private String mua;
	private String clbo;
	
	
	public CThu() {
		super();
		so = 0;
		vtri = new String();
		bthang = 0L;
		mua = new String();
		clbo = new String();
	}
	
	public CThu(CThu ct) {
		super(ct);
		so = ct.so;
		vtri = new String(ct.vtri);
		bthang = ct.bthang;
		mua = new String(ct.mua);
		clbo = new String(ct.clbo);
	}
	
	public void nhap() {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Nhap thong tin ca nhan cau thu: ");
		super.nhap();
		System.out.println("Nhap so ao cau thu: ");
		so = sc.nextInt(); sc.nextLine();
		System.out.println("Nhap vi tri cua cau thu(thu mon, hau ve, trung ve, tien ve, tien dao): ");
		vtri = sc.nextLine();
		System.out.println("Nhap so ban thang: ");
		bthang = sc.nextLong(); sc.nextLine();
		System.out.println("Nhap mua giai: ");
		mua =sc.nextLine();
		System.out.println("Nhap ten cau lac bo cua cau thu: ");
		clbo = sc.nextLine();
	}
	
	@Override
	public String toString() {
		return super.toString() + "\n"
				+ "So ao cua cau thu: " + so + "\n"
				+ "Vi tri: " + vtri + "\n"
				+ "So ban thang: " + bthang + "\n"
				+ "Mua giai: " + mua + "\n"
				+ "Cau lac bo: " + clbo;
	}

	public void in() {
		System.out.println(this);
	}
	
	public long tinhLuong() {
		long luong = 7000000;
		
		switch(vtri) {
			case("thu mon"):{
				luong += 3000000;
				break;
			}
			case("hau ve"):{
				luong += 4000000;
				break;
			}
			case("trung ve"):{
				luong += 4500000;
				break;
			}
			case("tien ve"):{
				luong += 5000000;
				break;
			}
			case("tien dao"):{
				luong += 7000000;
				break;
			}
		}
		
		luong += bthang * 500000;
		
		luong *= (1 - 0.1);
		return luong;
	}
	
	
	public String getMua() {
		return mua;
	}

	public String getClbo() {
		return clbo;
	}

	public long getBthang() {
		return bthang;
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Nhap so luong doi tuong trong danh sach: ");
		int n = sc.nextInt();
		
		CNguoi ds[] = new CNguoi[n];
		
		for(int i = 0; i < n; ++i) {
			ds[i] = new CNguoi();
			System.out.println("Nhap thong tin cho doi tuong thu " + (i+1) + ", Con nguoi(0) hay Cau thu(1): ");
			int c = sc.nextInt();
			if(c == 1) {
				ds[i] = new CThu();
			}
			
			ds[i].nhap();
		}

		System.out.println("\nThong tin cua cac doi tuong trong danh sach la: ");
		
		for(int i = 0; i < n; ++i) {
			System.out.println("Thong tin cua doi tuong thu " + (i + 1) + " trong danh sach: ");
			ds[i].in();
		}
		
		System.out.println("Danh sach luong cua cac cau thu la: ");
		for(CNguoi cn : ds) {
			if (cn instanceof CThu) {
				System.out.println(cn.getHten() + ": " + cn.tinhLuong());
			}
		}
		
		System.out.println("So ban thang o 3 cap do tuoi cho moi mua giai cua moi clb la: ");
		
		Map<String, Map<String, Map<String, Long>>> thongkeMuaCLBBanThang = new HashMap();
		
		for(CNguoi cn : ds) {
			if(cn instanceof CThu) {
				String muagiai = ((CThu) cn).getMua();
				String clb = ((CThu) cn).getClbo();
				int age = cn.getTuoi();
				long banThang = ((CThu) cn).getBthang();
				
				String ageRange;
				if(age >= 18 && age <=24) {
					ageRange = "18-24";
				}else if(age >= 25 && age <= 28) {
					ageRange = "25-28";
				}else {
					ageRange = ">28";
				}
				
				if(!thongkeMuaCLBBanThang.containsKey(muagiai)) {
					thongkeMuaCLBBanThang.put(muagiai, new HashMap());
				}
				
				Map<String, Map<String, Long>> thongkeCLBBanThang = thongkeMuaCLBBanThang.get(muagiai);
				
				if(!thongkeCLBBanThang.containsKey(clb)) {
					thongkeCLBBanThang.put(clb, new HashMap());
				}
				
				Map<String, Long> thongkeBanThang = thongkeCLBBanThang.get(clb);
				
				if(!thongkeBanThang.containsKey(ageRange)) {
					thongkeBanThang.put(ageRange, 0L);
				}
				
				thongkeBanThang.put(ageRange, thongkeBanThang.get(ageRange) + banThang);
				
			}
		}
		
		for(String muaGiai : thongkeMuaCLBBanThang.keySet()) {
			System.out.println("Mua giai: " + muaGiai);
			Map<String, Map<String, Long>> thongkeCLBBanThang = thongkeMuaCLBBanThang.get(muaGiai);
			for(String clb : thongkeCLBBanThang.keySet()) {
				System.out.println("CLB: " + clb);
				Map<String, Long> thongkeBanThang = thongkeCLBBanThang.get(clb);
				System.out.println("18-24" + ": " + thongkeBanThang.getOrDefault("18-24", 0L));
				System.out.println("25-28" + ": " + thongkeBanThang.getOrDefault("25-28", 0L));
				System.out.println(">28" + ": " + thongkeBanThang.getOrDefault(">28", 0L));
			}

			
		}
		
	}

}

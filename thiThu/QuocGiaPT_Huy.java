import java.util.HashMap;
import java.util.Scanner;

public class QuocGiaPT extends QuocGia {

	private float ttho;
	private char chluc;
	private float dtich;
	
	public QuocGiaPT() {
		super();
		ttho = 0.0f;
		chluc = '0';
		dtich = 0.0f;
	}

	public QuocGiaPT(QuocGiaPT qgpt) {
		super(qgpt);
		ttho = qgpt.ttho;
		chluc = qgpt.chluc;
		dtich = qgpt.dtich;
		
	}

	public void nhap() {
		Scanner sc = new Scanner(System.in);
		super.nhap();
		System.out.println("Nhap tuoi tho trung binh cua quoc gia:\n");
		ttho = sc.nextFloat(); sc.nextLine();
		System.out.println("Nhap chau luc cua quoc gia, A(A), Au(W), My(M), Uc(U), hay Phi(P): ");
		chluc = sc.nextLine().toUpperCase().charAt(0);
		System.out.println("Nhap dien tich cua quoc gia: ");
		dtich = sc.nextFloat();
	}
	
	@Override
	public String toString() {
		String temp = super.toString();
		temp += "Tuoi tho trung binh: " + ttho + "\n";
		temp += "Chau luc: ";
		switch (chluc) {
		case 'A': {
			temp += "A";
			break;
		}
		case 'W': {
			temp+= "Au";
			break;
		}
		case 'M': {
			temp += "My";
			break;
		}
		case 'U': {
			temp += "Uc";
			break;
		}
		case 'P': {
			temp += "Phi";
			break;
		}
		default:
			throw new IllegalArgumentException("Unexpected value: " + chluc);
		}
		
		temp += "\n" + "Dien tich: " + dtich + "\n";
		return temp;
	}
	
	public void in() {
		System.out.println(this);
	}
	
	public String getchluc() {
		return String.valueOf(this.chluc);
	}
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Nhap so luong quoc gia trong danh sach: ");
		int n = sc.nextInt();
		QuocGia ds[] = new QuocGia[n];
		for(int i = 0; i < n; ++i) {
			ds[i] = new QuocGia();
			System.out.println("Nhap quoc gia thu " + (i+1) + ", quoc gia(0), hay quoc gia dang phat trien(1): ");
			int c = sc.nextInt();
			if(c == 1) {
				ds[i] = new QuocGiaPT();
			}
			ds[i].nhap();
		}
		
		System.out.println("Danh sach cac quoc gia: ");
		for(QuocGia qg : ds) {
			System.out.println(qg);
		}
		
		System.out.println("Danh sach cac quoc gia o chau phi va co GDP > 500: ");
		
		for(QuocGia qg : ds) {
			if(qg.getGDP() > 500 && qg.getchluc().equals("P")) {
				System.out.println(qg.gettenqg());
			}
		}
		
		System.out.println("GDP trung binh cua cac nuoc dang phat trien theo chau luc: ");
		
		HashMap<String, Float> GDPchauLuc = new HashMap<String, Float>();
		HashMap<String, Integer> SoluongQG = new HashMap<String, Integer>();
		
		for(QuocGia qg : ds) {
			if(!qg.getchluc().equals("0")) {
				GDPchauLuc.put(qg.getchluc(), GDPchauLuc.getOrDefault(qg.getchluc(), 0.0F) + qg.getGDP());
				SoluongQG.put(qg.getchluc(), SoluongQG.getOrDefault(qg.getchluc(), 0) + 1);
			}
		}
		
		for(String chluc : GDPchauLuc.keySet()) {
			switch(chluc.charAt(0)) {
				case 'A': {
					System.out.print("Chau A");
					break;
				}
				case 'W': {
					System.out.print("Chau Au");
					break;
				}
				case 'M': {
					System.out.print("Chau Mi");
					break;
				}
				case 'U': {
					System.out.print("Chau Uc");
					break;
				}
				case 'P': {
					System.out.print("Chau Phi");
					break;
				}
			}
			System.out.println(": " + (GDPchauLuc.get(chluc) / SoluongQG.get(chluc)));
		}

	}

}

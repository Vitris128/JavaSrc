import java.util.Scanner;

public class QuocGia {
	private String msqg;
	private String tenqg;
	private String tenthudo;
	private float GDP;
	
	public QuocGia() {
		msqg = new String();
		tenqg = new String();
		tenthudo = new String();
		GDP = 0.0f;
	}
	
	public QuocGia(QuocGia qg) {
		msqg = new String(qg.msqg);
		tenqg = new String(qg.tenqg);
		tenthudo = new String(qg.tenthudo);
		GDP = qg.GDP;
	}
	
	public void nhap() {
		Scanner sc = new Scanner(System.in);
		System.out.println("Nhap ma so cua quoc gia: ");
		msqg = sc.nextLine();
		System.out.println("Nhap ten cua quoc gia: ");
		tenqg = sc.nextLine();
		System.out.println("Nhap ten thu do cua quoc gia: ");
		tenthudo = sc.nextLine();
		System.out.println("Nhap GDP(tong san pham quoc noi): ");
		GDP = sc.nextFloat();
	}
	
	@Override
	public String toString() {
		
		return "Ma so quoc gia: " + msqg + "\n"
				+ "Ten: " + tenqg + "\n"
				+ "Thu do: " + tenthudo + "\n"
				+ "GDP: " + GDP + "\n";
	}
	
	public void in() {
		System.out.println(this);
	}
	
	public float getGDP() {
		return GDP;
	}
	
	public String getchluc() {
		return "0";
	}
	
	public String gettenqg() {
		return tenqg;
	}
	
	public static void main(String[] args) {
		QuocGia qg1 = new QuocGia();
		System.out.println("Hay nhap quoc gia thu nhat: ");
		qg1.nhap();
		System.out.println("Thong tin cua quoc gia thu nhat la: ");
		qg1.in();
		System.out.println("Thong tin quoc gia thu hai, duoc sao chep tu quoc gia thu nhat la: ");
		QuocGia qg2 = new QuocGia(qg1);
		qg2.in();
	}
}

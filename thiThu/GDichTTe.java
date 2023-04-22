import java.util.Arrays;
import java.util.Comparator;
import java.util.HashMap;
import java.util.Scanner;

public class GDichTTe extends GDich{
    private float dgia;
    private int sluong;
    private char loai;
    private float tgia;

    public GDichTTe(){
        super();
        dgia = 0.0f;
        sluong = 0;
        loai = 'V';
        tgia = 0.0f;
    }

    public GDichTTe(GDichTTe gd){
        super(gd);
        dgia = gd.dgia;
        sluong = gd.sluong;
        loai = gd.loai;
        tgia = gd.tgia;
    }

    public void nhap(){
        super.nhap();
        Scanner sc = new Scanner(System.in);
        System.out.println("Hay nhap don gia: ");
        dgia = sc.nextFloat();
        System.out.println("Hay nhap so luong: ");
        sluong = sc.nextInt(); sc.nextLine();
        System.out.println("Hay nhap loai tien te, tien Viet Nam (V), tien USD (U), hay tien Euro (E)");
        loai = sc.nextLine().toLowerCase().charAt(0);
        System.out.println("Hay nhap ti le gia: ");
        tgia = sc.nextFloat();
    }

    @Override
    public String toString() {
        return super.toString() +
                "Don gia: " + dgia + "\n" +
                "So luong: " + sluong + "\n" +
                "Loai: " + "tien " + (loai == 'v' ? "Viet Nam" : (loai == 'u' ? "USD" : "Euro")) + "\n" +
                "Ti gia: " + tgia +
                "\n";
    }

    @Override
    public void in(){
        super.in();
    }

    public long thanhTien(){
        return (long) (sluong * dgia * tgia);
    }

    public static void main(String[] args) {
        System.out.println("Hay nhap so luong doi tuong can giao dich: ");
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        GDich ds[] = new GDich[n];

        for(int i = 0; i < n; ++i){
            System.out.println("Hay nhap doi tuong giao dich thu " + (i + 1) + ", giao dich vang(0), hay giao dich tien te(1):");
            int c = sc.nextInt();
            if(c == 0){
                ds[i] = new GDich();
            }else {
                ds[i] = new GDichTTe();
            }
            ds[i].nhap();
        }

        System.out.println("Nhung ma giao dich tien te co gia tri tren 100.000VND la");

        Arrays.stream(ds)
                .filter(e -> e.thanhTien() > 100000)
                .map(GDich::getMgdich)
                .forEach(System.out::println);

        System.out.println("Thong ke cac so tien giao dich theo thang-nam: ");

        HashMap<String, Long> map = new HashMap<>();

        for(GDich gd : ds){
            if(gd instanceof GDichTTe){
                Long value = map.getOrDefault(gd.getThangVaNam(), 0L);
                map.put(gd.getThangVaNam(), gd.thanhTien() + value);
            }
        }

        for(String monthAndYear : map.keySet()){
            long value = map.get(monthAndYear);
            System.out.println(monthAndYear + ": " + value);
        }

    }
}

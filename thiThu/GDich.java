import java.util.Scanner;

public class GDich {
    private int mgdich;
    private String hten;
    private String ngay;
    private boolean tthai;

    public GDich(){
        mgdich = 0;
        hten = new String();
        ngay = new String();
        tthai = false;
    }

    public GDich(GDich gd){
        mgdich = gd.mgdich;
        hten = new String(gd.hten);
        ngay = new String(gd.ngay);
        tthai = gd.tthai;
    }

    public void nhap(){
        Scanner sc = new Scanner(System.in);

        System.out.println("Hay nhap ma so giao dich: ");
        mgdich = sc.nextInt(); sc.nextLine();
        System.out.println("Hay nhap ho ten nguoi giao dich: ");
        hten = sc.nextLine();
        System.out.println("Hay nhap ngay giao dich, voi dinh dang dd-mm-yyyy: ");
        ngay = sc.nextLine();
        System.out.println("Hay nhap trang thai giao dich, giao dich thanh cong (1), hoac giao dich thai bai (0):");
        int c = sc.nextInt();
        tthai = (c != 0);
    }

    @Override
    public String toString() {
        return  "Ma so giao dich: " + mgdich + "\n" +
                "Ho Ten: " + hten + "\n" +
                "Ngay giao dich: " + ngay + "\n" +
                "Trang thai: " + ((tthai) ? "thanh cong" : "that bai") +
                "\n";
    }

    public void in(){
        System.out.println(this);
    }

    public int getMgdich() {
        return mgdich;
    }

    public String getThangVaNam(){
        String res = ngay.substring(ngay.indexOf("-") + 1);
        if(res.substring(0, res.indexOf("-")).length() == 1){
            res = "0" + res;
        }
        return res;
    }

    public long thanhTien(){
        return 0;
    }

    public static void main(String[] args) {
        GDich gd1 = new GDich();
        gd1.nhap();
        System.out.println("Thong tin giao dich so 1: ");
        gd1.in();
        GDich gd2 = new GDich(gd1);
        System.out.println("Thong tin giao dich so 2, duoc sao chep tu giao dich so 1: ");
        System.out.println(gd1.getThangVaNam());
        gd2.in();
    }

}

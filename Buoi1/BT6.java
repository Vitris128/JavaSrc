package Buoi1;
import java.util.Scanner;

public class BT6 {
	public int Nhap() {
		Scanner sc = new Scanner(System.in);
		String S=" ";
		int n = 0;
		do {
			System.out.println("Nhap 1 so nguyen: ");
			S = sc.nextLine();
			try {n = Integer.parseInt(S);}
				catch (Exception e) {
					n = Integer.MAX_VALUE;
					System.out.println("Ban nhap sai dinh dang, vui long nhap lai.");
				}
			}
		 while(n == Integer.MAX_VALUE);
		return n;
	}
	public String DectoBin(int n) {
		String binaryNumber = "";
		int m = n;
		while(m>0)
		{
			binaryNumber = m%2 + binaryNumber;
			m=m/2;
			
		}
		
		return binaryNumber;
	}
	public static void main(String args[]) {
		BT6 bt6 = new BT6();
		int n = bt6.Nhap();
		int count=0;
		for(int i=1;i<Math.sqrt(n);i++) {
			if(n%i == 0) count++;
			if(count >1)  {
				
				break;
			}
		}
		if(count == 1) {
			System.out.print(n+" la so nguyen to.\n");
		} else {
			System.out.print(n+" khong phai la so nguyen to.\n");
		}
		String S = bt6.DectoBin(n);
		System.out.print(n+" trong he nhi phan la: "+ S);
	}
}
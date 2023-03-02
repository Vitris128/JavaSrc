package Buoi1;
import java.util.Arrays;
import java.util.Scanner;
public class BT3 {
	
	public int Nhap() {
		Scanner sc = new Scanner(System.in);
		String s =" ";
		int n = 0;
		do {
			s = sc.nextLine();
			try { n = Integer.parseInt(s); }
				catch (Exception e) {
					n =Integer.MAX_VALUE;
					System.out.println("Ban nhap sai kieu du lieu! Vui long nhap lai: ");
				}
				
		} while(n == Integer.MAX_VALUE);
		return n;
	}
	public static void main(String[] args) {
		BT3 bt3 = new BT3();
		System.out.print("Nhap so phan tu: ");
		int n = bt3.Nhap();
		int sum = 0;
		int max = 0;
		int arr[] = {1};
		for(int i=0;i<n;i++) {
			System.out.print("Nhap so nguyen thu "+(i+1)+": ");
			arr = Arrays.copyOf(arr, i+1);
			arr[i] = bt3.Nhap();
			sum += arr[i];
			if(arr[i] >= max) max = arr[i];		
		}
		System.out.println("So lon nhat la: "+ max);
		System.out.println("Tong cua day so la: "+ sum);
	}
}

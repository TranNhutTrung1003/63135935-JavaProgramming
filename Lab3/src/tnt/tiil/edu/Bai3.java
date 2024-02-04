/**
 * 
 */
package tnt.tiil.edu;
import java.util.*;
/**
 * 
 */
public class Bai3 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);
		int soluong;
		int dem = 0;
		double sum = 0;
		
		System.out.print("nhap vao so luong phan tu trong mang: ");
		soluong = scanner.nextInt();
		
		int[] array = new int[soluong];
		
		for(int i = 0; i < soluong; i++) {
			System.out.printf("nhap vao gia tri cua phan tu thu %d: ", i+1);
			array[i] = scanner.nextInt();
		}
		
		// sap xep va xuat mang 
		Arrays.sort(array);
		System.out.printf("\nmang sau khi sap xep la: ");
		for(int i = 0; i < soluong; i++) {
			System.out.printf("%d ", array[i]);
		}
		
		// xuat ra so nho nhat
		int min = array[0];
		for(int i = 1; i < soluong; i++) {
			min = Math.min(array[0], min);
		}
		
		System.out.println("\ngia tri nho nhat rong mang la: " + min);
		
		// tinh va in ra trung binh cong cac so chia het cho 3
		for(int i = 0; i<soluong; i++) {
			if(array[i]%3==0) {
				sum = sum + array[i];
				dem++;
			}
		}
		
		sum = (double)sum/dem;
		System.out.println("trung binh cong cua cac so chia het cho 3 la: " + sum);
		
		scanner.close();
	}

}

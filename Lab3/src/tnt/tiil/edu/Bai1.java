/**
 * 
 */
package tnt.tiil.edu;
import java.util.*;
/**
 * 
 */
public class Bai1 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);
		int n;
		
		System.out.print("nhap vao mot so nguyen: ");
		n = scanner.nextInt();
		boolean check = true;
		for(int i = 2; i < n; i++) {
			if(n%i==0) {
				check = false;
				break;
			}
		}
		
		if(check) {
			System.out.printf("so %d la so nguyen to", n);
		} else {
			System.out.printf("so %d khong phai la so nguyen to", n);
		}
		
		scanner.close();
	}

}

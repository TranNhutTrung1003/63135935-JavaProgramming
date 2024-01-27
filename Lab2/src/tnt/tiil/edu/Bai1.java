/**
 * 
 */
package tnt.tiil.edu;

import java.util.Scanner;

/**
 * 
 */
public class Bai1 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		double a, b;
		Scanner scanner = new Scanner(System.in);
		
		System.out.print("nhap vao so a: ");
		a = scanner.nextDouble();
		System.out.print("nhap vao so b: ");
		b = scanner.nextDouble();
		
		if (a == 0) {
			if (b != 0) {
				System.out.println("phuong trinh vo nghiem");
			} else {
				System.out.println("phuong trinh vo so nghiem");
			}
		} else {
			double kq = -b/a;
			System.out.println("phuong trinh co nghiem la: " + kq);
		}
		
		scanner.close();
	}

}

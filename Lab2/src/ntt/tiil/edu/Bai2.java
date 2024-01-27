/**
 * 
 */
package ntt.tiil.edu;
import java.util.*;
/**
 * 
 */
public class Bai2 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);
		double a, b, c;
		
		System.out.print("nhap vao gia tri cua a: ");
		a = scanner.nextDouble();
		System.out.print("nhap vao gia tri cua b: ");
		b = scanner.nextDouble();
		System.out.print("nhap vao gia tri cua c: ");
		c = scanner.nextDouble();
		
		if (a == 0) {
			if(b == 0) {
				if(c == 0) {
					System.out.println("phuong trinh vo so nghiem");
				} else {
					System.out.println("phuong trinh vo nghiem");
				}
			} else {
				double x = -c/b;
				
				System.out.println("phuong trinh co mot nghiem la " + x);
			}
		} else {
			double delta = Math.pow(b, 2) - 4*a*c;
			if (delta > 0) {
				double x1 = (-b + Math.sqrt(delta))/(2*a);
				double x2 = (-b - Math.sqrt(delta))/(2*a);
				
				System.out.println("phuong trinh co hai nghiem phan biet");
				System.out.println("x1 = " + x1);
				System.out.println("x2 = " + x2);
			} else if (delta == 0) {
				double x = -b / (2 * a);
				System.out.println("phuong trinh co nghiem kep la " + x);
			} else {
				System.out.println("phuong trinh vo nghiem");
			}
		}
		
		scanner.close();
	}

}

/**
 * 
 */
package lab1.edu;
import java.util.*;

/**
 * 
 */
public class Lab1Bai4 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		double a, b, c, delta, candelta;
		Scanner scanner = new Scanner(System.in);
		
		System.out.print("nhap vao so a: ");
		a = scanner.nextDouble();
		System.out.print("nhap vao so b: ");
		b = scanner.nextDouble();
		System.out.print("nhap vao so c: ");
		c = scanner.nextDouble();
		
		delta = Math.pow(b, 2) - 4 * a * c;
		candelta = Math.sqrt(delta);
		System.out.println("gia tri cua delta la: " + delta);
		System.out.println("gia tri cua can delta la: " + candelta);
		
		scanner.close();
	}

}

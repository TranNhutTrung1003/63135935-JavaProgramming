/**
 * 
 */
package lab1.edu;
import java.util.*;
/**
 * 
 */
public class Lab1Bai3 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		double canh;
		Scanner scanner = new Scanner(System.in);
		
		System.out.print("nhap vao canh cua khoi lap phuong: ");
		canh = scanner.nextDouble();
		
		double thetich = Math.pow(canh, 3);
		
		System.out.printf("the tich cua khoi lap phuong: %.2f", thetich);
		
		scanner.close();
	}

}

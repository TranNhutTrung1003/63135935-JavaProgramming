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
		double sodien, tiendien;
		
		System.out.print("nhap vao so dien dung trong thang nay: ");
		sodien = scanner.nextDouble();
		
		if (sodien <= 50) {
			tiendien = sodien * 1000;
		} else {
			tiendien = 50*1000 + (sodien - 50)*1200;
		}
		
		System.out.println("tien dien cua thang nay la: " + tiendien);
		
		scanner.close();
	}

}

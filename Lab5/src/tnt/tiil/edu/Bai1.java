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
		double a;
		String b;
		Scanner scanner = new Scanner(System.in);
		ArrayList<Double> ds = new ArrayList<Double>();
		
		while(true) {
			System.out.print("nhap vao gia tri: ");
			a = scanner.nextDouble();
			ds.add(a);
			
			System.out.print("co nhap them so thuc khong(Y/N): ");
			scanner.nextLine();
			b = scanner.nextLine();
			if(b.equals("N")) {
				break;
			}
		}
		
		System.out.print("\ndanh sach cac phan tu trong ds:");
		
		for (double ele: ds) {
			System.out.print(" " + ele);
		}
		
		scanner.close();
	}

}

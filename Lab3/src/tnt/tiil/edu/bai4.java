/**
 * 
 */
package tnt.tiil.edu;
import java.util.*;
/**
 * 
 */
public class bai4 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int soluong;
		Scanner scanner = new Scanner(System.in);
		
		System.out.print("nhap vao so luong hoc sinh: ");
		soluong = scanner.nextInt();
		
		String[] dshs = new String[soluong];
		double[] dsds = new double[soluong];
		
		for(int i = 0; i < soluong; i++) {
			System.out.print("ten cua hoc sinh thu " + (i+1) + " la: ");
			scanner.nextLine();
			dshs[i] = scanner.nextLine();
			System.out.print("diem so cua hoc sinh thu " + (i+1) + " la: ");
			dsds[i] = scanner.nextDouble();
		}
		
		System.out.println();
		
		//xuat va in ra hoc luc
		for (int i = 0; i < soluong; i++) {
			System.out.println("ho ten hoc sinh thu " + (i+1) + ": " + dshs[i]);
			System.out.println("diem cua hoc sinh thu " + (i+1) + ": " + dsds[i]);
			if(dsds[i] < 5) {
				System.out.println("hoc luc yeu");
			} else if (dsds[i] >= 5 && dsds[i] < 6.5) {
				System.out.println("hoc luc trung binh");
			} else if (dsds[i] >= 6.5 && dsds[i] < 7.5) {
				System.out.println("hoc luc kha");
			} else if (dsds[i] >= 7.5 && dsds[i] < 9) {
				System.out.println("hoc luc gioi");
			} else {
				System.out.println("hoc luc xuat sac");
			}
		}
		
		//sap xep hoc sinh co diem so tang dan
		
		for (int i = 0; i < soluong - 1; i++) {
			for (int j = 1; j < soluong; j++) {
				if (dsds[i] > dsds[j]) {
					String hstemp = dshs[i];
					dshs[i] = dshs[j];
					dshs[j] = hstemp;
					
					double dstemp = dsds[i];
					dsds[i] = dsds[j];
					dsds[j] = dstemp;
				}
			}
		}
		
		System.out.println("\ndanh sach hoc sinh sau khi sap xep: ");
		for(int i = 0; i<soluong; i++) {
			System.out.println("ho ten hoc sinh thu " + (i+1) + ": " + dshs[i]);
			System.out.println("diem cua hoc sinh thu " + (i+1) + ": " + dsds[i]);
		}
		
		scanner.close();
	}

}

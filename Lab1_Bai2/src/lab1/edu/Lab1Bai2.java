/**
 * 
 */
package lab1.edu;
import java.util.Scanner;
/**
 * 
 */
public class Lab1Bai2 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		double chieurong;
		double chieudai;
		
		Scanner scanner = new Scanner(System.in);
		
		System.out.print("Nhap vao chieu rong: ");
		chieurong = scanner.nextDouble();
		
		System.out.print("nhap vao chieu dai: ");
		chieudai = scanner.nextDouble();
		
		double chuvi = (chieurong + chieudai) * 2;
		double dientich = chieurong * chieudai;
		double canhnhonhat = Math.min(chieudai, chieurong);
		System.out.printf("dien tich cua HCN: %.2f\n", dientich);
		System.out.printf("chu vi cua HCN: %.2f\n", chuvi);
		System.out.printf("canh nho nhat cua HCN: %.2f\n", canhnhonhat);
		
		scanner.close();
	}

}

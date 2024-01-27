/**
 * 
 */
package ntt.tiil.edu;
import java.util.*;
/**
 * 
 */
public class Bai4 {

	/**
	 * @param args
	 */
	public static void giaiPTB1() {
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
	
	public static void giaiPTB2() {
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
	
	public static void tinhTienDien() {
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
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);
		int chossen;
		
		System.out.println("+---------------------------------------------------+");
		System.out.println("1. Giải phương trình bậc nhất");
		System.out.println("2. Giải phương trình bậc 2");
		System.out.println("3. Tính tiền điện");
		System.out.println("4. Kết thúc");
		System.out.println("+---------------------------------------------------+");
		System.out.print("Chọn chức năng: ");
		
		chossen = scanner.nextInt();
		switch(chossen) {
		case 1:
			giaiPTB1();
			break;
		case 2:
			giaiPTB2();
			break;
		case 3:
			tinhTienDien();
			break;
		default:
			break;
		}
		
		scanner.close();
	}

}

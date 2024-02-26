/**
 * 
 */
package tnt.tiil.edu;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/**
 * 
 */
public class Bai3 {

	/**
	 * @param args
	 */
	
	public static class SinhVien{
		String hoTen, email, sdt, cmnd;

		public String getHoTen() {
			return hoTen;
		}

		public void setHoTen(String hoTen) {
			this.hoTen = hoTen;
		}

		public String getEmail() {
			return email;
		}

		public void setEmail(String email) {
			this.email = email;
		}

		public String getSdt() {
			return sdt;
		}

		public void setSdt(String sdt) {
			this.sdt = sdt;
		}

		public String getCmnd() {
			return cmnd;
		}

		public void setCmnd(String cmnd) {
			this.cmnd = cmnd;
		}

		public void nhap(Scanner scanner) {
			
			String reEmail = "\\w+@\\w+\\.\\w+";
			String rePhone = "0\\d{9,10}";
			String reCMND = "[0,9]{9}";
			
			do {
				System.out.print("nhap vao ho ten: ");
				this.hoTen = scanner.nextLine();
				System.out.print("nhap vao email: ");
				this.email = scanner.nextLine();
				System.out.print("nhap vao so dien thoai: ");
				this.sdt = scanner.nextLine();
				System.out.print("nhap vao chung minh nhan dan: ");
				this.cmnd = scanner.nextLine();
			} while(!this.email.matches(reEmail) && !this.sdt.matches(rePhone) && !this.cmnd.matches(reCMND));
		}
		
		public void xuat() {
			System.out.println("Ho va ten: " + this.hoTen + "\n" + "Email: " + this.email + "\n" + "So dien thoai: " + this.sdt + "\n" + "Chung minh nhan dan: " + this.cmnd + "\n");
		}
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<SinhVien> l = new ArrayList<>();
		Scanner scanner = new Scanner(System.in);
		SinhVien n = new SinhVien();
		for(int i = 0; i<=4; i++) {
			n.nhap(scanner);
			l.add(n);
		}
		
		for (SinhVien i:l)
			i.xuat();
		scanner.close();
	}

}

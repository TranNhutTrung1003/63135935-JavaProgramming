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
public class Bai2 {

	/**
	 * @param args
	 */
	
	public static class SanPham{
		String tenSp, hang;
		double donGia;
		
		public String getTenSp() {
			return tenSp;
		}

		public void setTenSp(String tenSp) {
			this.tenSp = tenSp;
		}

		public String getHang() {
			return hang;
		}

		public void setHang(String hang) {
			this.hang = hang;
		}

		public double getDonGia() {
			return donGia;
		}

		public void setDonGia(double donGia) {
			this.donGia = donGia;
		}

		public void nhap(Scanner scanner) {
			System.out.print("nhap vao ten san pham: ");
			this.tenSp = scanner.nextLine();
			System.out.print("nhap vao hang: ");
			this.hang = scanner.nextLine();
			System.out.print("nhap vao don gia: ");
			this.donGia = scanner.nextDouble();
		}
		
		public void xuat() {
			System.out.println("ten san pham: " + this.tenSp + "\n" + "gia san pham: " + this.donGia + "\n" + "hang san pham: " + this.hang);
		}
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<SanPham> l = new ArrayList<>();
		Scanner scanner = new Scanner(System.in);
		SanPham n = new SanPham();
		for(int i = 0; i<=4; i++) {
			n.nhap(scanner);
			l.add(n);
		}
		
		for (SanPham i:l)
			if(i.getHang().equals("Nokia"))
				i.xuat();
		scanner.close();
	}

}

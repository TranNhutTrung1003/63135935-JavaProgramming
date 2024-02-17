/**
 * 
 */
package tnt.tiil.edu;

import java.util.Scanner;

/**
 * 
 */
public class Bai4 {

	/**
	 * @param args
	 */
	
	public static class SanPham{
		private String tenSP;
		private double donGia;
		private double giamGia;
		
		public String getTenSP() {
			return tenSP;
		}

		public void setTenSP(String tenSP) {
			this.tenSP = tenSP;
		}

		public double getDonGia() {
			return donGia;
		}

		public void setDonGia(double donGia) {
			this.donGia = donGia;
		}

		public double getGiamGia() {
			return giamGia;
		}

		public void setGiamGia(double giamGia) {
			this.giamGia = giamGia;
		}

		public SanPham(String tenSP, int donGia, int giamGia) {
			this.tenSP = tenSP;
			this.donGia = donGia;
			this.giamGia = giamGia;
		}
		
		public SanPham(String tenSP, int donGia) {
			this(tenSP, donGia, 0);
		}
		
		private double getThueNhapKhau() {
			return this.donGia * 0.1;
		}
		
		public void xuat() {
			System.out.println("ten san pham: " + this.tenSP);
			System.out.println("gia san pham: " + this.donGia);
			System.out.println("so tien giam gia cua san pham: " + this.giamGia);
		}
		
		void nhap() {
			Scanner scanner = new Scanner(System.in);
			System.out.print("nhap ten san pham: ");
			this.tenSP = scanner.nextLine();
			System.out.print("nhap gia san pham: ");
			this.donGia = scanner.nextDouble();
			System.out.print("nhap vao tien giam gia cua san pham: ");
			this.giamGia = scanner.nextDouble();
		}
		
	}

}

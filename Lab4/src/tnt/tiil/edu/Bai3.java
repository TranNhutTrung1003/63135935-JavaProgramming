package tnt.tiil.edu;
import java.util.Scanner;

public class Bai3 {
	public static class SanPham{
		String tenSP;
		double donGia;
		double giamGia;
		
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
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		SanPham sp1 = new SanPham("but long", 300, 100);
		SanPham sp2 = new SanPham("but chi", 400);
		
		sp1.xuat();
		sp2.xuat();
	}
}

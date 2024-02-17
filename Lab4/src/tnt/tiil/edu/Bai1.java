package tnt.tiil.edu;

import java.util.Scanner;

public class Bai1 {
	public static class SanPham{
		String tenSP;
		double dongia;
		double giamGia;
		
		double getThueNhapKhau() {
			return this.dongia * 0.1;
		}
		
		void xuat() {
			System.out.println("ten san pham: " + this.tenSP);
			System.out.println("gia san pham: " + this.dongia);
			System.out.println("so tien giam gia cua san pham: " + this.giamGia);
		}
		
		void nhap() {
			Scanner scanner = new Scanner(System.in);
			System.out.print("nhap ten san pham: ");
			this.tenSP = scanner.nextLine();
			System.out.print("nhap gia san pham: ");
			this.dongia = scanner.nextDouble();
			System.out.print("nhap vao tien giam gia cua san pham: ");
			this.giamGia = scanner.nextDouble();
		}
	}
}

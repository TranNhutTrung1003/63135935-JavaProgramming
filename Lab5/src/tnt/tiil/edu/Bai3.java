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
	
	public static class SanPham {
		String ten;
		float gia;
		
		public SanPham(String ten, float gia) {
			this.ten = ten;
			this.gia = gia;
		}
		
		public String getTen() {
			return this.ten;
		}
		
		public String toString() {
			return "Ten san pham: " + ten + "\n" +
					"Gia san pham: " + gia + "\n";
		}
	}
	
	public static void nhap(Scanner scanner, List<SanPham> ds){
		SanPham n;
		String s;
		float t;
		
		// nhap danh sach ho va ten
		while(true){
			System.out.print("nhap vao ten san pham: ");
			s = scanner.nextLine();
			System.out.print("nhap vao ten gia san pham: ");
			t = scanner.nextFloat();
			n = new SanPham(s, t);
			ds.add(n);
			
			System.out.print("co nhap them khong(Y/N): ");
			if(scanner.nextLine().equals("N")) {
				break;
			}
		}
	}
	
	public static void sapxep(ArrayList<SanPham> ds) {
		// sap xep giam dan va xuat danh sach
		ds.sort(Collections.reverseOrder());
		
		System.out.println("\ndanh sach ho va ten theo thứ tự giam dan: ");
		for (SanPham i: ds) {
			System.out.println(i.toString());
		}
	}
	
	public static void xoa(ArrayList<SanPham> ds, String n) {
		int count = 0;
		
		for (SanPham i:ds) {
			if(i.getTen().equals(n)) {
				break;
			}
			count++;
		}
		
		ds.remove(count);
	}
	
	public static void xuatGiaTB(ArrayList<SanPham> ds) {
		float sum = 0;
		int count = 0;
		
		for(SanPham i: ds) {
			sum += i.gia;
			count++;
		}
		
		float tb = (float)sum/count;
		System.out.println("Gia trung binh cua cac san pham: " + tb);
	}
	
	public static void menu() {
		ArrayList<SanPham> ds = new ArrayList<>();
		Scanner scanner = new Scanner(System.in);
		String s;
		int b, chossen;
		
		while(true) {
			System.out.println("1. Nhap danh sach san pham");
			System.out.println("2. Sap xep giam dan va xuat danh sach");
			System.out.println("3. Tim va xoa ho ten nhap tu ban phim");
			System.out.println("4. Xuat gia trung binh cua cac san pham");
			System.out.println("5. ket thuc");
			
			System.out.print("nhap vao lua chon: ");
			b = scanner.nextInt();
			switch(b) {
			case 1:
				nhap(scanner, ds);
				break;
			case 2:
				sapxep(ds);
				break;
			case 3:
				System.out.print("nhap vao ten san pham can xoa: ");
				s = scanner.nextLine();
				xoa(ds, s);
				break;
			case 4:
				xuatGiaTB(ds);
				break;
			default:
				break;
			}
			
			System.out.print("ban co muon tiep tuc khong(1 - Yes/0 - No): ");
			chossen = scanner.nextInt();
			if(chossen == 0)
				break;
		}
		
		scanner.close();
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		menu();
	}

}

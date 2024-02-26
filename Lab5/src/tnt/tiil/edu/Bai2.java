/**
 * 
 */
package tnt.tiil.edu;

import java.util.Scanner;
import java.util.ArrayList;
import java.util.Collections;

/**
 * 
 */
public class Bai2 {

	/**
	 * @param args
	 */
	
	public static ArrayList<String> nhap(Scanner scanner){
		ArrayList<String> ds = new ArrayList<>();
		String n;
		
		// nhap danh sach ho va ten
		while(true){
			System.out.print("nhap vao ho va ten: ");
			n = scanner.nextLine();
			ds.add(n);
			
			System.out.print("co nhap them khong(Y/N): ");
			if(scanner.nextLine().equals("N")) {
				break;
			}
		}
		
		return ds;
	}
	
	public static void xuat(ArrayList<String> ds) {
		// xuat danh sach
		System.out.println("\ndanh sach ho va ten vua nhap: ");
		for (String i: ds) {
			System.out.println("ho va ten: " + i);
		}
	}
	
	public static void sapxep(ArrayList<String> ds) {
		// sap xep giam dan va xuat danh sach
		ds.sort(Collections.reverseOrder());
		
		System.out.println("\ndanh sach ho va ten theo thứ tự giam dan: ");
		for (String i: ds) {
			System.out.println("ho va ten: " + i);
		}
	}
	
	public static void ngaunhien(ArrayList<String> ds) {
		// xuat danh sach ngau nhien
		Collections.shuffle(ds); // Lenh xao tron phan tu trong danh sach
		System.out.println("\ndanh sach ho va ten ngau nhien: ");
		for (String i: ds) {
			System.out.println("ho va ten: " + i);
		}
	}
	
	public static void xoa(ArrayList<String> ds, String n) {
		int count = 0;
		
		for (String i:ds) {
			if(n.equals(i)) {
				break;
			}
			count++;
		}
		
		ds.remove(count);
	}
	
	public static void menu() {
		ArrayList<String> ds = new ArrayList<>();
		Scanner scanner = new Scanner(System.in);
		int b;
		String s, chossen;
		
		while(true) {
			System.out.println("1. Nhap danh sach ho va ten");
			System.out.println("2. Xuat danh sach vua nhap");
			System.out.println("3. Xuat danh sach ngau nhien");
			System.out.println("4. Sap xep giam dan va xuat danh sach");
			System.out.println("5. Tim va xoa ho ten nhap tu ban phim");
			System.out.println("6. ket thuc");
			
			System.out.print("nhap vao lua chon: ");
			b = scanner.nextInt();
			switch(b) {
			case 1:
				ds = nhap(scanner);
				break;
			case 2:
				xuat(ds);
				break;
			case 3:
				ngaunhien(ds);
				break;
			case 4:
				sapxep(ds);
				break;
			case 5:
				System.out.print("nhap vao ho va ten can xoa: ");
				scanner.nextLine();
				s = scanner.nextLine();
				xoa(ds, s);
				break;
			default:
				break;
			}
			
			System.out.print("ban co muon tiep tuc khong(Y/N): ");
			scanner.nextLine();
			chossen = scanner.nextLine();
			if(chossen.equals("N"))
				break;
		}
		
		scanner.close();
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		menu();
		
	}

}

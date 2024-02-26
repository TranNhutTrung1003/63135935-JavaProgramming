/**
 * 
 */
package tnt.tiil.edu;

import java.util.Scanner;

/**
 * 
 */
public class Bai1 {

	/**
	 * @param args
	 */
	
	public static String getHo(String hovaten) {
		int index = hovaten.indexOf(" ");
		if(index != -1) {
			String ho = hovaten.substring(0, index).toUpperCase();
			return ho;
		}
		return hovaten;
	}
	
	public static String getTen(String hovaten) {
		int index = hovaten.lastIndexOf(" ");
		if(index != -1) {
			String ten = hovaten.substring(index).toUpperCase();
			return ten;
		}
		return hovaten;
	}
	
	public static String getTenDem(String hovaten) {
		int indexFirst = hovaten.indexOf(" ");
		int indexLast = hovaten.lastIndexOf(" ");
		if(indexFirst != -1 && indexLast != -1 && indexFirst < indexLast) {
			String tenDem = hovaten.substring(indexFirst, indexLast);
			return tenDem;
		}
		return hovaten;
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String hoVaTen, ho, ten, tenDem;
		Scanner scanner = new Scanner(System.in);
		
		System.out.print("nhap vao ho va ten: ");
		hoVaTen = scanner.nextLine();
		
		ho = getHo(hoVaTen);
		ten = getTen(hoVaTen);
		tenDem = getTenDem(hoVaTen);
		
		if(ho != hoVaTen && ten != hoVaTen && tenDem != hoVaTen)
			System.out.println("ho: " + ho + "\n" + "Ten dem: " + tenDem + "\n" + "Ten: " + ten + "\n");
		else
			System.out.println("Ten ban nhap khong hop le");
		
		scanner.close();
	}

}

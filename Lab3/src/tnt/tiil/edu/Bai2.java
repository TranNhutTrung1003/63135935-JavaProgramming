/**
 * 
 */
package tnt.tiil.edu;

/**
 * 
 */
public class Bai2 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int kq;
		
		for(int i = 1; i < 10; i++) {
			for(int j = 1; j <= 10; j++) {
				kq = i * j;
				System.out.printf("%d * %d = %d\n", i, j, kq);
			}
			System.out.print("\n");
		}
	}

}
